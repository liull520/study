package com.basics.demo;

/***
 * @Description:类型转换
 * @Author:liull
 * @Date:2025/12/28 11:00
 * @Version:1.0
 */
public class TypeDemo {
    public static void main(String[] args) {
        typeConversion();
    }
    //强制类型转换
    public static void typeConversion() {
        // byte的字节大小为1字节
        byte a=20;
        //小类型转大类型，无需强制转换
        typeConversion2(a);

        //double的字节大小为8字节
        double b=a;
        System.out.println("byet转double小转大，无需强转："+b);

        // int的字节大小为4字节
        int c= (int) b;
        System.out.println("double转int大转小，需要强转："+c);

        int d=300;
        a=(byte) d;//byte的字节大小为1字节,最大值为127，300超出范围，会数据溢出丢失
        System.out.println("int转byte大转小，需要强转："+a);

    }

    public static void typeConversion2(int a) {
        System.out.println("byet转int小转大，无需强转："+ a);
    }


    public static double typeConversion3(byte a,double b,int c,char  d) {
        //表达式的结果类型由最高类型决定。
        return a+b+c+d;
    }
    public static void typeConversion4() {
        byte a=120;
        byte b=100;
        int c=a+b;//byte short char 运算时会提升为int
        System.out.println(c);
    }

}
