package com.basics.demo.day3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @author ：lll
 * @date ：Created in 2025/12/30 0023 11:03
 * @description：卡片
 * @modified By：
 * @version: 1.0$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    //车牌号
    private String id;
    //车主姓名
    private String name;
    //电话
    private String phone;
    //余额
    private double balance;

    //充值
    public void charge(double money){
    	this.balance+=money;
    }

    //消费
    public void pay(double money){
    	this.balance-=money;
    }
}
