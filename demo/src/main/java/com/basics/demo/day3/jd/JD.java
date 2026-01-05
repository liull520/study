package com.basics.demo.day3.jd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/***
 * @author ：lll
 * @date ：Created in 2026/1/5 0023 13:53
 * @description：JD 家电
 * @modified By：
 * @version: 1.0$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements SwitchInter{
    private String name;
    private Boolean status;

    //操作电器开关
    @Override
    public void switchTest(){
        status = !status;
    }

}
