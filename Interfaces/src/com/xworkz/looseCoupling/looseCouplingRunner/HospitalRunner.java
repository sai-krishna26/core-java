package com.xworkz.looseCoupling.looseCouplingRunner;

import com.xworkz.looseCoupling.hospital.ApolloHospital;
import com.xworkz.looseCoupling.hospital.Hospital;
import com.xworkz.looseCoupling.usage.Doctor;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital=new ApolloHospital();
        hospital.treatment();
        hospital.checkup();
        Doctor doctor=new Doctor();
        doctor.patient();

    }
}
