package com.zw.web.controller;

import com.zw.web.model.domian.User;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserCheckController {

    @Autowired
    private UserInfoService userInfoService;

    private HttpSession session;
    @ResponseBody
    @GetMapping(value = "/login")
    public String Login(@RequestParam("user") User user, HttpServletRequest req, HttpServletResponse resp){

        return this.userInfoService.selectUserByNameAndPW(user,req,resp);

    }
    @ResponseBody
    @GetMapping(value = "/register")
    public String Register(@RequestParam("user") User user){

        return this.userInfoService.interUser(user);
    }
    public String Collection(@RequestParam("user") User user){

        return null;
    }
}
