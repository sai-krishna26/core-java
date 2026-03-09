class DataCenter
{
	String location;
	DataCenter(String location)
	{
		this.location=location;
		System.out.println("created location using DataCenter");
	}
	void getDataCenter()
	{
		System.out.println("DataCenter location: "+this.location);
	}
}