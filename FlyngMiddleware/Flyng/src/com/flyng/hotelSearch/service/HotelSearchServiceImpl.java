package com.flyng.hotelSearch.service;

import com.flyng.hotelSearch.dao.HotelSearchDao;
import com.flyng.hotelSearch.dto.HotelSearchDto;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class HotelSearchServiceImpl implements HotelSearchService{
    private HotelSearchDao hotelSearchDao;

    @Override
    public boolean validateAndSearch(HotelSearchDto hotelSearchDto) {
        System.out.println("validating hotel data..!");
        if(Objects.nonNull(hotelSearchDao))
        {
            System.out.println("validating completed!");
            return this.hotelSearchDao.hotelSearch(hotelSearchDto);
        }
        System.err.println("hotelSearchDao is should not be null!");
        return false;
    }
}
