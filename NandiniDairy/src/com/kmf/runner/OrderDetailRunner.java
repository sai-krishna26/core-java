package com.kmf.runner;

import com.kmf.dto.OrderDetailDto;
import com.kmf.service.orderDetail.OrderDetailService;
import com.kmf.service.orderDetail.OrderDetailServiceImp;

import java.time.LocalDate;

public class OrderDetailRunner {
    public static void main(String[] args) {
        OrderDetailServiceImp orderDetailServiceImp=new OrderDetailServiceImp();
        OrderDetailDto orderDetailDto=new OrderDetailDto(56784,"curd","pending", LocalDate.now(),9878786858L);
        orderDetailServiceImp.validateAndService(orderDetailDto);
    }
}
