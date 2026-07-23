package com.xworkz.looseCoupling.Bluetooth;

public class BoatBluetooth implements Bluetooth{

    @Override
    public void connect() {
        System.out.println("executing connect in BoatBluetooth");
    }

    @Override
    public void disConnect() {
        System.out.println("executing disconnect in BoarBluetooth");
    }
}
