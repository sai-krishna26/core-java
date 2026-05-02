package com.interfaces.wood;

public class Wood implements Door {
    @Override
    public void carpentry() {
        System.out.println("carpentry should required wood");
    }

    @Override
    public void paper() {
        System.out.println("paper is made by wood");
    }

    @Override
    public void support() {
        System.out.println("support can provide wood");
    }
}
