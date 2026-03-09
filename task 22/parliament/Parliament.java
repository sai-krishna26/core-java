class Parliament
{
	int houses;
	String location;
	Parties currentParties;
	
	Parliament(int houses, String location, Parties currentParties)
	{
		this.houses=houses;
		this.location=location;
		this.currentParties=currentParties;
	}
	
	void printParlimentInfo()
	{
		System.out.println("total houses in parliment: "+this.houses);
		
		if(this.location!=null)
		{
			System.out.println("location: "+this.location);
		}
		else
		{
			System.out.println("location cannot be a null");
		}
		
		if(this.currentParties!=null)
		{
			System.out.println("parties: "+this.currentParties);
		}
		else
		{
			System.out.println("value is not matching");
		}
		
	}
	
}