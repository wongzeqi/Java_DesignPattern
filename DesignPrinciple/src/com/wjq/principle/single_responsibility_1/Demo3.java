package com.wjq.principle.single_responsibility_1;

public class Demo3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRode("汽车");
        vehicle2.runSky("飞机");
        vehicle2.runWater("轮船");
    }
}

//方式3的分析
//1 、这种修改方法 没有对原来的类做大的修改  只增加了方法
//2、这里虽然没有在类这个级别上遵守单一职责原则 但是在方法这个层面上任然符合单一职责原则

//3、改进

class Vehicle2{
    public  void runWater(String vehicle){
        System.out.println(vehicle + "在水中上跑");
    }

    public  void runSky(String vehicle){
        System.out.println(vehicle + "在天空上跑");
    }

    public  void runRode(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}
