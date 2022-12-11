package com.example.headfirstdesignpatterns.domain.pizzaaf;

import com.example.headfirstdesignpatterns.domain.pizza.TypeOfPizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractPizzaStore {

    protected abstract AbstractPizza createPizza(String item);

    public AbstractPizza orderPizza(TypeOfPizza type) {
        AbstractPizza pizza = createPizza(type.getType());
        log.info("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
