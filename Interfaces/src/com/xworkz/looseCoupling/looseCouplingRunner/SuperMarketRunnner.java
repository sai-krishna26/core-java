package com.xworkz.looseCoupling.looseCouplingRunner;

import com.xworkz.looseCoupling.SuperMarket.MoreSuperMarket;
import com.xworkz.looseCoupling.SuperMarket.SuperMarket;
import com.xworkz.looseCoupling.usage.Producer;

public class SuperMarketRunnner {
    public static void main(String[] args) {
        SuperMarket superMarket=new MoreSuperMarket();

        Producer producer=new Producer(superMarket);
        producer.products();
    }
}