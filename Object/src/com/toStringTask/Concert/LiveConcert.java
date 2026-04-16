package com.toStringTask.Concert;

public class LiveConcert extends Concert {
    double ticketPrice;

    @Override
    public void start() {
        System.out.println("Live concert is started");
    }

    @Override
    public void end() {
        System.out.println("Live concert is ended");
    }

    @Override
    public String toString() {
        return "ticketPrice:"+ticketPrice;
    }
}