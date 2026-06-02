package com.flyng.cabSearch.service;

import com.flyng.cabSearch.dao.CabSearchDao;
import com.flyng.cabSearch.dto.CabSearchDto;
import lombok.AllArgsConstructor;

import java.sql.SQLOutput;
import java.util.Objects;

@AllArgsConstructor
public class CabSearchServiceImpl implements CabSearchService{
    private CabSearchDao cabSearchDao;
    @Override
    public boolean validateAndSearch(CabSearchDto cabSearchDto) {
        System.out.println("validating Cab data..!");
        if(Objects.nonNull(cabSearchDto))
        {
            System.out.println("validation completed!");
            return cabSearchDao.cabSearch(cabSearchDto);
        }
        System.err.println("cabSerachDto should not be null!");
        return false;
    }
}
