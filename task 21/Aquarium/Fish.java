class Fish
{
	String type;
	Fish(String type)
	{
		this.type=type;
		System.out.println("created type using Fish");
	}
	
	void getFish()
	{
		System.out.println("fish type:" + this.type);
	}
}