package com.basics.demo.day2;


/***
 * @author ：liull
 * @date ：Created in 2025/12/29 0001 13:50
 * @description ：面向对象、封装 实体类
 * @modified By：liull
 * @version: 1.0
 */
public class Movie {
    private int id;// 电影编号
    private String name;// 电影名称
    private String director;// 导演
    private String actor;// 主演
    private String price;// 价格

    public Movie() {
    }

    public Movie(int id ,String name, String director, String actor, String price) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
