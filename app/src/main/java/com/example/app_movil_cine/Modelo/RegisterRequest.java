package com.example.app_movil_cine.Modelo;

public class RegisterRequest {
    private String email;
    private String password;
    private String nickname;
    private String categoria;

    public RegisterRequest(String email, String password,String nickname,String categoria) {
        this.email = email;
        this.password = password;
        this.categoria = categoria;
        this.nickname = nickname;
    }
}
