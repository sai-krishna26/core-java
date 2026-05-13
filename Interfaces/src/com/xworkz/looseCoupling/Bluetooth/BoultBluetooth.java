package com.xworkz.looseCoupling.Bluetooth;

public class BoultBluetooth implements Bluetooth{

    @Override
    public void connect() {
        System.out.println("executing the connect in BoultBluetooth");
    }

    @Override
    public void disConnect() {
        System.out.println("executing the disConnect in BoultBluetooth");
    }
}
