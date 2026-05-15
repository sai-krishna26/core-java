package com.xworkz.dto.normalClass;

import java.io.Serializable;

public class ResumeDto implements Serializable {

    private String name;
    private String[] skills;
    private int age;

    public int getAge() {
        return age;
    }

    public String[] getSkills() {
        return skills;
    }

    public String getName()
    {
        return name;
    }

    public ResumeDto(String name, String[] skills, int age)
    {
        this.name=name;
        this.skills=skills;
        this.age=age;
    }

    public ResumeDto(){}

    public void setName(String name1)
    {
        this.name=name1;
    }

    public void setAge(int age1)
    {
        this.age=age1;
    }

    public void setSkills(String[] skills1)
    {
        this.skills=skills1;
    }
}
