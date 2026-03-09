class Bearing
{
	String model;
	Bearing(String model)
	{
		this.model=model;
		System.out.println("created model using Bearing");
	}
	void getBearing()
	{
		System.out.println("Bearing model: "+this.model);
	}
}