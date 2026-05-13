package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.operatingSystem.OperatingSystem;

import java.util.Objects;

public class Dell {
    private OperatingSystem operatingSystem;

    public Dell(OperatingSystem operatingSystem)
    {
        this.operatingSystem=operatingSystem;
    }

    public void laptop()
    {
        if(Objects.nonNull(operatingSystem))
        {
            this.operatingSystem.boot();
            this.operatingSystem.start();
        }
    }
}
