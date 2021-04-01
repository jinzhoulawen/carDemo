package com.zw.web.controller;


import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.CarConsultInfo;
import com.zw.web.model.domian.PageResult;
import com.zw.web.model.domian.User;
import com.zw.web.model.dto.CarConsultInfoDto;
import com.zw.web.model.dto.PageQuery;
import com.zw.web.service.CarConsultInfoService;
import com.zw.web.service.CarInfoService;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private CarInfoService carInfoService;

    @Autowired
    private CarConsultInfoService carConsultInfoService;

    @ResponseBody
    @PostMapping("/ban")
    public boolean ban(int uid){

        return userInfoService.ban(uid);
    }

    @ResponseBody
    @PostMapping("/unban")
    public boolean unBan(int uid){

        return userInfoService.unBan(uid);
    }

    @ResponseBody
    @PostMapping("/updateUser")
    public boolean updateUser(User user){

        return userInfoService.updateUser(user);
    }

    @ResponseBody
    @PostMapping(value = "/queryUserPage")
    PageResult<User> queryUserPaging(PageQuery pageQuery) {
        return this.userInfoService.queryUserPaging(pageQuery);
    }
    @PostMapping(value = "/queryCarpage")
    @ResponseBody
    PageResult<Car> queryCarPaging(PageQuery pageQuery){

        return this.carInfoService.queryCarPaging(pageQuery);
    }
    @ResponseBody
    @PostMapping("/insertCar")
    public boolean insertCar(Car car){

        return carInfoService.insertCar(car);
    }

    @ResponseBody
    @PostMapping("/updateCar")
    public boolean updateUser(Car car){

        return carInfoService.updateCar(car);
    }

    @ResponseBody
    @PostMapping("/releaseConsult")
    public boolean releaseConsult(CarConsultInfo carConsultInfo){

        return carInfoService.insertConsult(carConsultInfo);
    }
    @ResponseBody
    @PostMapping("/queryConsultPage")
    PageResult<CarConsultInfoDto> queryConsultPage(PageQuery pageQuery){

        return this.carConsultInfoService.queryConsultPaging(pageQuery);
    }
}
