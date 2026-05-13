package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.hospital.Hospital;

import java.util.Objects;

public class Doctor {
private Hospital hospital;

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void patient()
    {
        if(Objects.nonNull(hospital))
        {
            System.out.println("executomh");
            this.hospital.checkup();
            this.hospital.treatment();
        }
    }
}
