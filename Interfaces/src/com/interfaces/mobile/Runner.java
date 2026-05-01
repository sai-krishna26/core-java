package com.interfaces.mobile;

public class Runner {
    public static void main(String[] args) {
        Sound sound=new Mobile();
        System.out.println("mobile type:"+ Sound.TYPE);
        System.out.println("mobile approx cost:"+ Sound.APPROXCOST);

        sound.high();
        sound.low();
        sound.good();
    }
}
