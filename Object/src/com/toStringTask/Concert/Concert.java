package com.toStringTask.Concert;

public class Concert
{
    String[] artistName;
    Organizer organizer;
    String location;
    ConcertType type;
    boolean isLive;

    public void start() {
        System.out.println("Concert is started");
    }

    public void end() {
        System.out.println("Concert is ended");
    }

    @Override
    public String toString() {
        return "location:"+location+ "; type:"+type+ "; isLive:"+isLive+ "; organizer:"+organizer;
    }
}
