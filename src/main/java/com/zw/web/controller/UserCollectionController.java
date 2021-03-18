package com.zw.web.controller;


import com.zw.web.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-03-16
 */
@RestController
@RequestMapping("/car/collection")
public class UserCollectionController {
    @Autowired
    private CarInfoService carInfoService;
    @ResponseBody
    @GetMapping("/add")
    public String addCarCollection(HttpServletRequest request, HttpServletResponse response){
        return carInfoService.addCarCollection(request,response);
    }
}

