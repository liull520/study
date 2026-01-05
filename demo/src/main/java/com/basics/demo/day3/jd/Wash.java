package com.basics.demo.day3.jd;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * @author ：lll
 * @date ：Created in 2026/1/5 0023 13:53
 * @description：洗衣机 inherits JD
 * @modified By：
 * @version: 1.0$
 */
public class Wash extends JD {
    public Wash(String name, Boolean status) {
        super(name, status);
    }
}
