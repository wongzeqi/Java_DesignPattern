package com.wjq.pattern.singleton.type3;
public class SingleTonType3 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
    }
}

//懒汉式（线程不安全的）
class Singleton{

    private Singleton(){

    }

    private static Singleton instance;

// 线程不安全的

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
