package com.zw.web.controller;

import com.zw.web.model.domian.PageResult;
import com.zw.web.model.domian.User;
import com.zw.web.model.dto.PageQuery;
import com.zw.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @PostMapping(value = "/queryUserPage")
    PageResult<User> queryUserPaging(PageQuery pageQuery) {
        return this.userInfoService.queryUserPaging(pageQuery);
    }

    @ResponseBody
    @GetMapping(value = "/test")
    public String test() {
        return "admin-index";
    }
}
