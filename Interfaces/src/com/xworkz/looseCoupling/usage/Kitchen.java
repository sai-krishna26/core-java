package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.menuCard.MenuCard;

import java.util.Objects;

public class Kitchen {
    private MenuCard menuCard;

    public void setMenuCard(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public void order()
    {
        if (Objects.nonNull(menuCard))
        {
            String[] items=this.menuCard.getItems(202601,"idli");

            for(String item:items)
            {
                System.out.println(item);
            }
        }
    }
}
