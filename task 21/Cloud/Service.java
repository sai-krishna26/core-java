class Service
{
	String name;
	Service(String name)
	{
		this.name=name;
		System.out.println("created name using Service");
	}
	void getService()
	{
		System.out.println("name of Service: "+this.name);
	}
}