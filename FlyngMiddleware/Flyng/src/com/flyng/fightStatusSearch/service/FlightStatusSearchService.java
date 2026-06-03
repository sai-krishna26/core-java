package com.flyng.fightStatusSearch.service;

import com.flyng.flightSearch.dao.FlightSearchDao;
import com.flyng.flightSearch.dto.FlightSearchDto;

public interface FlightStatusSearchService{
    boolean validateAndSearch(FlightSearchDto flightSearchDto);
}
