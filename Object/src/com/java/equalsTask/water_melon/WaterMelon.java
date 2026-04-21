package com.java.equalsTask.water_melon;

public class WaterMelon {
    String color;
    double price;
    double weight;

    public WaterMelon(String color, double price, double weight) {
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WaterMelon{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        WaterMelon leftSide=this;
        if(obj instanceof WaterMelon)
        {
            WaterMelon rightSide=(WaterMelon)obj;
            if (leftSide.color==rightSide.color && leftSide.price==rightSide.price && leftSide.weight==rightSide.weight)
            {
                return true;
            }

        }
        return super.equals(obj);
    }
}
