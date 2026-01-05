package com.basics.demo.day3;

//一个接口可以继承多个接口
public interface InterfaceDemo extends A,B {
    @Override
    default void show() {
        A.super.show();
    }
}

interface A{
    //一个接口继承多个接口，接口中方法冲突则不支持多继承也不支持多实现。
//    String show();
    //一个接口继承多个接口，接口中方法一样则合并方法。
    default void show(){
        System.out.println("A");
    }
}
interface B{
    default void show(){
        System.out.println("B");
    }
}
class A1{
  void show(){
      System.out.println("A1");
  }
}
class B1 extends A1 implements  A,B{


    @Override
    public void show() {
        super.show();
    }
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.show();
    }
}
