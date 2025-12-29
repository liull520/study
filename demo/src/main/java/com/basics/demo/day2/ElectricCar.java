package com.basics.demo.day2;

public class ElectricCar extends  Car{
    //电池容量
    private double batteryCapacity;
    //充电速度
    private double chargeSpeed;
    public ElectricCar() {
        super();
    }
    public ElectricCar(String brand, double price, double batteryCapacity, double chargeSpeed) {
        super(brand, price);
        this.batteryCapacity = batteryCapacity;
        this.chargeSpeed = chargeSpeed;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getChargeSpeed() {
        return chargeSpeed;
    }

    public void setChargeSpeed(double chargeSpeed) {
        this.chargeSpeed = chargeSpeed;
    }

    public void charge() {
        System.out.println("正在充电...");
    }
    @Override
    public void run() {
        System.out.println(getBrand() +"电车正在行驶...电量剩余："+batteryCapacity);
    }
}
