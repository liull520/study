package com.basics.demo.day3;

/***
 * @author ：lll
 * @date ：Created in 2025/12/30 0023 11:03
 * @description：银卡
 * @modified By：
 * @version: 1.0$
 * SilverCard类继承Card类
 */
public class SilverCard extends  Card{
    @Override
    public void charge(double amount) {
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("金卡充值到账："+amount+",现有余额："+ getBalance()+"元");
        }else{
            System.out.println("充值金额不能小于等于0！");
        }
    }
    @Override
    public void pay(double amount) {
        double balance = getBalance();
        double money=amount*0.9;
        if(balance< money){
            System.out.println("金卡余额："+ balance+",消费金额："+ money+"，余额不足！");
        }else{
            setBalance(balance-money);
            System.out.println("金卡余额："+ balance+"元,消费金额："+ amount+"元，优惠后消费金额:"+money+"元，还剩余额："+ getBalance()+"元");
        }

    }
}
