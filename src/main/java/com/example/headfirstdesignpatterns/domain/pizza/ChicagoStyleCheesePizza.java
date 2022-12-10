package com.example.headfirstdesignpatterns.domain.pizza;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
