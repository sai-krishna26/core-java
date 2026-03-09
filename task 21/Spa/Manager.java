class Manager
{
	String name;
	Manager(String name)
	{
		this.name=name;
		System.out.println("created name using Manager");
	}
	void getManager()
	{
		System.out.println("Manager name: "+this.name);
	}
}