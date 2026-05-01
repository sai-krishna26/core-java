package com.interfaces.mobile;

public class Mobile implements Sound{

    @Override
    public void high() {
        System.out.println("mobile has a high sound");
    }

    @Override
    public void low() {
        System.out.println("mobile has a low sound");
    }

    @Override
    public void good() {
        System.out.println("mobile has a good sound");
    }
}
