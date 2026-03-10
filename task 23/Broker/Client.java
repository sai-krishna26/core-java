class Client
{
	String name;
	int deals;
	
	Client(String name,int deals)
	{
		this.name=name;
		this.deals=deals;
	}
	
	void displayClient()
	{
		System.out.println("client name: "+this.name);
		System.out.println("number of deals: "+this.deals);
	}
}