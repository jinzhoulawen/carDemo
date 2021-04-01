package com.zw.web.service;

import com.zw.web.model.domian.CarConsultInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zw.web.model.domian.PageResult;
import com.zw.web.model.dto.CarConsultInfoDto;
import com.zw.web.model.dto.PageQuery;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
public interface CarConsultInfoService extends IService<CarConsultInfo> {

    String consultRelease(CarConsultInfo carConsultInfo);

    List<CarConsultInfoDto> selectConsult();

    PageResult<CarConsultInfoDto> queryConsultPaging(PageQuery pageQuery);

}
