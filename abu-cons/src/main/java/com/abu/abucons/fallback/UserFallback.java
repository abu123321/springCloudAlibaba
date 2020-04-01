package com.abu.abucons.fallback;

import com.abu.abucons.client.UserClient;
import com.abu.ums.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFallback implements UserClient {
    @Override
    public ResponseEntity<List<User>> findAll() {

        ArrayList<User> list = new ArrayList<>();
        User user = new User();
        user.setName("服务器异常！");
        list.add(user);
        return ResponseEntity.ok(list);
    }
}
