package com.wjq.pattern.singleton.type2;
public class SingleTonType2 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
    }
}

//饿汉式   （静态代码块）
class Singleton{

    private Singleton(){

    }

    private final static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
