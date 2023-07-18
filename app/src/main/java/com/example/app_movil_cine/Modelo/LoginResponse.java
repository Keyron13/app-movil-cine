package com.example.app_movil_cine.Modelo;

public class LoginResponse {
    private String access_token,message;

    public LoginResponse(String access_token, String message) {
        this.access_token = access_token;
        this.message = message;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
