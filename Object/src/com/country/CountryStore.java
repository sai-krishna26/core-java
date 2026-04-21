package com.country;

import java.sql.SQLOutput;

public class CountryStore
{
    Country[] countries;
    int currentIndex=0;

    public CountryStore(Country[] countries)
    {
        this.countries=countries;
    }

    public void save(Country country)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing save method");
        int size=this.countries.length;
        if(country != null)
        {
            if(this.currentIndex<size)
            {
              this.countries[this.currentIndex]=country;
              System.out.println("country "+country+" is stored");
              this.currentIndex++;
            }
            else{
                System.out.println("Array is full!");
            }
        }
        else
        {
            System.out.println("country name/reference should not be null");
        }
    }
//===================================================================================
    public Country findByName(String name)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findByName method");
        int size=this.countries.length;
        if(name!=null)
        {
            for (Country contri:countries)
            {
                if(name.equals(contri.name))
                {
                    System.out.println("name:"+name+" found!");
                    return contri;
                }
            }
        }
        else
        {
            System.out.println("name should not be null");
        }
        return null;
    }

//============================================================================
    public State findStateByStateName(String stateName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findStateByStateName method");
        int size=this.countries.length;
        if(stateName!=null)
        {
            for (Country contri:countries)
            {
                if(contri!=null && contri.states!=null)
                {
                    for (State st:contri.states)
                    {
                        if (stateName.equals(st.name))
                        {
                            System.out.println("name:" + stateName + " found!");
                            return st;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("name should not be null");
        }
        return null;
    }

    //=============================================================================

    public City[] findAllCityByStateName(String stName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findAllCityByStateName method");
        int size=this.countries.length;
        if(stName!=null)
        {
            for (Country contri:countries)
            {
                if(contri!=null && contri.states!=null)
                {
                    for(State  st:contri.states)
                    {
                        if(st != null)
                        {
                            if(stName.equals(st.name))
                            {
                                return st.cities;
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("stName should not be null");
        }
        return null;
    }

    //============================================================================

    public int findNoOfDistrictsByCityName(String ctName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findNoOfDistrictsByCityName method");
        if(ctName!=null)
        {
            for(Country contri:countries)
            {
                if(contri!=null && contri.states!=null)
                {
                    for (State st:contri.states)
                    {
                        if(st!=null && st.cities!=null)
                        {
                            for(City ct: st.cities)
                            {
                                if(ct!=null && ct.districts!=null)
                                {
                                    if(ctName.equals(ct.name))
                                    {
                                        return ct.noOfDistricts;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("ctName should not be null");
        }
        return 0;
    }

    //===================================================================================

    public Country findByCollectorName(String collectorName)
    {
        System.out.println("-----------------------------------------");
        System.out.println("executing findByCollectorName method");
        if(collectorName!=null)
        {
            for(Country contri:countries)
            {
                if(contri!=null && contri.states!=null)
                {
                    for (State st:contri.states)
                    {
                        if(st!=null && st.cities!=null)
                        {
                            for(City ct: st.cities)
                            {
                                if(ct!=null && ct.districts!=null)
                                {
                                    for(District dist: ct.districts)
                                    {
                                        if(dist!=null && dist.collector!=null)
                                        {
                                            if(collectorName.equals(dist.collector.name))
                                            {
                                                return contri;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("collectorName should not be null!");
        }
        return null;
    }





}
