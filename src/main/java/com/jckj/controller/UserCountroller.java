package com.jckj.controller;

import com.jckj.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RequestMapping("user")
@RestController
public class UserCountroller {

    @Resource
    UserService userService;

    @RequestMapping("findAll")
    public Map findAll(int page, int limit){
        return userService.findAll(page,limit);
    }
}
