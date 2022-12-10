package com.example.headfirstdesignpatterns.domain.pizza;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
