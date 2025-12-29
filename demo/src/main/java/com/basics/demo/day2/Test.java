package com.basics.demo.day2;

/***
 * @author ：liull
 * @date ：Created in 2025/12/29 0001 13:50
 * @description ：面向对象、封装 测试类
 * @modified By：liull
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];

        movies[0] = new Movie(1,"唐顿庄园", "维吉尼亚·沃森", "维维·沃森", "￥9.90");
        movies[1] = new Movie(2,"唐顿庄园", "维吉尼亚·沃森", "维维·沃森", "￥19");
        movies[2] = new Movie(3,"唐顿庄园", "维吉尼亚·沃森", "维维·沃森", "￥60");
        movies[3] = new Movie(4,"唐顿庄园", "维吉尼亚·沃森", "维维·沃森", "￥30");
        movies[4] = new Movie(5,"唐顿庄园", "维吉尼亚·沃森", "维维·沃森", "￥8.8");
        movies[5] = new Movie(6,"唐顿庄园", "维吉尼亚·沃森", "维维·沃森", "￥9");

        MovieService movieService = new MovieService(movies);
        movieService.getMovies();
        movieService.getMovieById();

        test();

    }

    public static void test() {
        ElectricCar car = new ElectricCar("特斯拉", 100, 100, 100);
        car.run();
    }
}
