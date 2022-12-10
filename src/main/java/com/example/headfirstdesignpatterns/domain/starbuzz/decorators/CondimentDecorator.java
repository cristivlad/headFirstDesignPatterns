package com.example.headfirstdesignpatterns.domain.starbuzz.decorators;

import com.example.headfirstdesignpatterns.domain.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
