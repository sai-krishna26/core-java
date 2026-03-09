class Horlicks
{
	boolean isHealthy;
	String flavor;
	HorlicksType type;

	Horlicks(boolean isHealthy,String flavor,HorlicksType type)
	{
		this.isHealthy=isHealthy;
		this.flavor=flavor;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Healthy: "+this.isHealthy);

		if(this.flavor!=null)
		{
			System.out.println("Flavor: "+this.flavor);
		}

		if(this.type!=null)
		{
			System.out.println("Type: "+this.type);
		}
	}
}