package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.pizza.*;
import com.example.headfirstdesignpatterns.domain.pizzaaf.AbstractChicagoPizzaStore;
import com.example.headfirstdesignpatterns.domain.pizzaaf.AbstractNYPizzaStore;
import com.example.headfirstdesignpatterns.domain.pizzaaf.AbstractPizza;
import com.example.headfirstdesignpatterns.domain.pizzaaf.AbstractPizzaStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.example.headfirstdesignpatterns.domain.pizza.TypeOfPizza.*;

@Service
@Slf4j
public class PizzaStoreService {

    private static final String ETHAN_ORDER = "Ethan ordered a ";
    private static final String JOEL_ORDER = "Joel ordered a ";

    public void getPizza() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(CHEESE.getType());
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(CHEESE.getType());
        log.info(JOEL_ORDER + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(CLAM.getType());
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(CLAM.getType());
        log.info(JOEL_ORDER + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PEPPERONI.getType());
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PEPPERONI.getType());
        log.info(JOEL_ORDER + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(VEGGIE.getType());
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(VEGGIE.getType());
        log.info(JOEL_ORDER + pizza.getName() + "\n");
    }

    public void getAbstractPizza() {
        AbstractPizzaStore nyStore = new AbstractNYPizzaStore();
        AbstractPizzaStore chicagoStore = new AbstractChicagoPizzaStore();

        AbstractPizza pizza = nyStore.orderPizza(CHEESE);
        log.info(ETHAN_ORDER + pizza + "\n");

        pizza = chicagoStore.orderPizza(CHEESE);
        log.info(JOEL_ORDER + pizza + "\n");

        pizza = nyStore.orderPizza(CLAM);
        log.info(ETHAN_ORDER + pizza + "\n");

        pizza = chicagoStore.orderPizza(CLAM);
        log.info(JOEL_ORDER + pizza + "\n");

        pizza = nyStore.orderPizza(PEPPERONI);
        log.info(ETHAN_ORDER + pizza + "\n");

        pizza = chicagoStore.orderPizza(PEPPERONI);
        log.info(JOEL_ORDER + pizza + "\n");

        pizza = nyStore.orderPizza(VEGGIE);
        log.info(ETHAN_ORDER + pizza + "\n");

        pizza = chicagoStore.orderPizza(VEGGIE);
        log.info(JOEL_ORDER + pizza + "\n");
    }
}
