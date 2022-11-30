package com.example.headfirstdesignpatterns.domain.quack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        log.info("Squeak!");
    }
}
