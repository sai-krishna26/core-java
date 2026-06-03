package com.flyng.searchSightSeeing.runner;

import com.flyng.searchSightSeeing.Dao.SearchSightSeeingDao;
import com.flyng.searchSightSeeing.Dao.SearchSightSeeingDaoImpl;
import com.flyng.searchSightSeeing.Dto.SearchSightSeeingDto;
import com.flyng.searchSightSeeing.service.SearchSightSeeingService;
import com.flyng.searchSightSeeing.service.SearchSightSeeingServiceImpl;

public class SearchSightSeeingRunner {
    public static void main(String[] args) {
        SearchSightSeeingDto searchSightSeeingDto=new SearchSightSeeingDto();
        SearchSightSeeingDao searchSightSeeingDao=new SearchSightSeeingDaoImpl();
        SearchSightSeeingService searchSightSeeingService=new SearchSightSeeingServiceImpl(searchSightSeeingDao);
        searchSightSeeingService.validateAndSearch(searchSightSeeingDto);
    }
}
