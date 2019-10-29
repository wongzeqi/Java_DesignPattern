package com.wjq.principle.interface_apart_2;

public class Demo1 {
    public static void main(String[] args) {

    }
}


interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}


class A implements Interface1{

    @Override
    public void operation1() {
        System.out.println("A实现了操作1");
    }

    @Override
    public void operation2() {
        System.out.println("A实现了操作2");
    }

    @Override
    public void operation3() {
        System.out.println("A实现了操作3");
    }

    @Override
    public void operation4() {
        System.out.println("A实现了操作4");
    }

    @Override
    public void operation5() {
        System.out.println("A实现了操作5");
    }
}

class B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("B实现了操作1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了操作2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了操作3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了操作4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了操作5");
    }
}

//C通过接口依赖 A  但是只会用到 A中的 操作1,2,3这三个方法
class C {
    public void func(Interface1 i){
        i.operation1();
        i.operation2();
        i.operation3();
    }
}

//D通过接口依赖 B  但是只会用到 B中的 操作1,4,5这三个方法
class D {
    public void fund(Interface1 i){
        i.operation1();
        i.operation4();
        i.operation5();
    }
}