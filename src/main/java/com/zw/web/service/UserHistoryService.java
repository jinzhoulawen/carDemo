package com.zw.web.service;

import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.User;
import com.zw.web.model.domian.UserHistory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-16
 */
public interface UserHistoryService extends IService<UserHistory> {
        int addUserHistory(UserHistory history, User user, Car car);
}
