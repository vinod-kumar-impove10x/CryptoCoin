package com.example.cryptocoin.cryptocoins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.cryptocoin.coindetails.tagsdetails.CoinDetailsActivity;
import com.example.cryptocoin.databinding.ActivityCryptoCoinsBinding;
import com.example.cryptocoin.model.CryptoCoin;
import com.example.cryptocoin.network.cryptocoinnetwork.CryptoCoinApi;
import com.example.cryptocoin.network.cryptocoinnetwork.CryptoCoinService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoCoinsActivity extends AppCompatActivity {

    private ActivityCryptoCoinsBinding binding;

    private List<CryptoCoin> cryptoCoins = new ArrayList<>();

    private CryptoCoinAdapter cryptoCoinAdapter;

    private CryptoCoinApi cryptoCoinApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptoCoinsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CryptoCoins");
        getCryptoCoins();
        setupAdapter();
        setupRecyclerView();
    }

    private void getCryptoCoins() {
        CryptoCoinApi cryptoCoinApi = new CryptoCoinApi();
        CryptoCoinService cryptoCoinService = cryptoCoinApi.createCryptoCoinService();
        Call<List<CryptoCoin>> call = cryptoCoinService.fetchCryptoCoins();
        call.enqueue(new Callback<List<CryptoCoin>>() {
            @Override
            public void onResponse(Call<List<CryptoCoin>> call, Response<List<CryptoCoin>> response) {
                List<CryptoCoin> coins = response.body();
                cryptoCoinAdapter.setCryptoCoins(coins);
            }

            @Override
            public void onFailure(Call<List<CryptoCoin>> call, Throwable t) {

            }
        });
    }

    private void setupRecyclerView() {
        binding.cryptoCoinsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.cryptoCoinsRv.setAdapter(cryptoCoinAdapter);
    }

    private void setupAdapter() {
        cryptoCoinAdapter = new CryptoCoinAdapter();
        cryptoCoinAdapter.setCryptoCoins(cryptoCoins);
        cryptoCoinAdapter.setOnItemActionListener(new OnItemActionListener() {
            @Override
            public void OnClick(String id) {
                handleIntent(id);
            }
        });
    }

    private void handleIntent(String id) {
        Intent intent = new Intent(this, CoinDetailsActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}