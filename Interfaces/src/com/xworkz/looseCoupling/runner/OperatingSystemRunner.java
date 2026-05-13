package com.xworkz.looseCoupling.runner;

import com.xworkz.looseCoupling.SuperMarket.SuperMarket;
import com.xworkz.looseCoupling.operatingSystem.LinuxOperatingSystem;
import com.xworkz.looseCoupling.operatingSystem.OperatingSystem;
import com.xworkz.looseCoupling.operatingSystem.WindowsOperatingSystem;
import com.xworkz.looseCoupling.usage.Dell;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        //OperatingSystem operatingSystem=new WindowsOperatingSystem();
        OperatingSystem operatingSystem1=new LinuxOperatingSystem();
        Dell dell=new Dell(operatingSystem1);
        dell.laptop();
    }
}
