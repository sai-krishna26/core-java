class HairDryer
{
	boolean power;
	String name;
	int model;
	double cost;
	String date;
	
	HairDryer()
	{
		System.out.println("i am a msg of non parameterized HairDryer constructor");
	}
	HairDryer(boolean power)
	{
		this.power=power;
		System.out.println(power);
	}
	HairDryer(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	HairDryer(double cost)
	{
		this.cost=cost;
		System.out.println(cost);
	}
	HairDryer(int model)
	{
		this.cost=cost;
		System.out.println(model);
	}
	HairDryer(String name, String date)
	{
		this.name=name;
		this.date=date;
		System.out.println(name);
		System.out.println(date);
	}
	
	
}