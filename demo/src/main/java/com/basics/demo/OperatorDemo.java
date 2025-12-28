package com.basics.demo;

/***
 * @Description:运算符
 * @Author:liull
 * @Date:2025/12/28 11:14
 * @Version:1.0
 */
public class OperatorDemo {
    public static void main(String[] args) {
        operatorDemo();
        System.out.println("-------------------------");
        operatorDemo2();
        System.out.println("-------------------------");
        operatorDemo3();
        System.out.println("-------------------------");
        operatorDemo4();
        System.out.println("-------------------------");
        operatorDemo5();
        System.out.println("-------------------------");
        operatorDemo6();
    }

    //基础运算符
    public static void operatorDemo() {
        int a = 1;
        int b = 2;
        System.out.println(a+1);
        System.out.println(a+b);
        System.out.println("woaizhongguo"+a+'a');//woaizhongguo+a=woaizhongguo1
        System.out.println(a+'a'+"woaizhongguo");//a+'a'=1+97=98
    }

    //自增自减
    public static void operatorDemo2() {
        int a = 1;
        System.out.println(a);//1
        int b = a++;//先用后加
        System.out.println(b);//1
        System.out.println(a);//2
        int c=++a;//先加后用
        System.out.println(c);//3
        System.out.println(a);//3
    }
    //赋值运算符
    public static void operatorDemo3() {
        int a = 1;
        byte b = 2;
        a += b;//a+b;a=(a的类型)（a+b）;
        System.out.println(a);
    }
    //关系运算符
    public static void operatorDemo4() {
        int a = 1;
        int b = 2;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }

    //三元运算符
    public static void operatorDemo5() {
        int a = 1;
        int b = 2;
        System.out.println(a>b?a:b);//a>b则显示a，否则显示b

        //判断成绩是否合格
        int score = 60;
        System.out.println(score>=60?"通过":"未通过");

        //判断三个整数的最大值
        int max;
        int a1 = 3;
        int b1 = 7;
        int c1 = 5;
        max = a1>b1?(a1>c1?a1:c1):(b1>c1?b1:c1);
        System.out.println(max);
    }

    //逻辑运算符
    public static void operatorDemo6() {
        //想找一个身高185，性别男，年龄18-25的，八块腹肌的男朋友
        int height = 182;
        char sex = '男';
        int age = 25;
        int abdominalMuscle = 8;
        System.out.println((height==185)&(sex=='男')&(age>=18)&(age<=25)&(abdominalMuscle>=8));//每个条件都是真为true否则为false
        //身高180或者年薪100万
        int salary = 900000;
        System.out.println((height==185)|(salary>=1000000));//其中一个条件为真，为true否则为false
        //！非
        System.out.println(!(height==185));//为真则为 false否则为true
        // 异或^
        System.out.println((height==185)^(salary>=1000000));//一个条件为真，一个条件为假，为true,否则为false
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);

        //&&与&， ||与|的区别；&&、||具有短路功能，效率高
        System.out.println(false&true);//左边为false,右边依旧执行
        System.out.println(false&&true);//左边为false，右边不执行(短路)
    }
}
