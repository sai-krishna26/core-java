class Tower
{
	String[] typeOfTowers;
	Signal[] signal;
	
	Tower(String[] typeOfTowers,Signal[] signal)
	{
		this.typeOfTowers=typeOfTowers;
		this.signal=signal;
	}
	
	void showTower()
	{
		System.out.println("executing the printTower in Tower");
		if(typeOfTowers!=null)
		{
			System.out.println("length of the array typeOfTowers:"+this.typeOfTowers.length);
			for(String type:typeOfTowers)
			{
				System.out.println("type: "+type);
			}
		}
		System.out.println("----------------------------------------------");
		if(signal!=null)
		{
			System.out.println("length of the array signal:"+this.signal.length);
			for(Signal direct:signal)
			{
				direct.showDisplay();
			}
		}
	}
}