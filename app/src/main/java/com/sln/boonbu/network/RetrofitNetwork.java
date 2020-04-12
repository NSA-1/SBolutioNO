package com.sln.boonbu.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitNetwork {

    public RetrofitNetwork() {
    }

    private OkHttpClient setHttpClient()
    {
        OkHttpClient.Builder client= new OkHttpClient.Builder();
        client.readTimeout(60, TimeUnit.SECONDS);
        client.writeTimeout(60, TimeUnit.SECONDS);
        client.connectTimeout(60, TimeUnit.SECONDS);

        return client.build();
    }


    public Retrofit serviceBuilder(String BaseUrl)
    {
        return new Retrofit.Builder()
                .baseUrl(BaseUrl).client(setHttpClient())
                .addConverterFactory((GsonConverterFactory.create()))
                .build();
    }
}
