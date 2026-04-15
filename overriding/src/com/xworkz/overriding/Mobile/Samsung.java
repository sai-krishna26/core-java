package com.xworkz.overriding.Mobile;

public class Samsung extends Mobile{
    @Override
    public void notification() {
//        super.notification();
        System.out.println("executing samsung constructor");
    }
}
