package com.interfaces.fan;

public class Runner {
    public static void main(String[] args) {
        SmartFan fan = new SmartFan();

        System.out.println("Brand: " + FanControl.BRAND);
        System.out.println("Remote available: " + FanControl.REMOTE);

        fan.on();
        fan.off();
        fan.rotate();
    }
}
