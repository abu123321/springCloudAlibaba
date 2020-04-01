package com.abu.mpboot.handler;

import com.abu.ums.pojo.User;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import java.util.ArrayList;
import java.util.List;

public class UserBlockHandler {
    public static List<User> findAll(BlockException b) {
        User user = new User();
        user.setName("当前服务器正忙！");
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }
}
