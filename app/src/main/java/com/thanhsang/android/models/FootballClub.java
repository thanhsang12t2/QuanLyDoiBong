package com.thanhsang.android.models;

import java.io.Serializable;

public class FootballClub implements Serializable {
    private String name;
    private String region;
    private int logo;
    private int win;
    private int lose;
    private int draw;

    public FootballClub() {
    }

    public FootballClub(String name, String region, int logo) {

        this.name = name;
        this.region = region;
        this.logo = logo;
    }

    public FootballClub(String name, String region, int logo, int win, int lose, int draw) {
        this.name = name;
        this.region = region;
        this.logo = logo;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }


}
