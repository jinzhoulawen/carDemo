package com.zw.web.controller;

import com.zw.web.model.domian.User;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

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
    @ResponseBody
    @GetMapping(value = "/test")
    public String test(){
        return "ok";
    }
}
