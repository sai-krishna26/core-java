class Owner
{
	String name;
	Owner(String name)
	{
		this.name=name;
		System.out.println("created name using Owner");
	}
	void getOwner()
	{
		System.out.println("owner name: "+this.name);
	}
}