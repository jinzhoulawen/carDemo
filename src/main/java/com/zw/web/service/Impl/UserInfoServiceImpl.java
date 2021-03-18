package com.zw.web.service.Impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zw.web.mapper.CarMapper;
import com.zw.web.mapper.UserMapper;
import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.User;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<User> selectUser() {
        List<User> list=userMapper.selectList(null);
        return list;
    }
    public String selectUserByNameAndPW(User user, HttpServletRequest request, HttpServletResponse response) {
        //Map<User,User> map=new HashMap<>();
        HttpSession session= request.getSession();
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("username",user.getUsername()).eq("password",user.getPassword());
        try {
           List<User> list= userMapper.selectList(queryWrapper);
            for (User user1:list
                 ) {
                if (user1.getIdentity()==0){
                    session.setAttribute("username",user1.getUsername());
                    session.setAttribute("userId",user1.getId());
                    //session.setAttribute("username",user.getUsername());
                    return "普通用户";
                }else if (user1.getIdentity()==1){
                    session.setAttribute("username",user1.getUsername());
                    session.setAttribute("userId",user1.getId());
                    //session.setAttribute("username",user.getUsername());
                    return "管理员";
                }else {return "用户信息错误，请联系管理员";}

            }
        }catch (Exception e){
            e.printStackTrace();
            return "登录失败";
        }
        return "登录失败";
    }

    @Override
    public String interUser(User user) {
        //UpdateWrapper<User> userUpdateWrapper=new UpdateWrapper<>();
        int i=userMapper.insert(user);
        if (i==0)
            return "注册失败";
        else
            return "注册成功";
    }


//    public String addCarHistory( HttpServletRequest request, HttpServletResponse response) {
//        HttpSession session = request.getSession();
//        //UpdateWrapper<Car> wrapper=new UpdateWrapper<>();
//        //wrapper.set("car_history_numbers","car_history_numbers"+1).eq("id",session.getId());
//        //wrapper.set("historyNumbers",2).eq("id",1);
//        carMapper.updateCarHistroy(1);
//        return null;
//    }
    public String addColletion(User user){
//        this.carMapper.update(null,
//                Wrappers.<User>lambdaUpdate()
//
//                );
        return null;
    }
}
