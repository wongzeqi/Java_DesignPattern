package com.wjq.pattern.factory.simplefactory.order;
import com.wjq.pattern.factory.simplefactory.pizza.ChessesPizza;
import com.wjq.pattern.factory.simplefactory.pizza.GreekPizza;
import com.wjq.pattern.factory.simplefactory.pizza.Pizza;


import java.util.Scanner;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订单披萨的类型
        do{
            orderType = gettype();

            if(orderType.equals("greek")){

                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){

                pizza = new ChessesPizza();
                pizza.setName("奶酪披萨");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);
    }

    private String gettype() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input pizza type");
        String str = sc.next();
        return str;
    }

    public static void main(String[] args) {

    }
}
