package com.kmf.service.CustomerDetail;

import com.kmf.dto.CustomerDetailDto;

public class CustomerDetailServiceImp implements CustomerDetailService{


    @Override
    public boolean validateAndService(CustomerDetailDto customerDetailDto) {
        System.out.println("executing validateAndService in CustomerDetailServiceImp:{}"+customerDetailDto);
        String customerName=customerDetailDto.getName();
        if(customerName == null && customerName.length() < 3)
        {
            System.err.println("invalid customerName");
            return false;
        }

        if(customerDetailDto.getC_Id()<=0)
        {
            System.err.println("c_Id should be greaterthan zero");
            return false;
        }

        if(customerDetailDto.getAddress()!=null) {

        }
        else
        {
            System.err.println("email should not be null");
            return false;
        }
        System.out.println("valid credentials");
        return false;
    }
}
