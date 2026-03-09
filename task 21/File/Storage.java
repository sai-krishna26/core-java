class Storage
{
	String location;
	Storage(String location)
	{
		this.location=location;
		System.out.println("created location using Storage");
	}
	void getStorage()
	{
		System.out.println("Storage location: "+this.location);
	}
}