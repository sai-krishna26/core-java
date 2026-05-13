package com.xworkz.looseCoupling.operatingSystem;

public class LinuxOperatingSystem implements OperatingSystem{

    @Override
    public void boot() {
        System.out.println("executing boot in LinuxOperatingSystem");
    }

    @Override
    public void start() {
        System.out.println("executing start in LinuxOperatingSystem");
    }
}
