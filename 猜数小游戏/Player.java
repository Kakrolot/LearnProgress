package com.example.a40272.app16;

public class Player {
    private Game mGame;
    private static Player INSTANCE = new Player();
    private Player(){
    }
    public static Player getINSTANCE() {return INSTANCE;}

    public void setLevel(int level){
        mGame = new Game(level);
    }
    public String compare(int inputNumber){
        if(inputNumber>mGame.getRandomnum()){
            return "猜大了";
        }else if (inputNumber<mGame.getRandomnum()){
            return "猜小了";
        }else {
            return "win";
        }

    }
    public Game getmGame(){return mGame;}
}
