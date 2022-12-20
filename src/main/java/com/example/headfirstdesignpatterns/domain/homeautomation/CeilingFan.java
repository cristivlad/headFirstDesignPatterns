package com.example.headfirstdesignpatterns.domain.homeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CeilingFan {
    private String location;
    private int level;
    private static final int HIGH = 2;
    private static final int MEDIUM = 1;
    private static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        log.info( location + " Ceiling fan is on HIGH!");
    }

    public void medium() {
        level = MEDIUM;
        log.info(location + " Ceiling fan is on MEDIUM!");
    }

    public void low() {
        level = LOW;
        log.info(location + " Ceiling fan is on LOW!");
    }

    public void off() {
        level = 0;
        log.info(location + " Ceiling fan is off!");
    }

    public int getSpeed() {
        return level;
    }
}
