package com.wjq.pattern.factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Greek Pizza perpare....");
    }
}
