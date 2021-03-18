package com.zw.web.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zw.web.mapper.UserCollectionMapper;
import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.User;
import com.zw.web.model.domian.UserCollection;

import com.zw.web.service.UserCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-16
 */
@Service
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {
    @Autowired
    private UserCollectionMapper collectionMapper;
    @Override
    public int addConllection(UserCollection userCollection, Car car, User user) {
        //userCollection.setId();
        userCollection.setUid(user.getId());
        userCollection.setCid(car.getId());
        collectionMapper.insert(userCollection);
        return 0;
    }


}
