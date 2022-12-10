package com.example.headfirstdesignpatterns.domain.pizza;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        log.info("Prepare " + name + "\nTossing dough ...\nAdding sauce ...\nAdding toppings: ");
        for (String topping : toppings)
            log.info(" " + topping);
    }

    void bake() {
        log.info("Bake for 15 minutes at 350");
    }

    void cut() {
        log.info("Cut the pizza into diagonal slices");
    }

    void box() {
        log.info("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("--- " + name + " ---\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings)
            display.append(topping + "\n");

        return display.toString();
    }
}
