package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zw.web.mapper.CarMapper;
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
    @Override
    public String addCarHistory(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        //UpdateWrapper<Car> wrapper=new UpdateWrapper<>();
        //wrapper.set("car_history_numbers","car_history_numbers"+1).eq("id",session.getId());
        //wrapper.set("historyNumbers",2).eq("id",1);
        carMapper.UpdateCarHistory(1);
        return null;
    }

    @Override
    public PageResult<Car> queryCarPaging(PageQuery pageQuery) {
        CarCondition carCondition=new CarCondition();
        try {
            ApacheBeanUtils.populate(carCondition, pageQuery.getParamMap());

        Page<Car> page = new Page<Car>(pageQuery.getCurrentPage(),pageQuery.getPageSize());
        page.setOptimizeCountSql(false);
        page.setRecords(this.baseMapper.selectCarListOPage(page,carCondition));
        return PageResultUtil.createPageResult(page, list -> {
            return list;
        }, pageQuery.getParamMap());
        }catch (Exception e){e.printStackTrace();}
        return null;

    }

}
