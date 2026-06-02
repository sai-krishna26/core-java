package com.kmf.runner;

import com.kmf.dto.SalesDetailDto;
import com.kmf.service.serviceDetail.SalesDetailsServiceImp;

public class SalesDetailsRunner {
    public static void main(String[] args) {
        SalesDetailsServiceImp salesDetailsServiceImp=new SalesDetailsServiceImp();
        SalesDetailDto salesDetailDto=new SalesDetailDto("ramesh","ghee",20000.0,true,"Chikmagalur");
        salesDetailsServiceImp.validateAndService(salesDetailDto);
    }
}
