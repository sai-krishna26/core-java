class Plant
{
	String name;
	Plant(String name)
	{
		this.name=name;
		System.out.println("created name using Plant");
	}
	
	void getPlant()
	{
		System.out.println("plant name:" + this.name);
	}
}