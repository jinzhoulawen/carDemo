package com.zw.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zw.web.model.domian.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> selectUserListPage(Page page);
}
