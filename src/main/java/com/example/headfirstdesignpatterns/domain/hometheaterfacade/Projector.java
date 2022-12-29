package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        log.info(description + " on");
    }

    public void off() {
        log.info(description + " off");
    }

    public void wideScreenMode() {
        log.info(description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        log.info(description + " in tv mode (4x3 aspect ratio)");
    }

    public String toString() {
        return description;
    }
}
