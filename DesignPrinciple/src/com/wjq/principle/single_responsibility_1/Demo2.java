package com.wjq.principle.single_responsibility_1;

public class Demo2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        SkyVehicle skyVehicle = new SkyVehicle();
        skyVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

//方案2 分析

//1、遵守了单一职责原则  但是改动很大 既要分解类 还需要修改客户端（main方法中的代码）
//2、改进：直接修改demo1 中的Vechile类这样代码的改动会很小

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}


class SkyVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空上运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水中上运行");
    }
}