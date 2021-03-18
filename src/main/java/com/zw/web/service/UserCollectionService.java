package com.zw.web.service;

import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.User;
import com.zw.web.model.domian.UserCollection;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-16
 */
public interface UserCollectionService extends IService<UserCollection> {
    int addConllection(Car car, HttpServletRequest req, HttpServletResponse resp);

}
