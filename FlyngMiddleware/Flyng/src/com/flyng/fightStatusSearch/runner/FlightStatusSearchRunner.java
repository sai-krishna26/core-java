package com.flyng.fightStatusSearch.runner;

import com.flyng.flightSearch.constants.Currency;
import com.flyng.flightSearch.constants.TripType;
import com.flyng.flightSearch.dao.FlightSearchDao;
import com.flyng.flightSearch.dao.FlightSearchDaoImpl;
import com.flyng.flightSearch.dto.FlightSearchDto;
import com.flyng.flightSearch.service.FlightSearchService;
import com.flyng.flightSearch.service.FlightSearchServiceImpl;

import java.time.LocalDate;

public class FlightStatusSearchRunner{
    public static void main(String[] args) {
        FlightSearchDto flightSearchDto=new FlightSearchDto();
        FlightSearchDto flightSearchDto1=new FlightSearchDto(TripType.ROUND_TRIP,Currency.INR,"bengaluru","bidar", LocalDate.now(),2);
        FlightSearchDao flightSearchDao=new FlightSearchDaoImpl();
        FlightSearchService flightSearchService=new FlightSearchServiceImpl(flightSearchDao);
        flightSearchService.validateAndSearch(flightSearchDto1);
    }
}
