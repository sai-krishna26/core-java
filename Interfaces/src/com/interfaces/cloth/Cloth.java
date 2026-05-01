package com.interfaces.cloth;

public class Cloth implements Carry{
    @Override
    public void wear() {
        System.out.println("cloth can wear");
    }

    @Override
    public void wash() {
        System.out.println("cloth can be wash");
    }

    @Override
    public void tear() {
        System.out.println("cloth can be tear");
    }
}

