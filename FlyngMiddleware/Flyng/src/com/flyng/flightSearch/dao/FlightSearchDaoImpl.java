package com.flyng.flightSearch.dao;

import com.flyng.flightSearch.dto.FlightSearchDto;

import java.util.Objects;

public class FlightSearchDaoImpl implements FlightSearchDao{
    @Override
    public boolean searchFlight(FlightSearchDto flightSearchDto) {
        System.out.println("searching flight");
        if(Objects.nonNull(flightSearchDto))
        {
            System.out.println("flight found!");
            return true;
        }
        return false;
    }
}
