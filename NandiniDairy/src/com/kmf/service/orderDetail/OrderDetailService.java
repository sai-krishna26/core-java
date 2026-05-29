package com.kmf.service.orderDetail;

import com.kmf.dto.OrderDetailDto;

public interface OrderDetailService {
    public boolean validateAndService(OrderDetailDto orderDetailDto);
}
