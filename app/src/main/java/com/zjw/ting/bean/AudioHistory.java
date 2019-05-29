package com.zjw.ting.bean;

import java.io.Serializable;

public class AudioHistory implements Serializable {
    private String info;
    private String episodesUrl;
    private long currentPosition;
    private int position;

    public AudioHistory(String info, long currentPosition, String episodesUrl, int position) {
        this.info = info;
        this.episodesUrl = episodesUrl;
        this.currentPosition = currentPosition;
        this.position = position;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(long currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getEpisodesUrl() {
        return episodesUrl;
    }

    public void setEpisodesUrl(String episodesUrl) {
        this.episodesUrl = episodesUrl;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}