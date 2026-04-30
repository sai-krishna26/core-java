package com.interfaces.vehicle;

public class Runner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println("type: "+Vehicle.TYPE);
        System.out.println("wheels count: "+Vehicle.noOfWheels);


        bike.start();
        bike.stop();
        bike.gearUp();
    }
}