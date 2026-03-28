class getFarmer
{
	Farmer[] farmers;
	int currentIndex=0;
	
	getFarmer(Farmer[] farmers)
	{
		this.farmers=farmers;
	}
	
	void storeFarmer(Farmer farmer)
	{
		int size=this.farmers.length;
		if(this.farmers!=null && farmer!=null)
		{
			if(farmer.name!=null && farmer.type!=null && farmer.crop!=null)
			{
				System.out.println("executing storeFarmer in getFarmer");
				if(currentIndex<size)
				{
					this.farmers[currentIndex]=farmer;
					farmer.showDetails();
					System.out.println("farmer details stored at index: "+this.currentIndex);
					this.currentIndex++;
				}
				else
				{
					System.out.println("sorry "+farmer.name+", array is full!!");
				}
			}
			else
			{
				System.out.println("can't store index "+currentIndex+" former,bcz name/type/crop has null!!, please change it");
			}
		}
		else
		{
			System.out.println("the farmers array and farmer details should not be null");
		}
	}
}