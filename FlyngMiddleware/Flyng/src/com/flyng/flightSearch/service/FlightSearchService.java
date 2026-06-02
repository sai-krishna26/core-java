package com.flyng.flightSearch.service;

import com.flyng.flightSearch.dto.FlightSearchDto;

public interface FlightSearchService {
    boolean validateAndSearch(FlightSearchDto flightSearchDto);
}
