package com.example.cryptocoin.network.coindetailsnetwork;

import com.example.cryptocoin.model.coindetails.CoinDetails;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinDetailsService {

    @GET("v1/coins/btc-bitcoin")
    Call<CoinDetails> fetchCoinDetails();
}
