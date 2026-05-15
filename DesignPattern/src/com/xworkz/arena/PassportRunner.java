package com.xworkz.arena;

import com.xworkz.dto.constants.Names;
import com.xworkz.dto.normalClass.PassportDto;

import java.time.LocalDate;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportDto=new PassportDto(100301, Names.SAI, LocalDate.now(),23,"Gurumatkal");
        System.out.println(passportDto.getId());
        System.out.println(passportDto.getDate());
        System.out.println(passportDto.getNames());
        System.out.println(passportDto.getAddress());
        //System.out.println(passportDto.getAge());

        System.out.println("-------------------------------");

        passportDto.setId(10032);
        System.out.println("updated ID:"+passportDto.getId());

    }
}
