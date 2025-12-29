package com.basics.demo.day2;

public class Car {
    //品牌
    private String brand;
    //价格
    private double price;

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void run() {
        System.out.println("汽车正在行驶...");
    }
}
