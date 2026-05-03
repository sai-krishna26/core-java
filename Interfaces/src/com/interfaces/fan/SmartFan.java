package com.interfaces.fan;

public class SmartFan implements FanControl {
    @Override
    public void on() {
        System.out.println("Fan turned ON");
    }

    @Override
    public void off() {
        System.out.println("Fan turned OFF");
    }

    @Override
    public void rotate() {
        System.out.println("Fan is rotating");
    }

}
