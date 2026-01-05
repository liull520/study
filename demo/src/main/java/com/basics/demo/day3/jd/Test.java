package com.basics.demo.day3.jd;

public class Test {
    public static void main(String[] args) {
        JD[] jds = new JD[3];
        jds[0] = new Wash("洗衣机", true);
        jds[1] = new LED("灯", true);
        jds[2] = new Refrigerator("冰箱", true);
       //创建家电控制系统类
        JDControl jdControl = new JDControl(jds[0]);

    }
}
