package com.xworkz.overriding.Car;

import com.xworkz.overriding.App.Instagram;

public class Runner{

    public static void main(String[] args) {
        BmwCar bmwCar=new BmwCar();
        bmwCar.drive();

        Car car1=new Car();
        car1.drive();

        Car car = new BmwCar();
        car.drive();
    }
}
