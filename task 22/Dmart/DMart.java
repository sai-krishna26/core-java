class DMart
{
	int totalDmart;
	String Location;
	Products item;
	
	DMart(int totalDmart, String Location, Products item)
	{
		this.totalDmart=totalDmart;
		this.Location=Location;
		this.item=item;
	}
	
	void PrintDMartInfo()
	{
		System.out.println("Total dmarts in india: "+totalDmart);
		if(this.Location!=null)
		{
			System.out.println("Location: "+this.Location);
		}
		if(this.item!=null)
		{
			System.out.println("item name: "+this.item);
		}
	}
	
}