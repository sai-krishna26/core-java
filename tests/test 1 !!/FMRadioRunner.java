class FMRadioRunner
{	
	public static void main(String[] arg)
	{
		FMRadio.turnOnOrOff();
		FMRadio.turnOnOrOff();
		
		
		FMRadio.selfFrequency(90.2f);
		FMRadio.selfFrequency(20.5f);
		FMRadio.selfFrequency(110.8f);
		
		FMRadio.increaseVolume(12.0f,15.4f);
		FMRadio.increaseVolume(12.0f,5.4f);
		
		
		FMRadio.saveStation("tungabadra");
		//{"gulberga","yadgir","bidar","raichur","koppal"};
	}
	
}
