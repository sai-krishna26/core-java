package com.cloths.runner;

import com.cloths.cloths.halfsleevs.Roadster;
import com.cloths.cloths.halfsleevs.Snitch;

public class ShirtRunner {
    public static void main(String[] args) {
        Snitch snitch = new Snitch();
        snitch.clothType();
        snitch.pocketCount();

        Roadster roadster = new Roadster();
        roadster.clothType();
    }

}
