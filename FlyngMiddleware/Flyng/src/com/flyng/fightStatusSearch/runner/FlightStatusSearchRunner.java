package com.flyng.fightStatusSearch.runner;

import com.flyng.flightSearch.dao.FlightSearchDao;
import com.flyng.flightSearch.dao.FlightSearchDaoImpl;
import com.flyng.flightSearch.dto.FlightSearchDto;
import com.flyng.flightSearch.service.FlightSearchService;
import com.flyng.flightSearch.service.FlightSearchServiceImpl;

public class FlightStatusSearchRunner{
    public static void main(String[] args) {
        FlightSearchDto flightSearchDto=new FlightSearchDto();
        FlightSearchDao flightSearchDao=new FlightSearchDaoImpl();
        FlightSearchService flightSearchService=new FlightSearchServiceImpl(flightSearchDao);
        flightSearchService.validateAndSearch(flightSearchDto);
    }
}
