package com.country;

public class CountryRunner {
    public static void main(String[] args) {

        Collector collector=new Collector("Harshal Bhoyar","2016 batch");
        Collector collector1=new Collector("P. Rajendra Cholan","2008 batch");
        Collector collector2=new Collector("Annamalai","2011 batch");

        Collector collector3=new Collector("krishnakanth","2022 batch");
        //......................................................

        District district=new District("Bengaluru urban",collector);
        District district1=new District("Bengaluru rural",collector1);
        District district2=new District("Chikkamagaluru",collector2);

        District district3=new District("Bubaneswar",collector3);
        //........................................................

        District[] districts1={district,district1};
        District[] districts2={district2};
        District[] districts3={district3};
        City city=new City("Bengaluru",2,districts1);
        City city1=new City("Chikkamagaluru",1,districts2);

        City city2=new City("Bhubaneshwar",1,districts3);
        //..........................................................

        City[] cities={city,city1};
        City[] cities1={city2};
        State state=new State("Karnataka",69.10,cities);

        State state1=new State("Odisha",50.23,cities1);
        //.............................................................

        Address address=new Address(201234,585214,state);
        Address address1=new Address(208455,110004,state1);
        //............................................................

        President president=new President("Drapadi murmu",60,address1);
        //............................................................
        State[] states={state,state1};
        Country contry=new Country("India",president,states);
        //System.out.println(contry);

        Country[] countryArr=new Country[10];
        CountryStore countryStore=new CountryStore(countryArr);
        //.............=========================.........................

        countryStore.save(contry);

        //countryStore.findByName("India");
        Country countryCheck=countryStore.findByName("India");
        System.out.println(countryCheck);
        //................................................................

        State stateCheck=countryStore.findStateByStateName("Odisha");
        System.out.println(stateCheck);
        //................................................................

        City[] cityCheck=countryStore.findAllCityByStateName("Karnataka");
        if(cityCheck!=null)
        {
            for (City ct:cityCheck)
            {
                System.out.println(ct);
            }
        }
        //.................................................................

        int distCount=countryStore.findNoOfDistrictsByCityName("Bengaluru");
        System.out.println("total districts:"+distCount);
        //.................................................................

        Country countryName=countryStore.findByCollectorName("Harshal Bhoyar");
        System.out.println("country:"+countryName);
    }
}
