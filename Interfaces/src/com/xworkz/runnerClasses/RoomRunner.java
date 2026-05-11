package com.xworkz.runnerClasses;

import com.xworkz.interfaceClasses.Owner;
import com.xworkz.interfaceClasses.Room;

public class RoomRunner {
    public static void main(String[] args) {
        Room room=new Owner();
        room.arrival();
        room.departure();
        room.Sleep();
        room.security();

        
        Room.showRoom();
    }
}
