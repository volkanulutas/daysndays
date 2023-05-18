package com.vem.daysndays.auth.data.model;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;

    private String password;
}
