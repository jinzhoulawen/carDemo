package com.zw.web.service;

import com.zw.web.model.domian.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserInfoService {
    List<User> selectUser();
    String selectUserByNameAndPW(User user, HttpServletRequest request, HttpServletResponse response);
    String interUser(User user);
    //String addCarHistory( HttpServletRequest request, HttpServletResponse response);
}
