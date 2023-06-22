package com.example.cryptocoin;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocoin.coindetails.CoinDetailViewHolder;
import com.example.cryptocoin.databinding.CoinTagsItemBinding;
import com.example.cryptocoin.databinding.TeamMembersItemBinding;
import com.example.cryptocoin.model.coindetails.Tags;
import com.example.cryptocoin.model.coindetails.Team;

import java.util.List;

public class TeamMembersAdapter extends RecyclerView.Adapter<TeamMemberViewHolder> {

    private List<Team> teams;

    public void setTeamDetails(List<Team> teamList) {
        this.teams = teamList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TeamMemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TeamMembersItemBinding binding = TeamMembersItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        TeamMemberViewHolder teamMemberViewHolder = new TeamMemberViewHolder(binding);
        return teamMemberViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeamMemberViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.binding.setTeamMembers(team);

    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
