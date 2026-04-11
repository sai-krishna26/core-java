package com.xworkz.overriding.Restaurant;

public class FiveStarRestaurant extends Restaurant {
    @Override
    public void biryaniPrice() {
        System.out.println("Biryani price is expensive");
    }
}
