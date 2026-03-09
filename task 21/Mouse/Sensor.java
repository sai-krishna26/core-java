class Sensor
{
	String technology;
	Sensor(String technology)
	{
		this.technology=technology;
		System.out.println("created technology using Sensor");
	}
	void getSensor()
	{
		System.out.println("Sensor technology: "+this.technology);
	}
}