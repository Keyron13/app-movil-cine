package com.example.app_movil_cine.Interface;
import com.example.app_movil_cine.Modelo.LoginRequest;
import com.example.app_movil_cine.Modelo.LoginResponse;
import com.example.app_movil_cine.Modelo.RegisterRequest;
import com.example.app_movil_cine.Modelo.RegisterResponse;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.Call;
public interface api_usuario_server {
    @POST("login")
    Call<LoginResponse> getLogin(@Body LoginRequest loginrequest);
    @POST("register")
    Call<RegisterResponse> getRegister(@Body RegisterRequest registerRequest);

    @POST("logout")
    Call<POST> getLogout();

    @GET("user-profile")
    Call<GET> Profile();

}


