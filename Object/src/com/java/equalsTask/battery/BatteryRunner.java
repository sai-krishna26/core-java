package com.java.equalsTask.battery;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery battery=new Battery("Snapdragon","6000maH",true);
        Battery battery1=new Battery("mediatech","8000maH",true);
        Battery battery2=new Battery("Snapdragon","6000maH",true);


        boolean check=battery.equals(battery1);
        System.out.println("battery.equals(battery1)="+check);
    }
}
