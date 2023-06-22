package com.example.cryptocoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cryptocoin.databinding.ActivityCoinDetailsBinding;

public class CoinDetailsActivity extends AppCompatActivity {

    ActivityCoinDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoinDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CoinDetails");
    }
}