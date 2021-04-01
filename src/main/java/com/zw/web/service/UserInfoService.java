package com.zw.web.service;

import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.PageResult;
import com.zw.web.model.domian.User;
import com.zw.web.model.dto.PageQuery;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserInfoService {
    List<User> selectUser();
    String selectUserByNameAndPW(User user, HttpServletRequest request, HttpServletResponse response);
    String interUser(User user);
    PageResult<User> queryUserPaging(PageQuery pageQuery);
    //String addCarHistory( HttpServletRequest request, HttpServletResponse response);
    Boolean ban(int uid);
    Boolean unBan(int uid);
    Boolean updateUser(User user);
}
