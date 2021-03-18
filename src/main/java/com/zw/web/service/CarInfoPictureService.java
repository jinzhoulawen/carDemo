package com.zw.web.service;

import com.zw.web.model.domian.CarInfoPicture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zw.web.model.dto.CarInfoPictureDto;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
public interface CarInfoPictureService extends IService<CarInfoPicture> {
        CarInfoPictureDto submitCarPicture(CarInfoPictureDto carInfoPictureDto);
}
