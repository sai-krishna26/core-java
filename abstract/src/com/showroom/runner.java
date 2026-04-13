package com.showroom;

import com.showroom.Bike.RoyalEnfield;
import com.showroom.car.Hundai;

public class runner {
    public static void main(String[] args) {
        Accessory accessory=new RoyalEnfield();
        accessory.engine();
        System.out.println("---------------------------------");
        accessory.gear();

        Accessory accessory1=new Hundai();
        accessory1.engine();
        System.out.println("---------------------------------");
        accessory1.gear();

        ElectricVehicle ref=new Electric();
        ref.eengine();
        System.out.println("---------------------------------");
        ref.egear();
        System.out.println("---------------------------------");
        ref.engine();
        System.out.println("---------------------------------");
        ref.gear();
    }
}
