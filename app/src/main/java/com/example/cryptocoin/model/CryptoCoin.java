package com.example.cryptocoin.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CryptoCoin implements Serializable {

  private String id;
  private String name;
  private String symbol;
  private Integer rank;
  @SerializedName("is_new")
  private boolean isNew ;
  @SerializedName("is_active")
  private boolean isActive;
  private String type;
}
