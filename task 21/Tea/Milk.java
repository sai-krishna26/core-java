class Milk
{
	String type;
	Milk(String type)
	{
		this.type=type;
		System.out.println("created type using Milk");
	}
	void getMilk()
	{
		System.out.println("Milk type: "+this.type);
	}
}