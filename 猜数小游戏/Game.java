package com.example.a40272.app16;

import java.util.Random;

public class Game {
    public static final int NORMAL = 50;
    public static final int HARD = 100;
    private int randomnum;
    private String title;

    public Game(int level){
        randomnum = new Random().nextInt(level);
        title = "已经产生了0-"+level+"的随机数字，请猜出这个数字";
    }
    public int getRandomnum(){
        return randomnum;
    }
    public String getTitle(){return title;}
}
