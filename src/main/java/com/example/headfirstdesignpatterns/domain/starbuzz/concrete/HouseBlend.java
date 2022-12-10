package com.example.headfirstdesignpatterns.domain.starbuzz.concrete;

import com.example.headfirstdesignpatterns.domain.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
