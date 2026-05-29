package com.kmf.service.serviceDetail;

import com.kmf.dto.SalesDetailDto;

public class SalesDetailsServiceImp implements SalesDetailsService {
    @Override
    public boolean validateAndService(SalesDetailDto salesDetailDto) {
        System.out.println("running validateAndService:"+salesDetailDto);
        return false;
    }
}
