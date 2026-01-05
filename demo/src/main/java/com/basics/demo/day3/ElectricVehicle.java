package com.basics.demo.day3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * @author ：lll
 * @date ：Created in 2026/1/5 0023 16:53
 * @description：充电车辆
 * @modified By：
 * @version: 1.0$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricVehicle implements Charging {
    private String name;
    private int battery;//电池容量
    private int charge;//充电量
    private int speed;//充电速度


    @Override
    public void charge() {
        //充电
        System.out.println("正在充电...");
        while (charge<battery){
            charge+=speed;
        }
        System.out.println("充电完成！");
        System.out.println("当前电量："+charge+"W");
    }

    @Override
    public void cancelCharge() {

        System.out.println("取消充电...");
        charge=charge;
        System.out.println("当前电量："+charge+"W");
        System.out.println("取消充电完成！");
    }

}
