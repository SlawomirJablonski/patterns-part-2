package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaWithJalapenosGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new JalapenosPizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(18),theCost);
    }
    @Test
    public void testPizzaWithPepperoniAndOlivesTakeawayGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PepperoniPizzaOrderDecorator(thePizza);
        thePizza = new TakeawayPizzaOrderDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce, cheese, pepperoni, order packed for take away",description);
    }
    @Test
    public void testPizzaDoublePepperoniAndTripleJalapenosGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PepperoniPizzaOrderDecorator(thePizza);
        thePizza = new PepperoniPizzaOrderDecorator(thePizza);
        thePizza = new JalapenosPizzaOrderDecorator(thePizza);
        thePizza = new JalapenosPizzaOrderDecorator(thePizza);
        thePizza = new JalapenosPizzaOrderDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(32),theCost);
        //assertEquals(new BigDecimal(31),theCost);
    }
}