package com.flyng.hotelSearch.service;
import com.flyng.hotelSearch.dto.HotelSearchDto;

public interface HotelSearchService {
    boolean validateAndSearch(HotelSearchDto hotelSearchDto);
}
