package com.abu.abucons.controller;

import com.abu.abucons.client.UserClient;
import com.abu.ums.pojo.User;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("cons")
@RestController
public class ConsController {

    @Autowired
    private UserClient userClient;

    @GetMapping("find")
    public String getUserInfo() {
        ResponseEntity<List<User>> listResponseEntity = this.userClient.findAll();
        List<User> users = listResponseEntity.getBody();
        return JSON.toJSONString(users);
    }

}
