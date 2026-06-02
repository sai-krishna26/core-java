package com.flyng.cabSearch.dao;

import com.flyng.cabSearch.dto.CabSearchDto;

import java.util.Objects;

public class CabSearchDaoImpl implements CabSearchDao{
    @Override
    public boolean cabSearch(CabSearchDto cabSearchDto) {
        System.out.println("seaching cab..!");
        if(Objects.nonNull(cabSearchDto))
        {
            System.out.println("cab data stored! and cab found!");
            return true;
        }
        System.out.println("cabSearchDto should not be null");
        return false;
    }
}
