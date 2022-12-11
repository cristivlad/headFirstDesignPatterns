package com.example.headfirstdesignpatterns.domain.pizzaaf;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class PepperoniPizza extends AbstractPizza {
    private final PizzaIngredientFactory ingredientFactory;

    @Override
    void prepare() {
        log.info("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
