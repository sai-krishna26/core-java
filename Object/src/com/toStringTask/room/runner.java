package com.toStringTask.room;

import com.toStringTask.medicalShop.Clinic;
import com.toStringTask.medicalShop.MedicalShop;
import com.toStringTask.medicalShop.Owner;
import com.toStringTask.medicalShop.ShopType;

public class runner {
    public static void main(String[] args) {

        String[] roomTypes;
        Wall wall;
        Measurement measurement;
        String tiles;
        boolean hasAc;

        String[] array={"HALL","FLOUR NUMBER"};
        Room room=new Room();
        room.hasAc=false;
        room.tiles="white";
        room.roomTypes=array;
        room.measurement=Measurement.HEIGHT;
        room.store();
        room.foodPrepare();
        System.out.println(room);

        System.out.println("--------------------------------------");
        Wall wall1=new Wall("Blue",10.0);
        System.out.println("--------------------------------------");

        Kitchen kitchen=new Kitchen();
        kitchen.hasCylinder=true;
        kitchen.foodName="chitranna";
        kitchen.store();
        kitchen.foodPrepare();
        System.out.println(kitchen);

    }
}
