package com.example.cryptocoin.coindetails;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocoin.coindetails.CoinDetailViewHolder;
import com.example.cryptocoin.databinding.CoinTagsItemBinding;
import com.example.cryptocoin.model.coindetails.Tags;

import java.util.List;

public class CoinDetailsAdapter extends RecyclerView.Adapter<CoinDetailViewHolder> {

    private List<Tags> tagsList;


    public void setTagDetails(List<Tags> tagsList) {
        this.tagsList = tagsList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CoinDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CoinTagsItemBinding binding = CoinTagsItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        CoinDetailViewHolder coinDetailViewHolder = new CoinDetailViewHolder(binding);
        return coinDetailViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoinDetailViewHolder holder, int position) {
        Tags tags = tagsList.get(position);
        holder.binding.setTags(tags);

    }

    @Override
    public int getItemCount() {
        return tagsList.size();
    }
}
