package com.flyng.fightStatusSearch.dao;

import com.flyng.fightStatusSearch.dto.flightStatusSearchDto;

public interface FlightStatusSearchDao {
    boolean statusCheck(flightStatusSearchDto flightStatusSearchDto);
}
