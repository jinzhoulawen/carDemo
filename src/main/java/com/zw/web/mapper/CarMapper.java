package com.zw.web.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zw.web.model.domian.Car;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface CarMapper extends BaseMapper<Car> {
    void UpdateCarHistory(int id);
}
