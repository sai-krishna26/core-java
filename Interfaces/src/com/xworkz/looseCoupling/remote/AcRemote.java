package com.xworkz.looseCoupling.remote;

public class AcRemote implements Remote{

    @Override
    public void turnOff() {
        System.out.println("changing default turnOff in AcRemote");
    }

    @Override
    public void turnOn() {
        System.out.println("executing turnOn method in AcRemote");
    }
}
