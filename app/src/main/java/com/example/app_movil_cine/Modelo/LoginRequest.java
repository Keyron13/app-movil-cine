package com.example.app_movil_cine.Modelo;

public class LoginRequest {

    private String email;
    private String password;

    public LoginRequest(String username, String password) {
        this.email = username;
        this.password = password;
    }
}
