package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.keyboard.KeyBoard;

import java.util.Objects;

public class Cpu {
    private KeyBoard keyBoard;

    public Cpu(KeyBoard keyBoard)
    {
        this.keyBoard=keyBoard;
    }

    public void enter()
    {
        if(Objects.nonNull(this.keyBoard))
        {
            this.keyBoard.press();
            this.keyBoard.move();
        }
    }
}
