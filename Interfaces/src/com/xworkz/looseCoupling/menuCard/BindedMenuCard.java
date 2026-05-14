package com.xworkz.looseCoupling.menuCard;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class BindedMenuCard implements MenuCard{
    @Override
    public String[] getItems(int itemId, String itemName) {
        System.out.println("itemId:"+itemId);
        System.out.println("itemName:"+itemName);
        return new String[]{"idli","vada","dosa","paddu"};
    }
}
