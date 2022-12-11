package com.example.headfirstdesignpatterns.domain.pizzaaf;

import static com.example.headfirstdesignpatterns.domain.pizza.TypeOfPizza.*;

public class AbstractChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    protected AbstractPizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (CHEESE.getType().equals(item)) {
            AbstractPizza pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
            return pizza;
        } else if (VEGGIE.getType().equals(item)) {
            AbstractPizza pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
            return pizza;
        } else if (CLAM.getType().equals(item)) {
            AbstractPizza pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
            return pizza;
        } else if (PEPPERONI.getType().equals(item)) {
            AbstractPizza pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
            return pizza;
        }
        return null;
    }
}
