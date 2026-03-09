class Walnut
{
	boolean isOrganic;
	String origin;
	WalnutType type;

	Walnut(boolean isOrganic,String origin,WalnutType type)
	{
		this.isOrganic=isOrganic;
		this.origin=origin;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Organic: "+this.isOrganic);

		if(this.origin!=null)
		{
			System.out.println("Origin: "+this.origin);
		}

		if(this.type!=null)
		{
			System.out.println("Type: "+this.type);
		}
	}
}