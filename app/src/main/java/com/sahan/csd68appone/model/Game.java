package com.sahan.csd68appone.model;

import java.util.List;

public class Game {
    private int id;
    private String name;
    private String company;
    private String gameLogoURL;
    private String imgURL;
    private String overallRate;
    private List<String> comments;

    public Game() {
    }

    public Game(String name, String company, String gameLogoURL, String imgURL, String overallRate) {
        this.name = name;
        this.company = company;
        this.gameLogoURL = gameLogoURL;
        this.imgURL = imgURL;
        this.overallRate = overallRate;
    }

    public String getGameLogoURL() {
        return gameLogoURL;
    }

    public void setGameLogoURL(String gameLogoURL) {
        this.gameLogoURL = gameLogoURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getOverallRate() {
        return overallRate;
    }

    public void setOverallRate(String overallRate) {
        this.overallRate = overallRate;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
