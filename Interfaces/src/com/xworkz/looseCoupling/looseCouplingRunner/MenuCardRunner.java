package com.xworkz.looseCoupling.looseCouplingRunner;

import com.xworkz.looseCoupling.menuCard.BindedMenuCard;
import com.xworkz.looseCoupling.menuCard.MenuCard;
import com.xworkz.looseCoupling.usage.Kitchen;

public class MenuCardRunner {
    public static void main(String[] args) {
        MenuCard menuCard=new BindedMenuCard();
        menuCard.getItems(2022,"dosa");
        Kitchen kitchen=new Kitchen();
        kitchen.setMenuCard(menuCard);

        kitchen.order();
    }
}
