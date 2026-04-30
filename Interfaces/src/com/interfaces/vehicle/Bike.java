package com.interfaces.vehicle;


public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("starting the Bike");
    }

    @Override
    public void stop() {
        System.out.println("stoping the Bike");
    }

    @Override
    public void gearUp() {
        System.out.println("gear up to increase speed");
    }
}
