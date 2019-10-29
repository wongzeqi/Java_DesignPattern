package com.wjq.principle.single_responsibility_1;

public class Demo1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run("汽车");
        v.run("摩托车");
        v.run("飞机");
    }
}


//方式1
//1 在方式1 中run方法中  违反了单一职责原则
//2 解决办法  根据交通工具运行方法不同  分解成多个累
class Vehicle{
    public  void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}


