package com.zw.web.mapper;

import com.zw.web.model.domian.CarInfoDetails;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zw.web.model.dto.CarInfoDetailsDto;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-04-01
 */
public interface CarInfoDetailsMapper extends BaseMapper<CarInfoDetails> {
    List<CarInfoDetailsDto> selectCarInfoAndDetails(Long id);
}
