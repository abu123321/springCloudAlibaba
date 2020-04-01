package com.abu.mpboot.service;

import com.abu.mpboot.mapper.UserMapper;
import com.abu.ums.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAllUser() {
        return this.userMapper.selectList(null);
    }
}
