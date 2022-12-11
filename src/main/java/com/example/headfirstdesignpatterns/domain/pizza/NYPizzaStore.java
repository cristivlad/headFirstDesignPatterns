package com.example.headfirstdesignpatterns.domain.pizza;

import static com.example.headfirstdesignpatterns.domain.pizza.TypeOfPizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (CHEESE.getType().equals(item)) {
            return new NYStyleCheesePizza();
        } else if (VEGGIE.getType().equals(item)) {
            return new NYStyleVeggiePizza();
        } else if (CLAM.getType().equals(item)) {
            return new NYStyleClamPizza();
        } else if (PEPPERONI.getType().equals(item)) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
