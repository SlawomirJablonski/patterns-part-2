package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TakeawayPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public TakeawayPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", order packed for take away";
    }
}