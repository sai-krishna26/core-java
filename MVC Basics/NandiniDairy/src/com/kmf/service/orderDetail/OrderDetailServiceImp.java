package com.kmf.service.orderDetail;

import com.kmf.dto.OrderDetailDto;

public class OrderDetailServiceImp implements OrderDetailService
{
    @Override
    public boolean validateAndService(OrderDetailDto orderDetailDto)
    {
        System.out.println("executing validateAndService in OrderDetailServiceImp:{}" + orderDetailDto);
        String orderName = orderDetailDto.getOrderName();
        if (orderName != null && orderName.length() >= 3 && orderName.length() <= 100 && orderName.matches("[a-zA-Z ,]+")) {
            System.out.println("valid orderName");
        } else {
            System.err.println("invalid orderName");
            return false;
        }

        if (orderDetailDto.getPaymentStatus().equals("pending"))
        {
            System.err.println("pending payment should be cleared");
            return false;
        }
        System.out.println("validation is done");
        return false;
    }
}
