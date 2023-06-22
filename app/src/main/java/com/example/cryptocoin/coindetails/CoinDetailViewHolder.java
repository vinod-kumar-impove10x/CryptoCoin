package com.example.cryptocoin.coindetails;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocoin.databinding.CoinTagsItemBinding;

public class CoinDetailViewHolder extends RecyclerView.ViewHolder {

    CoinTagsItemBinding binding;
    public CoinDetailViewHolder(CoinTagsItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
