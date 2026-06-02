package com.flyng.flightSearch.service;

import com.flyng.flightSearch.dto.FlightSearchDto;
import com.flyng.flightSearch.dao.FlightSearchDao;

import java.util.Objects;

public class FlightSearchServiceImpl implements FlightSearchService{
    private FlightSearchDao flightSearchDao;
    public FlightSearchServiceImpl(FlightSearchDao flightSearchDao)
    {
        this.flightSearchDao=flightSearchDao;
    }
    @Override
    public boolean validateAndSearch(FlightSearchDto flightSearchDto)
    {
        System.out.println("validating flight data..!");
        if(Objects.nonNull(flightSearchDao))
        {
            System.out.println("validation completed!");
            return this.flightSearchDao.searchFlight(flightSearchDto);

        }
        System.err.println("FlightSearchDto should not be null");
        return false;
    }

}
