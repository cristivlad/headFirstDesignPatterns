package com.example.headfirstdesignpatterns.domain.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HunterPlane implements Plane {
    @Override
    public void quack() {
        log.info("Quack");
    }

    @Override
    public void fly() {
        log.info("Fly");
    }
}
