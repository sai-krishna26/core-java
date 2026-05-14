package com.xworkz.looseCoupling.remote;

public class TvRemote implements Remote{
    @Override
    public void turnOn() {
        System.out.println("executing turnOn method in TvRemote");
    }

}
