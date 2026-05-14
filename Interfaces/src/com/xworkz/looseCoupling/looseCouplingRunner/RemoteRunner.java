package com.xworkz.looseCoupling.looseCouplingRunner;

import com.xworkz.looseCoupling.remote.AcRemote;
import com.xworkz.looseCoupling.remote.Remote;
import com.xworkz.looseCoupling.remote.TvRemote;
import com.xworkz.looseCoupling.usage.User;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote=new AcRemote();
        User user=new User();
        user.setRemote(remote);
        user.volume();
        System.out.println("------------------------------");
        Remote remote1=new TvRemote();
        user.setRemote(remote1);
        user.volume();
    }
}
