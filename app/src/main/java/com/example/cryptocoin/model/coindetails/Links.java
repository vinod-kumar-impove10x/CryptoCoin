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

    public List<String> getExplorer() {
        return explorer;
    }

    public void setExplorer(List<String> explorer) {
        this.explorer = explorer;
    }

    public List<String> getFacebook() {
        return facebook;
    }

    public void setFacebook(List<String> facebook) {
        this.facebook = facebook;
    }

    public List<String> getReddit() {
        return reddit;
    }

    public void setReddit(List<String> reddit) {
        this.reddit = reddit;
    }

    public List<String> getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(List<String> sourceCode) {
        this.sourceCode = sourceCode;
    }

    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    public List<String> getYoutube() {
        return youtube;
    }

    public void setYoutube(List<String> youtube) {
        this.youtube = youtube;
    }
}
