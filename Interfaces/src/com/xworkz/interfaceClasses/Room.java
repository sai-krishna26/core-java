package com.xworkz.interfaceClasses;

public interface Room {
    String roomType="bedroom";
    double roomLength=125.50;
    int windowCount=2;

    void arrival();
    void departure();

    default void security()
    {
        System.out.println("executing security in Room");
    }

    default void Sleep()
    {
        System.out.println("executing sleep in Room");
    }

    static void showRoom()
    {
        System.out.println("executing the show detals in Room");
    }
}
