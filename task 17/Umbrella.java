class Umbrella
{
	String company;
	double cost;
	String colour;
	int size;
	boolean isWorking;
	
	Umbrella()
	{
		System.out.println("i am a msg of non parameterized umbrella constructor");
	}
	
	Umbrella(String company)
	{
		this.company=company;
		System.out.println(company);
	}
	
	Umbrella(String company,double cost)
	{
		this.company=company;
		this.cost=cost;
		System.out.println(company+", "+cost);
	}
	Umbrella(String company,double cost,String colour)
	{
		this.company=company;
		this.cost=cost;
		this.colour=colour;
		System.out.println(company+", "+cost+", "+colour);
	}
	Umbrella(String company,double cost,String colour,int size)
	{
		this.company=company;
		this.cost=cost;
		this.colour=colour;
		this.size=size;
		System.out.println(company+", "+cost+", "+colour+", "+size);
	}
	Umbrella(String company,double cost,String colour,int size,boolean isWorking)
	{
		this.company=company;
		this.cost=cost;
		this.colour=colour;
		this.size=size;
		this.isWorking=isWorking;
		System.out.println(company+", "+cost+", "+colour+", "+size+", "+isWorking);
	}
}