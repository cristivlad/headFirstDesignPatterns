package com.example.headfirstdesignpatterns.domain.starbuzz.concrete;

import com.example.headfirstdesignpatterns.domain.starbuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
