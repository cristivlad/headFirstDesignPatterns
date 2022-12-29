package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        log.info(description + " on");
    }

    public void off() {
        log.info(description + " off");
    }

    public void eject() {
        title = null;
        log.info(description + " eject");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        log.info(description + " playing " + title );
    }

    public void play(int track) {
        if (title == null) {
            log.info(description + " can't play track " + currentTrack +
                    ", no cd inserted");
        } else {
            currentTrack = track;
            log.info(description + " playing track " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        log.info(description + " stopped");
    }

    public void pause() {
        log.info(description + " paused " + title );
    }

    public String toString() {
        return description;
    }
}
