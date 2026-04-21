package com.java.equalsTask.water_melon;

public class WaterMelonRunner {
    public static void main(String[] args) {
        WaterMelon waterMelon=new WaterMelon("Light Green",80.50,2.5);
        WaterMelon waterMelon1=new WaterMelon("Green",60.60,1.8);
        WaterMelon waterMelon2=new WaterMelon("Dark Green",100.99,3.5);

        boolean check=waterMelon2.equals(waterMelon1);
        System.out.println("checking result:"+check);
    }
}
