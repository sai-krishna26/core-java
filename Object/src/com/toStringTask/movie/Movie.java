package com.toStringTask.movie;

public class Movie {
    String[] name;
    Actor actor;
    String director;
    Genre genre;
    boolean isHit;

    public void play() {
        System.out.println("Movie is used to play");
    }

    public void stop() {
        System.out.println("Movie can be stopped");
    }

    @Override
    public String toString() {
        return "isHit:"+isHit+
                "; genre:"+genre+
                "; actor:"+actor+
                "; director:"+director;
    }
}
