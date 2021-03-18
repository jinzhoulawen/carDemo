package com.zw.web.controller;

import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.PageResult;
import com.zw.web.model.dto.PageQuery;
import com.zw.web.model.dto.test;
import com.zw.web.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    private CarInfoService carInfoService;

    @GetMapping(value = "/querypaging")
    @ResponseBody
    PageResult<Car> queryCarPaging(@RequestParam("query") PageQuery pageQuery){
        //@RequestParam("query") PageQuery pageQuery
        //System.out.println(map);
        //return null;
        return this.carInfoService.queryCarPaging(pageQuery);
    }

    //车辆详情
    @GetMapping(value = "/cardetails")
    public String CarDetails(HttpServletRequest request, HttpServletResponse response){
        //浏览记录加1
        this.carInfoService.addCarHistory(request,response);
        return null;
    }

}
