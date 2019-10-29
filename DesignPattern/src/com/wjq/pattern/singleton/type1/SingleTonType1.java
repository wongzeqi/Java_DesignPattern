package com.wjq.pattern.singleton.type1;

public class SingleTonType1 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
    }



}
//饿汉式   （静态变量）
class Singleton{

    private final static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
