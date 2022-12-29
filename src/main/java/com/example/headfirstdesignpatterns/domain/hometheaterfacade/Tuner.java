package com.example.headfirstdesignpatterns.domain.hometheaterfacade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tuner {
    private String description;

    public Tuner(String description) {
        this.description = description;
    }

    public void on() {
        log.info(description + " on");
    }

    public void off() {
        log.info(description + " off");
    }

    public void setFrequency(double frequency) {
        log.info(description + " setting frequency to " + frequency);
    }

    public void setAm() {
        log.info(description + " setting AM mode");
    }

    public void setFm() {
        log.info(description + " setting FM mode");
    }

    public String toString() {
        return description;
    }
}
