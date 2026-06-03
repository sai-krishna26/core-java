package com.flyng.fightStatusSearch.dao;

import com.flyng.fightStatusSearch.dto.flightStatusSearchDto;

import java.util.Objects;

public class FlightStatusSearchDaoImpl implements FlightStatusSearchDao{
    @Override
    public boolean statusCheck(flightStatusSearchDto flightStatusSearchDto) {
        System.out.println("checking flight status");
        if(Objects.nonNull(flightStatusSearchDto))
        {
            System.out.println("flight status data stored and status is updated");
            return true;
        }
        System.out.println("flightStatusSearchDto should not be null");
        return false;
    }
}
