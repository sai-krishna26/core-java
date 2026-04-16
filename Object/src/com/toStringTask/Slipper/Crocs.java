package com.toStringTask.Slipper;

public class Crocs extends Slipper{
    double price;
    int size;

    @Override
    public void sprint() {
        System.out.println("overrided sprint() inside the crocs");
    }

    @Override
    public void walk() {
        System.out.println("overrided walk() inside the crocs");
    }

    @Override
    public String toString() {
        return "price:"+price+" size:"+size;
    }
}
