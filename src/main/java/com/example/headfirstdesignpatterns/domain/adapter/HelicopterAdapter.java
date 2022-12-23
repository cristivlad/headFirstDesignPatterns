package com.example.headfirstdesignpatterns.domain.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HelicopterAdapter implements Plane {

    private final Helicopter helicopter;

    @Override
    public void quack() {
        helicopter.hover();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++)
            helicopter.fly();
    }
}
