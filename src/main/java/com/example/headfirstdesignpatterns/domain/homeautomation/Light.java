package com.example.headfirstdesignpatterns.domain.homeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        log.info(location + " Light is on!");
    }

    public void off() {
        log.info(location + " Light is off!");
    }
}
