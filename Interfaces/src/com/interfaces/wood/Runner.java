package com.interfaces.wood;

public class Runner {
    public static void main(String[] args)
    {
        Wood wood=new Wood();
        System.out.println("door type:"+Door.TYPE);
        System.out.println("door weight:"+Door.WEIGHT);

        wood.carpentry();
        wood.paper();
        wood.support();
    }
}
