package com.xworkz.looseCoupling.Bluetooth;

public class boatBluetooth implements Bluetooth{

    @Override
    public void connect() {
        System.out.println("executing connect in boatBluetooth");
    }

    @Override
    public void disConnect() {
        System.out.println("executing disconnect in boarBluetooth");
    }
}
