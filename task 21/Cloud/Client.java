class Client
{
	String name;
	Client(String name)
	{
		this.name=name;
		System.out.println("created name using Client");
	}
	void getClient()
	{
		System.out.println("client name: "+this.name);
	}
}