package com.flyng.cabSearch.runner;

import com.flyng.cabSearch.dao.CabSearchDao;
import com.flyng.cabSearch.dao.CabSearchDaoImpl;
import com.flyng.cabSearch.dto.CabSearchDto;
import com.flyng.cabSearch.service.CabSearchService;
import com.flyng.cabSearch.service.CabSearchServiceImpl;

public class CabSearchRunner {
    public static void main(String[] args) {
        CabSearchDto cabSearchDto=new CabSearchDto();
        CabSearchDao cabSearchDao=new CabSearchDaoImpl();
        CabSearchService cabSearchService=new CabSearchServiceImpl(cabSearchDao);
        cabSearchService.validateAndSearch(cabSearchDto);
    }
}
