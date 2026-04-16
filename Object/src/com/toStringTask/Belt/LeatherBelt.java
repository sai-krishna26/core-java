package com.toStringTask.Belt;

public class LeatherBelt extends Belt {
    double price;

    @Override
    public void wear() {
        System.out.println("Leather belt is worn");
    }

    @Override
    public void remove() {
        System.out.println("Leather belt is removed");
    }

    @Override
    public String toString() {
        return "price:"+price;
    }
}