package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TheaterLights {
    private String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        log.info(description + " on");
    }

    public void off() {
        log.info(description + " off");
    }

    public void dim(int level) {
        log.info(description + " dimming to " + level  + "%");
    }

    public String toString() {
        return description;
    }
}
