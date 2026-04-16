package com.toStringTask.Concert;

public class Organizer {
    String name;
    double budget;

    public Organizer(String name, double budget) {
        this.name = name;
        this.budget = budget;

        System.out.println("organizer name:"+this.name);
        System.out.println("budget:"+this.budget);
    }
}
