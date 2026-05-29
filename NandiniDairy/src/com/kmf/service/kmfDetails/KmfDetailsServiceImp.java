package com.kmf.service.kmfDetails;

import com.kmf.dto.KmfDetailsDto;

public class KmfDetailsServiceImp implements KmfDetailsService{
    @Override
    public boolean validateAndService(KmfDetailsDto kmfDetailsDto)
    {
        System.out.println("executing validateAndService in KmfDetailsServiceImp:{}"+ kmfDetailsDto);
        String companyName=kmfDetailsDto.getCompanyName();
        if(companyName == null && companyName.length() < 3)
        {
            System.err.println("invalid companyName");
            return false;
        }

        if(!kmfDetailsDto.isOpen())
        {
            System.err.println("isOpen means company should be in running(true) state");
            return false;
        }

        if(kmfDetailsDto.getEmail()!=null && kmfDetailsDto.getEmail().toLowerCase().contains("@gmail.com")) {

        }
        else
        {
            System.err.println("invalid email");
            return false;
        }
        System.out.println("valid credentials \uD83D\uDC4D");
        return false;
    }
}
