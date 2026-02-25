class Rocket
{
	String name="GSLV";
	double speed=25000;
	int height=60;
	float weight=2000f;
	boolean launch=true;
	char type='L';
	long cost=5000000;
	int stages=4;
	double fuelCapacity=3000.5;
	boolean reusable=false;

	Rocket(String name,double speed,int height,float weight,
	boolean launch,char type,long cost,int stages,
	double fuelCapacity,boolean reusable)
	{
		this.name=name;
		this.speed=speed;
		this.height=height;
		this.weight=weight;
		this.launch=launch;
		this.type=type;
		this.cost=cost;
		this.stages=stages;
		this.fuelCapacity=fuelCapacity;
		this.reusable=reusable;

		System.out.println("Rocket name: "+name);
	}
}
