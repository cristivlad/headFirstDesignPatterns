package com.example.headfirstdesignpatterns.domain.quack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("Quack!");
    }
}
