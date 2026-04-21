package com.toStringTask.concert;

public class Mananger {
    String name;
    double budget;

    public Mananger(String name, double budget) {
        this.name = name;
        this.budget = budget;

        System.out.println("organizer name:"+this.name);
        System.out.println("budget:"+this.budget);
    }
}
