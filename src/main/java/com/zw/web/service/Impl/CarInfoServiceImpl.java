package com.zw.web.service.Impl;

import com.zw.web.mapper.CarMapper;
import com.zw.web.model.domian.Car;
import com.zw.web.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class CarInfoServiceImpl implements CarInfoService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public String addCarHistory(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        //UpdateWrapper<Car> wrapper=new UpdateWrapper<>();
        //wrapper.set("car_history_numbers","car_history_numbers"+1).eq("id",session.getId());
        //wrapper.set("historyNumbers",2).eq("id",1);
        carMapper.UpdateCarHistory(1);
        return null;
    }
    
}
