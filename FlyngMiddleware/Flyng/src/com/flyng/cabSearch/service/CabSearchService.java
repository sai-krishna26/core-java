package com.flyng.cabSearch.service;

import com.flyng.cabSearch.dto.CabSearchDto;

public interface CabSearchService {
    boolean validateAndSearch(CabSearchDto cabSearchDto);
}
