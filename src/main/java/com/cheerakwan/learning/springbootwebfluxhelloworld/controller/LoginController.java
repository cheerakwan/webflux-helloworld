package com.cheerakwan.learning.springbootwebfluxhelloworld.controller;

import com.cheerakwan.learning.springbootwebfluxhelloworld.bean.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest req) {
        log.debug("User: {}", req.getUser());
        log.debug("Password: {}", req.getPassword());
    }
}
