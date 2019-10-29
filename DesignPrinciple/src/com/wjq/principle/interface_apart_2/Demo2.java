package com.wjq.principle.interface_apart_2;

public class Demo2 {

    public static void main(String[] args) {
        C1 c = new C1();
        c.func(new A1(),new A1());
    }
}


interface Interface_1{
    void operation1();
}

interface Interface_2{
    void operation2();
    void operation3();
}

interface Interface_3{
    void operation4();
    void operation5();
}

class A1 implements Interface_1,Interface_2{

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}

class B1 implements Interface_1,Interface_3{

    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class C1 {
    public void func(Interface_1 interface_1, Interface_2 interface_2){
        interface_1.operation1();
        interface_2.operation2();
        interface_2.operation3();
    }
}

class D1 {
    public void fund(Interface_1 interface_1, Interface_3 interface_3){
        interface_1.operation1();
        interface_3.operation4();
        interface_3.operation5();
    }
}