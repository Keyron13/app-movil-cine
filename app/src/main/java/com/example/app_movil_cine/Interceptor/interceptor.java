package com.example.app_movil_cine.Interceptor;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
public class interceptor implements Interceptor  {
    private String authToken;

    public interceptor(String token) {
        this.authToken = token;
}

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request.Builder builder = originalRequest.newBuilder()
                .header("Authorization", "Bearer " + authToken);
        Request newRequest = builder.build();
        return chain.proceed(newRequest);
    }
}
