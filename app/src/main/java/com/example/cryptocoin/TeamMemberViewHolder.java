package com.example.cryptocoin;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocoin.databinding.TeamMembersItemBinding;

public class TeamMemberViewHolder extends RecyclerView.ViewHolder {

    TeamMembersItemBinding binding;

    public TeamMemberViewHolder(TeamMembersItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
