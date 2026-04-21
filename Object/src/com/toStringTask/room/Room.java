package com.toStringTask.room;

public class Room {
    String[] roomTypes;
    Wall wall;
    Measurement measurement;
    String tiles;
    boolean hasAc;

    public void store()
    {
        System.out.println("Room is used to store");
    }

    public void foodPrepare()
    {
        System.out.println("inside Room food can be prepared");
    }

    @Override
    public String toString() {
        return "tiles colour:"+tiles+", hasAC:"+hasAc+", Wall:"+wall+", measurement:"+measurement+", room types:"+roomTypes;
    }
}
