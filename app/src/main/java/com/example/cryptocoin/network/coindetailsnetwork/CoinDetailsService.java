package com.example.cryptocoin.network.coindetailsnetwork;

import com.example.cryptocoin.model.coindetails.CoinDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CoinDetailsService {

    @GET("v1/coins/{id}")
    Call<CoinDetails> fetchCoinDetails(@Path("id") String id);
}
