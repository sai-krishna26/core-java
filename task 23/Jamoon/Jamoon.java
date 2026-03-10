class Jamoon
{
	int[] price;
	Syrup[] syrup;
	
	Jamoon(int[] price,Syrup[] syrup)
	{
		this.price=price;
		this.syrup=syrup;
	}
	
	void displayJamoon()
	{
		System.out.println("executing displayJamoon in Jamoon");
		
		if(this.price!=null)
		{
			System.out.println("length of the price array: "+this.price.length);
			for(int p:price)
			{
				System.out.println("price: "+p);
			}
		}
		
		System.out.println("-------------------------------------");
		
		if(this.syrup!=null)
		{
			System.out.println("length of the syrup array: "+this.syrup.length);
			for(Syrup s:syrup)
			{
				s.displaySyrup();
			}
		}
	}
}