package com.example.cryptocoin.cryptocoins;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocoin.databinding.CryptoCoinItemBinding;
import com.example.cryptocoin.model.CryptoCoin;

import java.util.List;

public class CryptoCoinAdapter extends RecyclerView.Adapter<CryptoCoinViewHolder> {

    private List<CryptoCoin> cryptoCoins;

    private OnItemActionListener listener;

    public void setCryptoCoins(List<CryptoCoin> cryptoCoinList) {
        this.cryptoCoins = cryptoCoinList;
        notifyDataSetChanged();

    }

    public void setOnItemActionListener(OnItemActionListener listener) {
        this.listener = listener;
    }
    @NonNull
    @Override
    public CryptoCoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptoCoinItemBinding binding = CryptoCoinItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        CryptoCoinViewHolder cryptoCoinViewHolder = new CryptoCoinViewHolder(binding);
        return cryptoCoinViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoCoinViewHolder holder, int position) {
        CryptoCoin cryptoCoin = cryptoCoins.get(position);
        holder.binding.setCryptoCoin(cryptoCoin);
        holder.binding.getRoot().setOnClickListener(v -> {
            listener.OnClick(cryptoCoin.getId());
        });

    }

    @Override
    public int getItemCount() {
        return cryptoCoins.size();
    }
}
