package com.wjq.pattern.singleton.type7;
public class SingleTonType7{
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
    }
}

//懒汉式（静态内部类）

//静态内部类的特点
//1 当Singleton 被装载的时候  SingletonInstance 此静态内部类是不会被装载的
//2 当我们去调用getInstance 方法的时候 SingletonInstance 这个静态内部类才会被装载（只会装载一次）
//3 线程安全

class Singleton{

    private Singleton(){

    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
