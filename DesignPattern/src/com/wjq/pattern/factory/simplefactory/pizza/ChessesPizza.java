package com.wjq.pattern.factory.simplefactory.pizza;

public class ChessesPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Chesses Pizza Prepare...");
    }
}
