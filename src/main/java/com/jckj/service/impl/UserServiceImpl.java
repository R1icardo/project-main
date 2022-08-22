package com.jckj.service.impl;

import com.jckj.mapper.UserMapper;
import com.jckj.model.User;
import com.jckj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Map findAll(int page, int limit) {
        List<User> list = userMapper.findAll((page - 1) * limit, limit);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",userMapper.count());
        map.put("data",list);
        return map;
    }
}
