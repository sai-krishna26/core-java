package com.interfaces.waterBottle;

public class Runner {
    public static void main(String[] args) {
        WaterBottle waterBottle=new WaterBottle();
        System.out.println("capacity:"+StoreWater.capacity);
        System.out.println("colour:"+StoreWater.colour);

        waterBottle.fill();
        waterBottle.unfill();
        waterBottle.empty();
    }
}
