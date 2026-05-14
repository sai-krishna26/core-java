package com.xworkz.looseCoupling.remote;

public interface Remote {
    default void turnOff()
    {
        System.out.println("execution of default method turnOf in Remote");
    }

    void turnOn();
}
