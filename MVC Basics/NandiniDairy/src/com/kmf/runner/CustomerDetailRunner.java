package com.kmf.runner;

import com.kmf.dto.CustomerDetailDto;
import com.kmf.service.CustomerDetail.CustomerDetailServiceImp;

public class CustomerDetailRunner {
    public static void main(String[] args) {
        CustomerDetailServiceImp customerDetailServiceImp=new CustomerDetailServiceImp();
        CustomerDetailDto customerDetailDto=new CustomerDetailDto("Ramesh",445,"Yadgir","male","regular");
        customerDetailServiceImp.validateAndService(customerDetailDto);
    }
}
