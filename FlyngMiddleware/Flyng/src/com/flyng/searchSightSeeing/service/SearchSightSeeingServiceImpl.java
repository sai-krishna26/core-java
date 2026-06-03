package com.flyng.searchSightSeeing.service;

import com.flyng.searchSightSeeing.Dao.SearchSightSeeingDao;
import com.flyng.searchSightSeeing.Dto.SearchSightSeeingDto;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class SearchSightSeeingServiceImpl implements SearchSightSeeingService{
    private SearchSightSeeingDao searchSightSeeingDao;

    @Override
    public boolean validateAndSearch(SearchSightSeeingDto searchSightSeeingDto) {
        System.out.println("validating..!");
        if(Objects.nonNull(searchSightSeeingDao))
        {
            System.out.println("validation completed!");
            return searchSightSeeingDao.sightSearch(searchSightSeeingDto);
        }
        System.err.println("searchSightSeeingDao should not be null");
        return false;
    }
}
