package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zw.web.model.domian.CarInfoDetails;
import com.zw.web.mapper.CarInfoDetailsMapper;
import com.zw.web.model.dto.CarInfoDetailsDto;
import com.zw.web.service.CarInfoDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-04-01
 */
@Service
public class CarInfoDetailsServiceImpl extends ServiceImpl<CarInfoDetailsMapper, CarInfoDetails> implements CarInfoDetailsService {
    @Autowired
    private CarInfoDetailsMapper carInfoDetailsMapper;
    @Override
    public List<CarInfoDetailsDto> selectCarDetails(int id) {
       // List<CarInfoDetailsDto> list=this.carInfoDetailsMapper.selectList(Wrappers.<CarInfoDetails>lambdaQuery().eq(CarInfoDetails::getId,id));
        return list;
    }
}
