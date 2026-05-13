package com.xworkz.looseCoupling.operatingSystem;

public class WindowsOperatingSystem implements OperatingSystem{

    @Override
    public void boot() {
        System.out.println("executing the boot in WindowsOperatingSystem");
    }

    @Override
    public void start() {
        System.out.println("executing the start in WindowsOperatingSystem");
    }
}
