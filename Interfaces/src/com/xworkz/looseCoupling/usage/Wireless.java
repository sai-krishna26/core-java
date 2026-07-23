package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.Bluetooth.Bluetooth;

import java.util.Objects;

public class Wireless {
   private Bluetooth bluetooth;

    public void setBluetooth(Bluetooth bluetooth)
    {
        this.bluetooth = bluetooth;
    }

    public void Sensor()
    {
        if(Objects.nonNull(bluetooth))
        {
            bluetooth.connect();
            bluetooth.disConnect();
        }
        else
        {
            System.err.println("bluetooth is null or not initialized");
        }
    }
}
