package com.example.headfirstdesignpatterns.domain.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying!");
    }
}
