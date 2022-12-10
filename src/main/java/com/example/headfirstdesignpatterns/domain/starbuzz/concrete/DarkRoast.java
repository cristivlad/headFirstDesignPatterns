package com.example.headfirstdesignpatterns.domain.starbuzz.concrete;

import com.example.headfirstdesignpatterns.domain.starbuzz.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
