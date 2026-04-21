package com.java.equalsTask.industry;

public class IndustryRunner {
    public static void main(String[] args) {
        Industry industry=new Industry("SandalWood","Rishab Shetty",38);
        Industry industry1=new Industry("SandalWood","Rishab Shetty",38);
        Industry industry2=new Industry("TollWood","NTR",40);

        boolean equalsCheck=industry.equals(industry1);
        if (equalsCheck)
        {
            System.out.println("similar instances found!!");
        }
        else
        {
            System.out.println("no similar instances!!");
        }
        System.out.println("equals check of industry instances:"+equalsCheck);

    }
}
