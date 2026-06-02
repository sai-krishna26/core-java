package com.flyng.flightSearch.runner;

import com.flyng.flightSearch.dto.FlightSearchDto;
import com.flyng.flightSearch.dao.FlightSearchDao;
import com.flyng.flightSearch.dao.FlightSearchDaoImpl;
import com.flyng.flightSearch.service.FlightSearchService;
import com.flyng.flightSearch.service.FlightSearchServiceImpl;

public class FlightSearchRunner {
    public static void main(String[] args) {
        FlightSearchDao flightSearchDao=new FlightSearchDaoImpl();
        FlightSearchDto flightSearchDto=new FlightSearchDto();
        FlightSearchService flightSearchService=new FlightSearchServiceImpl(flightSearchDao);
        flightSearchService.validateAndSearch(flightSearchDto);
    }
}
