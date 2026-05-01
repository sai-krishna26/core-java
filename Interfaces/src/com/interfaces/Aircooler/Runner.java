package com.interfaces.Aircooler;

public class Runner {
    public static void main(String[] args) {
        Aircooler aircooler=new Aircooler();
        System.out.println("rotation speed:"+Aircooler.ROTATESPEED);
        System.out.println("rotation direction:"+Aircooler.DIRECTION);

        aircooler.speed();
        aircooler.swip();
        aircooler.pump();
    }
}
