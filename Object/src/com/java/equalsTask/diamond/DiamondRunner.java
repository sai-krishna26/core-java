package com.java.equalsTask.diamond;

public class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond=new Diamond("Natural","Transparent",true);
        System.out.println(diamond);
        Diamond diamond1=new Diamond("Lab","Red",false);
        System.out.println(diamond1);

        boolean check=diamond.equals(diamond1);
        System.out.println("diamond.equals(diamond1)="+check);
    }
}
