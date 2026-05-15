package com.xworkz.arena;


import com.xworkz.dto.constants.Items;
import com.xworkz.dto.normalClass.MarketDto;

public class MarketRunner {
    public static void main(String[] args) {
        MarketDto marketDto=new MarketDto(Items.CLOTHS,1000,"shirt");
        System.out.println(marketDto.getBudget());

        marketDto.setBudget(500);

        System.out.println(marketDto.getBudget());
    }
}
