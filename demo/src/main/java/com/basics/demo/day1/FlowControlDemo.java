package com.basics.demo.day1;

import java.util.Scanner;

public class FlowControlDemo {
    public static void main(String[] args) {
        flowControlDemo();
        System.out.println("-------------------------");
        //flowControlDemo2();
        //System.out.println("-------------------------");
        //flowControlDemo3();
        System.out.println("-------------------------");
        flowControlDemo4();
    }

    //打印九九乘法表
    public static void flowControlDemo() {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" × "+i+" = "+(i*j)+ "\t\t");
                //1*1=1
                //1*2=2 2*2=4
                //1*3=3 2*3=6 3*3=9
                //1*4=4 2*4=8 3*4=12 4*4=16
            }
            System.out.println();
        }
    }


    //计算器
    public static void flowControlDemo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1：");
        double a = scanner.nextDouble();
        System.out.println("运算符（+、-、*、/）:");
        char b = scanner.next().charAt(0);
        System.out.println("请输入数字2：");
        double c = scanner.nextDouble();

        switch (b) {
            case '+':
                System.out.println(a + " + " + c + " = " + (a + c));
                break;
            case '-':
                System.out.println(a + " - " + c + " = " + (a - c));
                break;
            case '*':
                System.out.println(a + " * " + c + " = " + (a * c));
                break;
            case '/':
                System.out.println(a + " / " + c + " = " + (a / c));
                break;
            default:
                System.out.println("请输入正确运算符！");
        }

    }

    //猜数字游戏
    public static void flowControlDemo3() {
        //随机数
        int a = (int)(Math.random()*100);
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        while (a!=b){
            System.out.println("请输入数字：");
            b = scanner.nextInt();
            if(a<b){
                System.out.println("数字太大了！");
            }else if(a>b){
                System.out.println("数字太小了！");
            }else{
                System.out.println("恭喜你猜对了！");
            }
        }
    }

    //随机数
    public static void flowControlDemo4() {
        int r= (int) (Math.random()*1000000);
        System.out.println(r);
    }

}
