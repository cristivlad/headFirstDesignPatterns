package com.example.headfirstdesignpatterns.domain.pizzaaf;

import static com.example.headfirstdesignpatterns.domain.pizza.TypeOfPizza.*;

public class AbstractNYPizzaStore extends AbstractPizzaStore {

    @Override
    protected AbstractPizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (CHEESE.getType().equals(item)) {
            AbstractPizza pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
            return pizza;
        } else if (VEGGIE.getType().equals(item)) {
            AbstractPizza pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
            return pizza;
        } else if (CLAM.getType().equals(item)) {
            AbstractPizza pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
            return pizza;
        } else if (PEPPERONI.getType().equals(item)) {
            AbstractPizza pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
            return pizza;
        }
        return null;
    }
}
