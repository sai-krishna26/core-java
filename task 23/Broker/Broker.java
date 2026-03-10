class Broker
{
	int[] deals;
	Client[] client;
	
	Broker(int[] deals,Client[] client)
	{
		this.deals=deals;
		this.client=client;
	}
	
	void displayBroker()
	{
		System.out.println("executing displayBroker in Broker");
		
		if(this.deals!=null)
		{
			System.out.println("length of the deals array: "+this.deals.length);
			for(int deal:deals)
			{
				System.out.println("deal id: "+deal);
			}
		}
		
		System.out.println("-------------------------------------");
		
		if(this.client!=null)
		{
			System.out.println("length of the client array: "+this.client.length);
			for(Client c:client)
			{
				c.displayClient();
			}
		}
	}
}