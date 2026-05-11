package com.xworkz.interfaceClasses;

import java.sql.SQLOutput;

public class Owner implements Room{

    public void arrival()
    {
        System.out.println("executing arrival in Owner");
    }

    public void departure()
    {
        System.out.println("executing departure in Owner");
    }

}
