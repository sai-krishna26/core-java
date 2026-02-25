class Umbrella
{
	String company;
	double cost;
	String colour;
	int size;
	boolean isWorking;
	
	Umbrella()
	{
		
	}
	
	Umbrella(String company)
	{
		this.company=company;
	}
	
	Umbrella(String company,double cost)
	{
		this.company=company;
		this.cost=cost;
	}
	Umbrella(String company,double cost,String colour)
	{
		this.company=company;
		this.cost=cost;
		this.colour=colour;
	}
	Umbrella(String company,double cost,String colour,int size)
	{
		this.company=company;
		this.cost=cost;
		this.colour=colour;
		this.size=size;
	}
	Umbrella(String company,double cost,String colour,int size,boolean isWorking)
	{
		this.company=company;
		this.cost=cost;
		this.colour=colour;
		this.size=size;
		this.isWorking=isWorking;
	}
}