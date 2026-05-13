package com.xworkz.looseCoupling.usage;

import com.xworkz.looseCoupling.SuperMarket.SuperMarket;

import java.util.Objects;

public class Producer {
    private SuperMarket superMarket;

    public Producer(SuperMarket superMarket)
    {
        this.superMarket=superMarket;
    }

    public void products()
    {
        if(Objects.nonNull(superMarket))
        {
            this.superMarket.purchase();
            this.superMarket.discount();
        }
    }
}
