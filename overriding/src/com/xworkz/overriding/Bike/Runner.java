package com.xworkz.overriding.Bike;

public class Runner {
    public static void main(String[] args) {
        Rx100 rx100 = new Rx100();
        rx100.Ride();

        Bike bike = new Bike();
        bike.Ride();

        Bike bike1 = new Rx100();
        bike1.Ride();
    }
}
