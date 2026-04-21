package com.toStringTask.room;

public class Wall {
    String color;
    double length;

    public Wall(String color, double length) {
        this.color = color;
        this.length = length;

        System.out.println("wall colour:"+this.color);
        System.out.println("wall length:"+this.length);
    }
}
