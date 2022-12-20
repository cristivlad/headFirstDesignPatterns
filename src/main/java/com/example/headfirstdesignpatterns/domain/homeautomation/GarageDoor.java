package com.example.headfirstdesignpatterns.domain.homeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GarageDoor {

    public void up() {
        log.info("Garage Door is up!");
    }

    public void down() {
        log.info("Garage Door is down!");
    }

    public void stop() {
        log.info("Garage Door is stopped!");
    }

    public void lightOn() {
        log.info("Garage light is on!");
    }

    public void lightOff() {
        log.info("Garage light is off!");
    }
}
