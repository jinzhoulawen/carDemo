package com.zw.web.controller;

import com.zw.web.model.domian.User;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testContrller {
    @Autowired
    private UserInfoService userInfoService;
   @RequestMapping("/hello")
    public String sayHello(){
//       List<User> list= userInfoService.selectUser();
//       list.forEach(System.out::println);

       return "sayhello";
  }
}
