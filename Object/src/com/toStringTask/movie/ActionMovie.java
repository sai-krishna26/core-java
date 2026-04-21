package com.toStringTask.movie;

public class ActionMovie extends Movie {
    double collection;
    String language;

    @Override
    public void play() {
        System.out.println("Action movie is played with fights");
    }

    @Override
    public void stop() {
        System.out.println("Action movie is stopped");
    }

    @Override
    public String toString() {
        return "collection:" + collection + "; Language:" + language;
    }
}
