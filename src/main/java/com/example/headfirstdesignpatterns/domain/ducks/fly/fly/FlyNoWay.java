package com.example.headfirstdesignpatterns.domain.ducks.fly.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        log.info("I can't fly!");
    }
}
