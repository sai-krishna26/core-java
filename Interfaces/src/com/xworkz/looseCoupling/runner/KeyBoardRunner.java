package com.xworkz.looseCoupling.runner;

import com.xworkz.looseCoupling.keyboard.HpKeyBoard;
import com.xworkz.looseCoupling.keyboard.KeyBoard;
import com.xworkz.looseCoupling.usage.Cpu;

public class KeyBoardRunner {
    public static void main(String[] args) {
        KeyBoard keyBoard=new HpKeyBoard();
        Cpu cpu=new Cpu(keyBoard);
        cpu.enter();
    }
}
