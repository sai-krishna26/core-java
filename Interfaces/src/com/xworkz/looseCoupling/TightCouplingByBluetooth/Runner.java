package com.xworkz.looseCoupling.TightCouplingByBluetooth;

public class Runner {
    public static void main(String[] args) {
        BoultBluetoothT boultBluetoothT=new BoultBluetoothT();
        WirelessT wirelessT=new WirelessT();
        wirelessT.setBluetoothT(boultBluetoothT);
        wirelessT.sensor();
    }
}
