class Beer
{
	boolean isCold;
	String brand;
	BeerType type;

	Beer(boolean isCold,String brand,BeerType type)
	{
		this.isCold=isCold;
		this.brand=brand;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Cold: "+this.isCold);

		if(this.brand!=null)
		{
			System.out.println("Brand: "+this.brand);
		}

		if(this.type!=null)
		{
			System.out.println("Type: "+this.type);
		}
	}
}