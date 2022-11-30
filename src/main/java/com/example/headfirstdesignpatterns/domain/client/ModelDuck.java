package com.example.headfirstdesignpatterns.domain.client;

import com.example.headfirstdesignpatterns.domain.fly.FlyNoWay;
import com.example.headfirstdesignpatterns.domain.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModelDuck extends Duck{
    @Override
    public void display() {
        log.info("I'm a model Duck!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
