package com.showroom;

public class Electric implements ElectricVehicle,Accessory {
    public void eengine()
    {
        System.out.println("it does not have a engine like fuel engines");
    }

    public void egear()
    {
        System.out.println("electric vehicles does not have a gearbox");
    }

    public void engine()
    {
        System.out.println("from Electric>>Electronic Vehicle , Accessory");
    }

    @Override
    public void gear() {
        System.out.println("(gear)from Electric>>Electronic Vehicle , Accessory");
    }

}
