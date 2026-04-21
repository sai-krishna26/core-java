package com.country;

import java.util.Arrays;

public class State {
    String name;
    double population;
    City[] cities;

    public State(String name,double population,City[] cities)
    {
        this.name=name;
        this.population=population;
        this.cities=cities;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", city=" + Arrays.toString(cities) +
                '}';
    }
}
