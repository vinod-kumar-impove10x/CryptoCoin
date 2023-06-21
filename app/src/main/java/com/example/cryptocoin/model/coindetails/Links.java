package com.example.cryptocoin.model.coindetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Links implements Serializable {
    @SerializedName("explorer")
    private List<String> explorer;
    @SerializedName("facebook")
    private List<String> facebook;
    @SerializedName("reddit")
    private List<String> reddit;
    @SerializedName("source_code")
    private List<String> sourceCode;
    @SerializedName("website")
    private List<String> website;
    @SerializedName("youtube")
    private List<String> youtube;

}
