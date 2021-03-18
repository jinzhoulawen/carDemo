package com.zw.web.service.Impl;

import com.zw.web.mapper.UserHistoryMapper;
import com.zw.web.model.domian.Car;
import com.zw.web.model.domian.User;
import com.zw.web.model.domian.UserHistory;
import com.zw.web.mapper.UserHistoryMapper;
import com.zw.web.service.UserHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-03-16
 */
@Service
public class UserHistoryServiceImpl extends ServiceImpl<UserHistoryMapper, UserHistory> implements UserHistoryService {
    @Autowired
    private UserHistoryMapper historyMapper;
    @Override
    public int addUserHistory(UserHistory history, User user, Car car) {
        history.setUid(user.getId());
        history.setCid(car.getId());
        historyMapper.insert(history);
        return 0;
    }
}
