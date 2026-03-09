class Paneer
{
	boolean isFresh;
	String brand;
	PaneerType type;

	Paneer(boolean isFresh,String brand,PaneerType type)
	{
		this.isFresh=isFresh;
		this.brand=brand;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Fresh: "+this.isFresh);

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