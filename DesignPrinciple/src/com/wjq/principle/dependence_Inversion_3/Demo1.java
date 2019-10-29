package com.wjq.principle.dependence_Inversion_3;

public class Demo1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello";
    }
}

//完成Person接收消息的功能
//方式1完成

//方式1分析
//1 如果我们获取信息的对象是微信 短信等等 则需要增加新的类  同时Persons 也要增加相应的接收方法
//2 解决思路  引入一个抽象的接口IReceiver 表示接收者  这样Person类和接口发生依赖
            //因为 Email Weixin 等实现IReceiver接口就行  这样就实现了依赖倒置原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
