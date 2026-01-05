package com.basics.demo.day3;

import java.util.Scanner;


/***
 * @author ：lll
 * @date ：Created in 2025/12/30 0023 11:03
 * @description：封装、继承、多态
 * @modified By：
 * @version: 1.0$
 */
public class Test {
    public static void main(String[] args) {
        //test();
//        B1 b1 = new B1();
//        b1.show();

        //使用ArrayList存储多个汽车对象，并遍历打印信息。
//        ElectricVehicle[] cars = new ElectricVehicle[3];
//        cars[0] = new ElectricVehicle("特斯拉", 1000000, 1000, 100);
//        cars[1] = new ElectricVehicle("比亚迪", 1000000, 1000, 100);
//        cars[2] = new ElectricVehicle("雅迪", 1000000, 1000, 100);
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i].getName()+"，电量："+cars[i].getBattery()+"W，充电量："+cars[i].getCharge()+"W，充电速度："+cars[i].getSpeed()+"W/min");
//        }

        String str="张三、王五、孙权、赵六、八一";
        String[] names = str.split("、");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("------------------------------------------------------------");
        String iphone="15112362473";
        System.out.println(iphone);
        iphone=iphone.substring(0,3)+"****"+iphone.substring(7);
        System.out.println(iphone);

        if(iphone.equals("15112362473")){
            System.out.println("恭喜！您已获得一张iphone 14 pro 优惠券！");

        }




    }
    public static void test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车牌号：");
        String id = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入电话：");
        String phone = sc.next();
        System.out.println("请输入余额：");
        double balance = sc.nextDouble();
        String type = "";
        if(balance>=5000){
            type="金卡";
        }
        if(balance<5000&&balance>=2000){
            type="银卡";
        }
        Card card =null;
        if(type.equals("金卡")){
            card = new GoldCard();
        }else if(type.equals("银卡")){
            card = new SilverCard();
        }else{
            card = new Card();
        }
        card.setId(id);
        card.setName(name);
        card.setPhone(phone);
        card.setBalance(balance);
        System.out.println("欢迎使用"+type+"！");
        while ( true){
            System.out.println("请输入需要执行的操作（1、充值/2、消费/3、退出）：）：");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("请输入充值金额：");
                    double amount = sc.nextDouble();
                    card.charge(amount);
                    break;

                case 2:
                    System.out.println("请输入消费金额：");
                    amount = sc.nextDouble();
                    card.pay(amount);
                    break;
                case 3:
                    System.exit(0);
                    System.out.println("退出！");
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }

    }



}
