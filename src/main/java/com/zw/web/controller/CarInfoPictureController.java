package com.zw.web.controller;


import com.zw.web.model.dto.CarInfoPictureDto;
import com.zw.web.service.CarInfoPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
@RestController
@RequestMapping("/car/pictrue")
public class CarInfoPictureController {

    @Autowired
    private CarInfoPictureService carInfoPictureService;

   @ResponseBody
   @GetMapping("/submit")
    public CarInfoPictureDto submitCarPicture(@RequestBody CarInfoPictureDto carInfoPictureDto){
        return this.carInfoPictureService.submitCarPicture(carInfoPictureDto);
    }
}

