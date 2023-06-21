package com.example.cryptocoin.model.coindetails;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CoinDetails implements Serializable {
/*
Coin Details API : https://api.coinpaprika.com/v1/coins/btc-bitcoin
 */
    private String id;
    private String name;
    private String symbol;
    private Integer rank;
    @SerializedName("is_new")
    private boolean isNew;
    @SerializedName("is_active")
    private boolean isActive;
    private String type;
    private String logo;
    private List<Tags> tags;
    private List<Team> team;
    private String description;
    private String message;
    @SerializedName("open_source")
    private boolean openSource;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("development_status")
    private String developmentStatus;
    @SerializedName("hardware_wallet")
    private boolean hardwareWallet;
    @SerializedName("proof_type")
    private String proofType;
    @SerializedName("org_structure")
    private String orgStructure;
    @SerializedName("hash_algorithm")
    private String hashAlgorithm;
    private Links links;
    @SerializedName("links_extended")
    private List<LinksExtended> linksExtended;
    private Whitepaper whitepaper;
    @SerializedName("first_data_at")
    private String firstDataAt;
    @SerializedName("last_data_at")
    private String lastDataAt;

}
