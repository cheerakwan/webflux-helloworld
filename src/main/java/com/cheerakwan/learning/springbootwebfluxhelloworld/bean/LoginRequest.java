package com.cheerakwan.learning.springbootwebfluxhelloworld.bean;

import lombok.Data;

@Data
public class LoginRequest {

    private String user;
    private String password;
}
