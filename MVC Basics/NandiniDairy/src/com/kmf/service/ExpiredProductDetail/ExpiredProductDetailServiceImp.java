package com.kmf.service.ExpiredProductDetail;

import com.kmf.dto.ExpiredProductDetailDto;

public class ExpiredProductDetailServiceImp implements ExpiredProductDetailService{

    @Override
    public boolean validateAndService(ExpiredProductDetailDto expiredProductDetailDto) {
        System.out.println("executing the validateAndService in ExpiredProductDetailServiceImp:{}"+expiredProductDetailDto);
        if(!expiredProductDetailDto.getProductName().matches("[a-zA-Z ,]+"))
        {
            System.err.println("enter valid product name");
            return false;
        }

        if(!expiredProductDetailDto.getCompanyName().matches("[a-zA-Z ,]+"))
        {
            System.err.println("enter valid company name");
            return false;
        }

        if(!expiredProductDetailDto.getProductType().matches("[a-zA-Z ,]+"))
        {
            System.err.println("enter valid product type");
            return false;
        }

        if(!expiredProductDetailDto.getProductId().matches("^NDN[1-9][0-9]*$"))
        {
            System.err.println("product id is not valid");
            return false;
        }

        if(expiredProductDetailDto.getCost()<10)
        {
            System.err.println("cost should be valid");
            return false;
        }
        System.out.println("validation is completed: no errors");
        return false;
    }
}
