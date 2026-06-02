package com.kmf.service.serviceDetail;

import com.kmf.dto.SalesDetailDto;

public interface SalesDetailsService {
    boolean validateAndService(SalesDetailDto salesDetailDto);
}
