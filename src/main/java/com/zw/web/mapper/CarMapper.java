package com.zw.web.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zw.web.model.domian.Car;
import com.zw.web.model.dto.CarCondition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarMapper extends BaseMapper<Car> {
    void UpdateCarHistory(int id);
    List<Car>selectCarListOPage(Page page, @Param("condition")CarCondition carCondition);
}
