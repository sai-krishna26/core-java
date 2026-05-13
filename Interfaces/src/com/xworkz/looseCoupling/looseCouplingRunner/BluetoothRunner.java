package com.xworkz.looseCoupling.looseCouplingRunner;

import com.xworkz.looseCoupling.Bluetooth.Bluetooth;
import com.xworkz.looseCoupling.Bluetooth.BoultBluetooth;
import com.xworkz.looseCoupling.Bluetooth.boatBluetooth;
import com.xworkz.looseCoupling.usage.Wireless;

public class BluetoothRunner {
    public static void main(String[] args) {
        //Bluetooth bluetooth=new boatBluetooth();
        Bluetooth bluetooth=new BoultBluetooth();
        Wireless wireless=new Wireless();
        wireless.setBluetooth(bluetooth);
        wireless.Sensor();
    }
}
