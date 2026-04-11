package com.xworkz.overriding.Turbine;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Runner {
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.rotate();

        Turbine turbine1=new Fan();
        turbine1.rotate();

        Turbine turbine=new Turbine();
        turbine.rotate();
    }
}
