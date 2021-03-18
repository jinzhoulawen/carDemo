package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zw.web.mapper.CarMapper;
import com.zw.web.mapper.UserMapper;
import com.zw.web.model.domian.Car;
import com.zw.web.model.dto.PageQuery;
import com.zw.web.model.domian.PageResult;
import com.zw.web.model.dto.CarCondition;
import com.zw.web.service.CarInfoService;
import com.zw.web.utils.ApacheBeanUtils;
import com.zw.web.utils.PageResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class CarInfoServiceImpl extends ServiceImpl<CarMapper, Car> implements CarInfoService {
    @Autowired
    private CarMapper carMapper;

    @Autowired
    private UserMapper userMapper;

    private HttpSession session;

    //车辆浏览数加1
    @Override
    public String addCarHistory(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        Car car =new Car();
        car=this.carMapper.selectById(1);
        carMapper.update(car,Wrappers.<Car>lambdaUpdate().eq(Car::getId,1)
                        .set(Car::getCarHistoryNumbers,car.getCarHistoryNumbers()+1)
                        .set(Car::getCarHeat,car.getCarHeat()+1));
        return null;
    }

    //车辆收藏数加1
    @Override
    public String addCarCollection(HttpServletRequest request, HttpServletResponse response) {
        Car car =new Car();
        car=this.carMapper.selectById(1);
        if (car.getCarCollectionNumbers()==null)
        car.setCarCollectionNumbers(0L);
        try{
            carMapper.update(car, Wrappers.<Car>lambdaUpdate().eq(Car::getId,1)
                    .set(Car::getCarCollectionNumbers,car.getCarCollectionNumbers()+1)
                    .set(Car::getCarHeat,car.getCarHeat()+10));

            System.out.println("yes");
        }catch(Exception e){e.printStackTrace();}

        return null;
    }

    //分页查询车辆信息
    @Override
    public PageResult<Car> queryCarPaging(PageQuery pageQuery) {
        CarCondition carCondition=new CarCondition();
        try {
            ApacheBeanUtils.populate(carCondition, pageQuery.getParamMap());

        Page<Car> page = new Page<Car>(pageQuery.getCurrentPage(),pageQuery.getPageSize());
        page.setOptimizeCountSql(false);
        page.setRecords(this.baseMapper.selectCarListPage(page,carCondition));
        return PageResultUtil.createPageResult(page, list -> {
            return list;
        }, pageQuery.getParamMap());
        }catch (Exception e){e.printStackTrace();}
        return null;

    }

}
