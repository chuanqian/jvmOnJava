package com.wangzhen.springx.demo.web;

import com.wangzhen.springx.demo.service.IUserService;
import com.wangzhen.springx.ioc.annotation.Autowired;
import com.wangzhen.springx.ioc.annotation.Component;

/**
 * Description:
 * Datetime:    2020/10/25   4:53 下午
 * Author:   王震
 */
@Component
public class UserController {

    @Autowired
    IUserService userService;
}