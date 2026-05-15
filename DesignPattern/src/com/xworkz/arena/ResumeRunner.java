package com.xworkz.arena;

import com.xworkz.dto.normalClass.ResumeDto;

import java.util.Arrays;

public class ResumeRunner {
    public static void main(String[] args) {
        String[] skilaray={"java","sql","dsa"};
        ResumeDto resumeDto =new ResumeDto("sangamesh",skilaray,23);

        //getters
        System.out.println(resumeDto.getName());
        System.out.print("array values:");
        for (String skill : resumeDto.getSkills()) {
            System.out.print(skill+", ");
        }
        System.out.println("\n"+ resumeDto.getAge());


        //setters
        resumeDto.setAge(30);
        resumeDto.setName("vivek");
        resumeDto.setSkills(new String[]{"html","css","js","sql"});

        //updated values
        System.out.println(Arrays.toString(resumeDto.getSkills()));
        System.out.println(resumeDto.getAge());
        System.out.println(resumeDto.getName());


    }
}
