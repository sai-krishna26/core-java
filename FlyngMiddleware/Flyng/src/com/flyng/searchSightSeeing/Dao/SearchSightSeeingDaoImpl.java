package com.flyng.searchSightSeeing.Dao;

import com.flyng.searchSightSeeing.Dto.SearchSightSeeingDto;

import java.util.Objects;

public class SearchSightSeeingDaoImpl implements SearchSightSeeingDao{
    @Override
    public boolean sightSearch(SearchSightSeeingDto searchSightSeeingDto) {
        System.out.println("searching sights....");
        if(Objects.nonNull(searchSightSeeingDto))
        {
            System.out.println("sight data is stored and sight found!!");
            return true;
        }
        System.err.println("searchSightSeeingDto should not be null");
        return false;
    }
}
