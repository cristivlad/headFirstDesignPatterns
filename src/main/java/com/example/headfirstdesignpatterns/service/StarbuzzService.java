package com.example.headfirstdesignpatterns.service;

import com.example.headfirstdesignpatterns.domain.starbuzz.Beverage;
import com.example.headfirstdesignpatterns.domain.starbuzz.LowerCaseInputStream;
import com.example.headfirstdesignpatterns.domain.starbuzz.concrete.DarkRoast;
import com.example.headfirstdesignpatterns.domain.starbuzz.concrete.Espresso;
import com.example.headfirstdesignpatterns.domain.starbuzz.concrete.HouseBlend;
import com.example.headfirstdesignpatterns.domain.starbuzz.decorators.Mocha;
import com.example.headfirstdesignpatterns.domain.starbuzz.decorators.Soy;
import com.example.headfirstdesignpatterns.domain.starbuzz.decorators.Whip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
@Slf4j
public class StarbuzzService {
    public void getCoffee() {
        Beverage beverage = new Espresso();
        log.info(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        log.info(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.info(beverage2.getDescription() + " $" + beverage2.cost());

        int c;
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/test.txt")))) {
            StringBuilder text = new StringBuilder();
            while ((c = in.read()) >= 0) {
                text.append((char) c);
            }
            log.info(String.valueOf(text));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
