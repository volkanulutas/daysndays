package com.vem.daysndays.auth.data.model;

import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {

    private String email;

    private Set<String> role;

    private String password;
}