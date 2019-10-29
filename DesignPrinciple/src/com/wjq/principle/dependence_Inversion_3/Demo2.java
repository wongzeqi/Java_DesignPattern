package com.wjq.principle.dependence_Inversion_3;

public class Demo2 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.receive(new Email2());
        p.receive(new Weixin2());
    }
}

interface IReceiver{
    String getInfo();
}

class Email2 implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello";
    }
}

//增加一个微信消息
class Weixin2 implements IReceiver{
    public String getInfo(){
        return "微信信息：hello";
    }
}


class Person2{
    //这个是对一个接口（抽象）的一个依赖
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
