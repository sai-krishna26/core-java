class Fort
{
	boolean isSecured;
	String location;
	Kingdom name;
	
	Fort(boolean isSecured,String location,Kingdom name)
	{
		this.isSecured=isSecured;
		this.location=location;
		this.name=name;
	}
	
	void printFortDetail()
	{
		System.out.println("is fort secured: "+this.isSecured);
		if(this.location!=null)
		{
			System.out.println("Location: "+this.location);
		}
		
		if(this.name!=null)
		{
			System.out.println("name of the kingdom: "+this.name);
		}
	}
}