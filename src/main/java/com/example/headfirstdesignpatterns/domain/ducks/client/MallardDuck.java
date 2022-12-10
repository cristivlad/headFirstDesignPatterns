package com.example.headfirstdesignpatterns.domain.ducks.client;

import com.example.headfirstdesignpatterns.domain.ducks.fly.fly.FlyWithWings;
import com.example.headfirstdesignpatterns.domain.ducks.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        log.info("I'm a real Mallard Duck !");
    }
}
