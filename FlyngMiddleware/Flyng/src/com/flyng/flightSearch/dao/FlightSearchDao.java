package com.flyng.flightSearch.dao;

import com.flyng.flightSearch.dto.FlightSearchDto;

public interface FlightSearchDao{
    boolean searchFlight(FlightSearchDto flightSearchDto);
}
