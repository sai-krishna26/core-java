package com.xworkz.looseCoupling.keyboard;

public interface KeyBoard {
    default void press()
    {
        System.out.println("executing the press in Keyboard");
    }
    void move();
}
