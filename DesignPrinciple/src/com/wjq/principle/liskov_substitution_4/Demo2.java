package com.wjq.principle.liskov_substitution_4;

public class Demo2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("12-3="+a.func1(11,3));
        System.out.println("11-8="+a.func1(1,8));
        System.out.println("--------------------------------");
        B2 b = new B2();
        System.out.println("12+3="+b.func1(11,3));
        System.out.println("11+8="+b.func1(1,8));
        System.out.println("11+3+1="+b.func2(11,3));
        System.out.println("--------------------------------");
        System.out.println("111-11="+b.func3(111,11));
    }
}

//设计一个Base类 将A2和B2进行抽象
class Base{

}


class A2 extends Base{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B2 extends Base{

    private A a = new A();

    public int func1(int num1,int num2){
        return num1+num2;
    }

    public int func2(int a,int b){
        return func1(a,b)+1;
    }

    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
