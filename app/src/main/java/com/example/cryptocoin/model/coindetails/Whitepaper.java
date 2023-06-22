package com.example.cryptocoin.model.coindetails;

import java.io.Serializable;

public class Whitepaper implements Serializable {

    private String link;
    private String thumbnail;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
