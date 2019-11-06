package com.wjq.pattern.factory.simplefactory.pizza;

public abstract class Pizza {
    protected String name;
    public void prepare(){
        System.out.println(name + "parepare");
    }
    public void bake(){
        System.out.println(name + "bake");
    }
    public void cut(){
        System.out.println(name + "cut");
    }
    public void box(){
        System.out.println(name + "box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pizza(String name) {
        this.name = name;
    }

    public Pizza() {
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
