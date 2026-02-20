class FMRadio
{
	static void turnOnOrOff()
	{
		boolean radioState=true;
		
		String radioResult;
		if(radioState==true)
		{
			radioResult="on";
		}
		else
			radioResult="off";
		
		
		System.out.println("\nradio state: "+radioResult);
	}	
	
	static void selfFrequency(float frequency)
	{
		//88-108
		if(frequency<88)
		{
			System.out.println("the frequency should be in a range 89-107:"+frequency);
			return;
		}
		else if(frequency>108)
		{
			System.out.println("the frequency should be in a range 89-107:"+frequency);
			return;
		}
		else
		{
			System.out.println("valid frequency: "+frequency);
		}
	}
	

	static void increaseVolume(float incrementValue, float decrementValue)
	{
		if(decrementValue>10)
		{
			System.out.println("the decrement value should be 0-10:");
			return;
		}
		System.out.println("valid: "+"increment value: "+incrementValue+", decrement value: "+decrementValue);
	}

	static void saveStation(String stationName)
	{
		String stations[]={"gulberga","yadgir","bidar","raichur","koppal"};
	
	
		if(stationName==null)
		{
			System.out.println("it shiuld  not be a null ");
			return;
		}
	
		for(int i=0;i<stations.length;i++)
		{
			System.out.println(stations[i]);
		}	
	}
}