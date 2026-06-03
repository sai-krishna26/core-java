package com.flyng.fightStatusSearch.service;

import com.flyng.flightSearch.dao.FlightSearchDao;
import com.flyng.flightSearch.dto.FlightSearchDto;
import com.flyng.flightSearch.service.FlightSearchService;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class FlightStatusSearchServiceImpl implements FlightSearchService{
    private FlightSearchDao flightSearchDao;
    @Override
    public boolean validateAndSearch(FlightSearchDto flightSearchDto) {
        System.out.println("validating..!");
        if(Objects.nonNull(flightSearchDao))
        {
            System.out.println("validation completed!");
            return this.flightSearchDao.searchFlight(flightSearchDto);
        }
        System.out.println("flightSearchDao should not be null!!");
        return false;
    }
}
