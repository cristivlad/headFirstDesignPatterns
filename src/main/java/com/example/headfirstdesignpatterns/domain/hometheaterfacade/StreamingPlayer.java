package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamingPlayer {
    private String description;
    private int currentChapter;
    private String movie;

    public StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() {
        log.info(description + " on");
    }

    public void off() {
        log.info(description + " off");
    }

    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        log.info(description + " playing \"" + movie + "\"");
    }

    public void play(int chapter) {
        if (movie == null) {
            log.info(description + " can't play chapter " + chapter + " no movie selected");
        } else {
            currentChapter = chapter;
            log.info(description + " playing chapter " + currentChapter + " of \"" + movie + "\"");
        }
    }

    public void stop() {
        currentChapter = 0;
        log.info(description + " stopped \"" + movie + "\"");
    }

    public void pause() {
        log.info(description + " paused \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        log.info(description + " set two channel audio");
    }

    public void setSurroundAudio() {
        log.info(description + " set surround audio");
    }

    public String toString() {
        return description;
    }
}
