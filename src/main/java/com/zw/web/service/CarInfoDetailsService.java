package com.zw.web.service;

import com.zw.web.model.domian.CarInfoDetails;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zw.web.model.dto.CarInfoDetailsDto;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-04-01
 */
public interface CarInfoDetailsService extends IService<CarInfoDetails> {
        List<CarInfoDetailsDto> selectCarDetails(int id);
}
