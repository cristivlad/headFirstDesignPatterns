package com.example.headfirstdesignpatterns.domain.client;

import com.example.headfirstdesignpatterns.domain.fly.FlyBehavior;
import com.example.headfirstdesignpatterns.domain.quack.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        log.info("All ducks float, even decoys.");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
