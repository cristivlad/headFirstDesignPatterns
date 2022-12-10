package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.pizza.ChicagoPizzaStore;
import com.example.headfirstdesignpatterns.domain.pizza.NYPizzaStore;
import com.example.headfirstdesignpatterns.domain.pizza.Pizza;
import com.example.headfirstdesignpatterns.domain.pizza.PizzaStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzaStoreService {

    private static final String ETHAN_ORDER = "Ethan ordered a ";
    private static final String JOEL_ORDER = "Joel ordered a ";

    public void getPizza() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        log.info(JOEL_ORDER + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        log.info(JOEL_ORDER + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        log.info(JOEL_ORDER + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        log.info(ETHAN_ORDER + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        log.info(JOEL_ORDER + pizza.getName() + "\n");
    }
}
