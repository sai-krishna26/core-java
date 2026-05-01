package com.interfaces.cloth;

public class Runner {
    public static void main(String[] args) {
        Cloth cloth=new Cloth();
        System.out.println("type:"+Carry.TYPE);
        System.out.println("cost:"+Carry.COST);

        cloth.tear();
        cloth.wear();
        cloth.wash();
    }
}
