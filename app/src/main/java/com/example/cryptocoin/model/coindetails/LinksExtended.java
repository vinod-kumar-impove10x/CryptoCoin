package com.example.cryptocoin.model.coindetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LinksExtended implements Serializable {

    private String url;
    private String type;
    @SerializedName("stats")
    private Stats stats;
}
