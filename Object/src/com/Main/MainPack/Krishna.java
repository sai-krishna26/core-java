package com.Main.MainPack;

public class Krishna {

    void play()
    {
        Ball ball=new Ball();
        ball.roll();
        FootBall footBall=new FootBall();
        footBall.roll();
        footBall.check();
    }

    public static void main(String[] args) {
        Krishna krishna=new Krishna();
        krishna.play();
    }
}
