package com.example.headfirstdesignpatterns.domain.starbuzz.concrete;

import com.example.headfirstdesignpatterns.domain.starbuzz.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
