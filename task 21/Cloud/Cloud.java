class Cloud
{
	String provider;
	String serviceType;
	int servers;
	int storage;
	boolean scalable;

	DataCenter dataCenter;
	Region region;
	Service service;
	Security security;
	Client client;
	Network network;

	Cloud(String provider,String serviceType,int servers,int storage,boolean scalable,
	DataCenter dataCenter,Region region,Service service,Security security,Client client,Network network)
	{
		this.provider=provider;
		this.serviceType=serviceType;
		this.servers=servers;
		this.storage=storage;
		this.scalable=scalable;
		this.dataCenter=dataCenter;
		this.region=region;
		this.service=service;
		this.security=security;
		this.client=client;
		this.network=network;

		System.out.println("created a Cloud using primitive and non primitive variables");
	}

	void getCloud()
	{
		System.out.println("provider: "+this.provider);
		System.out.println("serviceType: "+this.serviceType);
		System.out.println("servers: "+this.servers);
		System.out.println("storage: "+this.storage);
		System.out.println("scalable: "+this.scalable);
		if(this.dataCenter!=null)
		{
			this.dataCenter.getDataCenter();
		}
		else
		{
			System.out.println("dataCenter not found");
		}
		if(this.region!=null)
		{
			this.region.getRegion();
		}
		if(this.service!=null)
		{
			this.service.getService();
		}
		if(this.security!=null)
		{
			this.security.getSecurity();
		}
		if(this.client!=null)
		{
			this.client.getClient();
		}
		if(this.network!=null)
		{
			this.network.getNetwork();
		}
		
	}
}