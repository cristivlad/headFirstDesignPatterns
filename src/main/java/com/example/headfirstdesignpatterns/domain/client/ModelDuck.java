package com.example.headfirstdesignpatterns.domain.client;

import com.example.headfirstdesignpatterns.domain.fly.FlyNoWay;
import com.example.headfirstdesignpatterns.domain.quack.Quack;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a model Duck!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
