package com.kmf.runner;

import com.kmf.dto.KmfDetailsDto;
import com.kmf.service.kmfDetails.KmfDetailsService;
import com.kmf.service.kmfDetails.KmfDetailsServiceImp;

public class KmfDetailsRunner {
    public static void main(String[] args) {
        KmfDetailsServiceImp kmfDetailsServiceImp=new KmfDetailsServiceImp();
        KmfDetailsDto kmfDetailsDto=new KmfDetailsDto("X-workz","Bengaluru",true,"x-workzs@gmailz.com",7854214512L);
        kmfDetailsServiceImp.validateAndService(kmfDetailsDto);
    }
}
