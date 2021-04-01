package com.zw.web.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zw.web.model.domian.CarConsultInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zw.web.model.dto.CarConsultInfoDto;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
public interface CarConsultInfoMapper extends BaseMapper<CarConsultInfo> {
    List<CarConsultInfoDto> selectConsultListPage(Page page);
}
