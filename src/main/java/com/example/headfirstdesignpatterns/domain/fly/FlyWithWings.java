package com.example.headfirstdesignpatterns.domain.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        log.info("Flying!");
    }
}
