package com.example.cryptocoin.cryptocoins;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocoin.databinding.CryptoCoinItemBinding;

public class CryptoCoinViewHolder extends RecyclerView.ViewHolder {

    CryptoCoinItemBinding binding;

    public CryptoCoinViewHolder(CryptoCoinItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
