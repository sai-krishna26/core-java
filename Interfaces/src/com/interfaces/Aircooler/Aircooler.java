package com.interfaces.Aircooler;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_INPeer;

public class Aircooler implements Rotation{
    @Override
    public void speed() {
        System.out.println("speed can be adjusted");
    }

    @Override
    public void swip() {
        System.out.println("swip can be adjusted");
    }

    @Override
    public void pump() {
        System.out.println("pump can be adjusted");
    }
}
