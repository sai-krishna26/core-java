package com.toStringTask.concert;

public class Concert
{
    String[] artistName;
    Mananger mananger;
    String location;
    Type type;
    boolean isLive;

    public void start() {
        System.out.println("Concert is started");
    }

    public void end() {
        System.out.println("Concert is ended");
    }

    @Override
    public String toString() {
        return "location:"+location+ "; type:"+type+ "; isLive:"+isLive+ "; organizer:"+ mananger;
    }
}
