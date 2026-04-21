package com.toStringTask.concert;

public class RecordedConcert extends Concert {
    double price;
    double range;

    @Override
    public void start() {
        System.out.println("Recorded concert is started");
    }

    @Override
    public void end() {
        System.out.println("Recorded concert is ended");
    }

    @Override
    public String toString() {
        return "ticket price:"+price+"concert range:"+range;
    }
}