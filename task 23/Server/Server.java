class Server
{
	long[] ip;
	Rotour[] rotour;
	
	Server(long[] ip,Rotour[] rotour)
	{
		this.ip=ip;
		this.rotour=rotour;
	}
	
	void displayServer()
	{
		System.out.println("executing displayServer in server");
		if(this.ip!=null)
		{
			System.out.println("length of the ip array: "+this.ip.length);
			for(long i:ip)
			{
				System.out.println("ip: "+i);
			}
		}
		System.out.println("-----------------------------------------------");
		if(this.rotour!=null)
		{
			System.out.println("length of the rotour array: "+this.rotour.length);
			for(Rotour router:rotour)
			{
				router.displayRotour();
			}
		}		
	}
}