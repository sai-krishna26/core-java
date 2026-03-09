class Kettle
{
	String brand;
	Kettle(String brand)
	{
		this.brand=brand;
		System.out.println("created brand using Kettle");
	}
	void getKettle()
	{
		System.out.println("Kettle brand: "+this.brand);
	}
}