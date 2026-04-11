package com.xworkz.overriding;
import com.xworkz.overriding.Restaurant.Restaurant;
import com.xworkz.overriding.Restaurant.FiveStarRestaurant;
import com.xworkz.overriding.Browser.Browser;
import com.xworkz.overriding.Browser.ChromeBrowser;

public class RestBroRunner {
        public static void main(String[] args) {
            FiveStarRestaurant fsr = new FiveStarRestaurant();
            fsr.biryaniPrice();

            Restaurant restaurant1 = new FiveStarRestaurant();
            restaurant1.biryaniPrice();

            Restaurant restaurant = new Restaurant();
            restaurant.biryaniPrice();

            ChromeBrowser chrome = new ChromeBrowser();
            chrome.browse();

            Browser browser1 = new ChromeBrowser();
            browser1.browse();

            Browser browser = new Browser();
            browser.browse();
        }
}
