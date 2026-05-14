package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.remote.Remote;

import java.util.Objects;

public class User {
    private Remote remote;

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public void volume()
    {
        if (Objects.nonNull(remote))
        {
            System.out.println("calling turOn:");
            this.remote.turnOn();
            System.out.println("calling turOff:");
            this.remote.turnOff();
        }
    }
}
