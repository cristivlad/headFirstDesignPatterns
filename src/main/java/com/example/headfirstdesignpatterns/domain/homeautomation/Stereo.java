package com.example.headfirstdesignpatterns.domain.homeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        log.info(location + " Stereo is on!");
    }

    public void off() {
        log.info(location + " Stereo is off!");
    }

    public void setCd() {
        log.info(location + " Stereo is set for CD input!");
    }

    public void setDvd() {
        log.info(location + " Stereo is set for DVD input!");
    }

    public void setRadio() {
        log.info(location + " Stereo is set for Radio input!");
    }

    public void setVolume(int volume) {
        log.info(location + " Stereo volume is set to: " + volume);
    }
}
