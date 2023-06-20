package com.example.cryptocoin.network;

import com.example.cryptocoin.model.CryptoCoin;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface CryptoCoinService {

    @GET("v1/coins")
    Call<List<CryptoCoin>> fetchCryptoCoins();
}
