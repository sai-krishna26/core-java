package com.java.MainPack;

public class Ball {

    protected void roll()
    {
        System.out.println("running roll in Ball");
    }

//    @Override
//    public String toString() {
//        return "Hiiii";
//    }

    @Override
   public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
