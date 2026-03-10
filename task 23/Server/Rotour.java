class Rotour
{
	String name;
	long ports;
	
	Rotour(String name,long ports)
	{
		this.name=name;
		this.ports=ports;
	}
	
	void displayRotour()
	{
		System.out.println("rotour name: "+this.name);
		System.out.println("ports count: "+this.ports);
	}
}