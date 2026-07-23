package com.xworkz.looseCoupling.TightCouplingByBluetooth;

import java.util.Objects;

public class WirelessT {
    BoultBluetoothT bluetoothT;

    public void setBluetoothT(BoultBluetoothT bluetoothT)
    {
        this.bluetoothT=bluetoothT;
    }

    public void sensor()
    {
        if(Objects.nonNull(bluetoothT))
        {
            this.bluetoothT.connect();
            this.bluetoothT.disConnect();
        }
    }
}
