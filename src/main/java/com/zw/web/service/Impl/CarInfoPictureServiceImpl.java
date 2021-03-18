package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.zw.web.model.domian.CarInfoPicture;
import com.zw.web.mapper.CarInfoPictureMapper;
import com.zw.web.model.domian.PubFile;
import com.zw.web.model.dto.CarInfoPictureDto;
import com.zw.web.service.CarInfoPictureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zw.web.service.PubFileService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
@Service
public class CarInfoPictureServiceImpl extends ServiceImpl<CarInfoPictureMapper, CarInfoPicture> implements CarInfoPictureService {

    @Autowired
    private PubFileService pubFileService;

    @Override
    public CarInfoPictureDto submitCarPicture(CarInfoPictureDto carInfoPictureDto) {

        CarInfoPicture entity = new CarInfoPicture();

        BeanUtils.copyProperties(carInfoPictureDto,entity);

        List<PubFile> fileList = this.pubFileService.batchGetIdEntityListByNames(carInfoPictureDto.getName());

        if (CollectionUtils.isNotEmpty(fileList) )
        for (PubFile p:fileList
             ) {
           entity.setPictureId(p.getId()) ;
           this.save(entity);
        }

        return carInfoPictureDto;
    }
}
