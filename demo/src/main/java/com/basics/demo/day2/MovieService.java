package com.basics.demo.day2;
/***
 * @author ：liull
 * @date ：Created in 2025/12/29 0001 13:50
 * @description ：面向对象、封装 业务类
 * @modified By：liull
 * @version: 1.0
 */
public class MovieService {
    private Movie[] movies;
    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    //获取所有电影信息
    public void getMovies() {
        System.out.println("================电影信息列表==================");
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getDirector()+"\t"+movies[i].getActor()+"\t"+movies[i].getPrice());
        }

    }

    //根据电影id获取电影信息
    public void getMovieById() {
        Movie movie = null;
        System.out.println("================查询电影信息==================");
        System.out.println("请输入电影编号：");
        int id = new java.util.Scanner(System.in).nextInt();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getId() == id){
                System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getDirector()+"\t"+movies[i].getActor()+"\t"+movies[i].getPrice());
            }
        }

    }

}
