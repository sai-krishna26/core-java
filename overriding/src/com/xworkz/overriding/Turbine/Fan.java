package com.xworkz.overriding.Turbine;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Fan extends Turbine {
    @Override
    void rotate()
    {
        System.out.println("Fan rotates to provide Air");
    }
}
