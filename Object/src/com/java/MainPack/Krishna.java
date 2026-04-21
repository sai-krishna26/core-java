package com.java.MainPack;

public class Krishna {

    void play()
    {
        Ball ball=new Ball();
        ball.roll();
        FootBall footBall= new FootBall() {
            @Override
            public Object clone() {
                return null;
            }
        };
        footBall.roll();
        footBall.check();
    }

    public static void main(String[] args) {
        Krishna krishna=new Krishna();
        krishna.play();
    }
}
