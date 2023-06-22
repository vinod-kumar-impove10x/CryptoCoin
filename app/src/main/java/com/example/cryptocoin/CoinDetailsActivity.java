package com.example.cryptocoin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.cryptocoin.databinding.ActivityCoinDetailsBinding;
import com.example.cryptocoin.databinding.ActivityCryptoCoinsBinding;
import com.example.cryptocoin.model.CryptoCoin;
import com.example.cryptocoin.model.coindetails.CoinDetails;
import com.example.cryptocoin.model.coindetails.Tags;
import com.example.cryptocoin.network.coindetailsnetwork.CoinDetailsApi;
import com.example.cryptocoin.network.coindetailsnetwork.CoinDetailsService;
import com.example.cryptocoin.network.cryptocoinnetwork.CryptoCoinApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CoinDetailsActivity extends AppCompatActivity {

    ActivityCoinDetailsBinding binding;
     private String id;

    private CoinDetailsAdapter coinDetailsAdapter;

    private ArrayList<Tags> tags = new ArrayList<>();

    private CoinDetailsApi coinDetailsApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoinDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent().hasExtra("id")) {
            id = getIntent().getStringExtra("id");
        }
        getSupportActionBar().setTitle("CoinDetails");
        getTagDetails();
        setupAdapter();
        setupRecyclerView();
    }

    private void getTagDetails() {
        CoinDetailsApi coinDetailsApi = new CoinDetailsApi();
        CoinDetailsService coinDetailsService = coinDetailsApi.createCoinDetailsService();
        Call<CoinDetails> call = coinDetailsService.fetchCoinDetails(id);
        call.enqueue(new Callback<CoinDetails>() {
            @Override
            public void onResponse(Call<CoinDetails> call, Response<CoinDetails> response) {
               CoinDetails coinDetails = response.body();
               binding.setCoinDetails(coinDetails);
               coinDetailsAdapter.setTagDetails(coinDetails.getTags());
            }

            @Override
            public void onFailure(Call<CoinDetails> call, Throwable t) {

            }
        });
    }

    private void setupAdapter() {
        coinDetailsAdapter = new CoinDetailsAdapter();
        coinDetailsAdapter.setTagDetails(tags);
    }

    private void setupRecyclerView() {
        binding.detailTagsRv.setLayoutManager(new GridLayoutManager(this,3));
        binding.detailTagsRv.setAdapter(coinDetailsAdapter);
    }
}