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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    private HttpSession session;
    @Autowired
    private UserCollectionMapper collectionMapper;
    @Override
    public int addConllection(Car car, HttpServletRequest req, HttpServletResponse resp) {
        //userCollection.setId();
        UserCollection userCollection = new UserCollection();
        userCollection.setUid( Long.parseLong(session.getId()));
        userCollection.setCid(car.getId());
        collectionMapper.insert(userCollection);
        return 0;
    }


}
