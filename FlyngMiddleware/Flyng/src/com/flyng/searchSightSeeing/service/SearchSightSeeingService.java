package com.flyng.searchSightSeeing.service;

import com.flyng.searchSightSeeing.Dto.SearchSightSeeingDto;

public interface SearchSightSeeingService {
    boolean validateAndSearch(SearchSightSeeingDto searchSightSeeingDto);
}
