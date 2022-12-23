package com.example.headfirstdesignpatterns.domain.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HunterHelicopter implements Helicopter {
    @Override
    public void hover() {
        log.info("hovering");
    }

    @Override
    public void fly() {
        log.info("flying");
    }
}
