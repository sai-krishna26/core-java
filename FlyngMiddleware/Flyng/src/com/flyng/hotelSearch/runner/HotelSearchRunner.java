package com.flyng.hotelSearch.runner;

import com.flyng.hotelSearch.dao.HotelSearchDao;
import com.flyng.hotelSearch.dao.HotelSearchDaoImpl;
import com.flyng.hotelSearch.dto.HotelSearchDto;
import com.flyng.hotelSearch.service.HotelSearchService;
import com.flyng.hotelSearch.service.HotelSearchServiceImpl;

public class HotelSearchRunner {
    public static void main(String[] args) {
        HotelSearchDto hotelSearchDto=new HotelSearchDto();
        HotelSearchDao hotelSearchDao=new HotelSearchDaoImpl();
        HotelSearchService hotelSearchService=new HotelSearchServiceImpl(hotelSearchDao);
        hotelSearchService.validateAndSearch(hotelSearchDto);
    }
}
