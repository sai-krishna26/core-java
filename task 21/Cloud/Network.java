class Network
{
	String type;
	Network(String type)
	{
		this.type=type;
		System.out.println("created type using Network");
	}
	void getNetwork()
	{
		System.out.println("Network type: "+this.type);
	}
}