package com.zw.web.controller;

import com.zw.web.mapper.CarMapper;
import com.zw.web.service.CarInfoService;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RestController
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    private CarInfoService carInfoService;

    //车辆详情
    @GetMapping(value = "/cardetails")
    public String CarDetails(HttpServletRequest request, HttpServletResponse response){
        //浏览记录加1
        this.carInfoService.addCarHistory(request,response);
        return null;
    }
}
