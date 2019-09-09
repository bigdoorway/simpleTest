package com.puyuan.service.impl;

import com.puyuan.dao.UserMapper;
import com.puyuan.pojo.User;
import com.puyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User findOne(String uid) {
        System.out.println("Service");
        return userMapper.findOne(uid);
    }


    public void a() {

    }
}
