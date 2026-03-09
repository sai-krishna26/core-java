class Pumpkin
{
	boolean isFresh;
	String color;
	PumpkinType type;

	Pumpkin(boolean isFresh,String color,PumpkinType type)
	{
		this.isFresh=isFresh;
		this.color=color;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Fresh: "+this.isFresh);

		if(this.color!=null)
		{
			System.out.println("Color: "+this.color);
		}

		if(this.type!=null)
		{
			System.out.println("Pumpkin Type: "+this.type);
		}
	}
}