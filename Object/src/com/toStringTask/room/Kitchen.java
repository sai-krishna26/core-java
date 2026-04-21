package com.toStringTask.room;

public class Kitchen extends Room{
    boolean hasCylinder;
    String foodName;

    @Override
    public void store() {
        System.out.println("executing store in kitchen");
    }

    @Override
    public void foodPrepare() {
        System.out.println("executing foodPrepare in kitchen");
    }

    @Override
    public String toString() {
        return "hasCylinder:"+hasCylinder+", food name:"+foodName;
    }
}
