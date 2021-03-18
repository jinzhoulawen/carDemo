package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zw.web.mapper.UserMapper;
import com.zw.web.model.domian.CarConsultInfo;
import com.zw.web.mapper.CarConsultInfoMapper;
import com.zw.web.model.domian.User;
import com.zw.web.model.dto.CarConsultInfoDto;
import com.zw.web.service.CarConsultInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zw.web.utils.ApacheBeanUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-18
 */
@Service
public class CarConsultInfoServiceImpl extends ServiceImpl<CarConsultInfoMapper, CarConsultInfo> implements CarConsultInfoService {

    private HttpSession session;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CarConsultInfoMapper carConsultInfoMapper;

    @Override
    public String consultRelease(CarConsultInfo carConsultInfo) {
//        User user = new User();
//        this.userMapper.selectById(session.getId()).getUsername();
       // carConsultInfo.setUid(Long.parseLong(session.getId()));
        try{
            this.baseMapper.insert(carConsultInfo);
            return "yes";
        }catch(Exception e){e.printStackTrace();}
        return "no";
    }

    @Override
    public List<CarConsultInfoDto> selectConsult() {
        CarConsultInfoDto carConsultInfoDto =new CarConsultInfoDto();
        List<CarConsultInfoDto> resultList= new ArrayList<>();
        List<CarConsultInfo> list=this.carConsultInfoMapper.selectList(null);
        for (CarConsultInfo consult:list
             ) {
            try{
                BeanUtils.copyProperties(carConsultInfoDto, consult);
                carConsultInfoDto.setUserName(this.userMapper.selectById(consult.getId()).getUsername());
                resultList.add(carConsultInfoDto);
            }catch(Exception e){e.printStackTrace();}

        }
        return resultList;
    }
}
