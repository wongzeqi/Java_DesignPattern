package com.wjq.pattern.singleton.type8;

public class SingleTonType8 {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.INSTANCE;
        SingleTon instance2 = SingleTon.INSTANCE;
        System.out.println(instance == instance2);
        instance.sayOK();
        instance2.sayOK();
    }

}

enum SingleTon{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("ok~");
    }
}