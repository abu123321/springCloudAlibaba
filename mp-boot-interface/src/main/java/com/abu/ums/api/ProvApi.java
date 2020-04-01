package com.abu.ums.api;

import com.abu.ums.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProvApi {
    @GetMapping("user/findAll")
    ResponseEntity<List<User>> findAll();
}
