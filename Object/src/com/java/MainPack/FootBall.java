package com.java.MainPack;

public abstract class FootBall extends Ball{
    void check()
    {
        System.out.println("football starts......");
        roll();
    }

    public abstract Object clone();
}
