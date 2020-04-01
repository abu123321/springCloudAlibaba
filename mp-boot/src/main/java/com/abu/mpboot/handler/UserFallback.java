package com.abu.mpboot.handler;

import com.abu.ums.pojo.User;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import java.util.ArrayList;
import java.util.List;

public class UserFallback {
    public static List<User> findAll(Throwable throwable) {
        User user = new User();
        user.setName("工程师正快马加鞭修复中，请稍后再试！"+"=>>"+throwable.getMessage());
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
