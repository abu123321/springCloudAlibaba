package com.abu.mpboot.controller;


import com.abu.mpboot.handler.UserBlockHandler;
import com.abu.mpboot.handler.UserFallback;
import com.abu.mpboot.service.UserService;
import com.abu.ums.pojo.User;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    @SentinelResource(value = "all", blockHandlerClass = UserBlockHandler.class, blockHandler = "findAll", fallbackClass = UserFallback.class, fallback = "findAll")
    public ResponseEntity<List<User>> findAll() {
//        int a =1/0;
        List<User> list = userService.queryAllUser();
        return ResponseEntity.ok(list);
    }

    @GetMapping("hello")
    public String hello(@RequestParam("key") String key) {
        return "你好";
    }

}
