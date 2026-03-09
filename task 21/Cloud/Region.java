class Region
{
	String name;
	Region(String name)
	{
		this.name=name;
		System.out.println("created name using Region");
	}
	void getRegion()
	{
		System.out.println("Region name: "+this.name);
	}
}