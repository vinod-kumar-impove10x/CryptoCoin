package com.example.cryptocoin.model.coindetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tags implements Serializable {

    private String id;
    private String name;
    @SerializedName("coin_counter")
    private Integer coinCounter;
    @SerializedName("ico_counter")
    private Integer icoCounter;
}
