package com.kmf.runner;

import com.kmf.dto.ExpiredProductDetailDto;
import com.kmf.service.ExpiredProductDetail.ExpiredProductDetailService;
import com.kmf.service.ExpiredProductDetail.ExpiredProductDetailServiceImp;

public class ExpiredProductDetailRunner
{
    public static void main(String[] args) {
        ExpiredProductDetailDto expiredProductDetailDto=new ExpiredProductDetailDto("curd","NDN90","Nandini",35.98f,"Diary");
        ExpiredProductDetailServiceImp expiredProductDetailServiceImp=new ExpiredProductDetailServiceImp();
        expiredProductDetailServiceImp.validateAndService(expiredProductDetailDto);
    }
}
