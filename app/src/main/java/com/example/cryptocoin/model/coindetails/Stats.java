package com.example.cryptocoin.model.coindetails;

import java.io.Serializable;

public class Stats implements Serializable {

    private Integer subscribers;
    private Integer contributors;
    private Integer stars;
    private Integer followers;

    public Integer getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    public Integer getContributors() {
        return contributors;
    }

    public void setContributors(Integer contributors) {
        this.contributors = contributors;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }
}
