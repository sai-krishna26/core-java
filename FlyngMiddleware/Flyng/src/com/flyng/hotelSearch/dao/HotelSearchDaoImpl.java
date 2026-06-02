package com.flyng.hotelSearch.dao;

import com.flyng.hotelSearch.dto.HotelSearchDto;

import java.util.Objects;

public class HotelSearchDaoImpl implements HotelSearchDao{

    @Override
    public boolean hotelSearch(HotelSearchDto hotelSearchDto) {
        System.out.println("searching hotels...");
        if(Objects.nonNull(hotelSearchDto))
        {
            System.out.println("saving hotel data! and hotel found!!");
            return true;
        }
        System.out.println("hotelSearchDto should't be null");
        return false;
    }
}
