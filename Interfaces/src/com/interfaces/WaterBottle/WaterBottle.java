package com.interfaces.WaterBottle;

public class WaterBottle implements StoreWater{
    @Override
    public void fill() {
        System.out.println("waterbottle is filled with water");
    }

    @Override
    public void unfill() {
        System.out.println("waterbottle is unfilled from water");
    }

    @Override
    public void empty() {
        System.out.println("waterbottle is empty");
    }
}
