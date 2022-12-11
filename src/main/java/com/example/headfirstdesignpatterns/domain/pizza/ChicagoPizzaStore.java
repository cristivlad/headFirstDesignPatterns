package com.example.headfirstdesignpatterns.domain.pizza;

import static com.example.headfirstdesignpatterns.domain.pizza.TypeOfPizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (CHEESE.getType().equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if (VEGGIE.getType().equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if (CLAM.getType().equals(item)) {
            return new ChicagoStyleClamPizza();
        } else if (PEPPERONI.getType().equals(item)) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
