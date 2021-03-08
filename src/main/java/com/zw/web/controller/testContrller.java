package com.zw.web.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testContrller {
   @RequestMapping("/hello")
    public String sayHello(){
      return "sayhello";
  }
}
