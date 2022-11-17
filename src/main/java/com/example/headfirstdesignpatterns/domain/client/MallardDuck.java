package com.example.headfirstdesignpatterns.domain.client;

import com.example.headfirstdesignpatterns.domain.fly.FlyWithWings;
import com.example.headfirstdesignpatterns.domain.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck !");
    }
}
