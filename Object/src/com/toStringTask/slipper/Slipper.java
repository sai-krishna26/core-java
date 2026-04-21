package com.toStringTask.slipper;

public class Slipper {
    String company;
    double price;
    int[] SizeAvailable;
    Colour colour;
    Location location;

    public void sprint()
    {
        System.out.println("sprinting by wearing slipper");
    }

    public void walk()
    {
        System.out.println("walking by wearing slipper");
    }

    @Override
    public String toString() {
        return "company name:"+company+" price:"+price+" Colour:"+colour;
    }
}
