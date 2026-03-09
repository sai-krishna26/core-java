class Aquarium
{
	String name;
	String location;
	int tanks;
	int fishes;
	boolean publicPlace;
	Fish fish;
	Water water;
	Filter filter;
	Light light;
	Plant plant;
	Ticket ticket;

	Aquarium(String name,String location,int tanks,int fishes,boolean publicPlace,Fish fish,Water water,Filter filter,Light light,Plant plant,Ticket ticket)
	{
		this.name=name;
		this.location=location;
		this.tanks=tanks;
		this.fishes=fishes;
		this.publicPlace=publicPlace;
		this.fish=fish;
		this.water=water;
		this.filter=filter;
		this.light=light;
		this.plant=plant;
		this.ticket=ticket;

		System.out.println("created an Aquarium using primitive and non primitive variables");
	}

	void getAquarium()
	{
		System.out.println("name: "+this.name);
		System.out.println("location: "+this.location);
		System.out.println("tanks: "+this.tanks);
		System.out.println("fishes: "+this.fishes);
		System.out.println("publicPlace: "+this.publicPlace);
		if(this.fish!=null)
		{
			this.fish.getFish();
		}
		if(this.filter!=null)
		{
			this.filter.getFilter();
		}
		if(this.water!=null)
		{
			this.water.getWater();
		}
		if(this.light!=null)
		{
			this.light.getLight();
		}
		if(this.plant!=null)
		{
			this.plant.getPlant();
		}
		if(this.ticket!=null)
		{
			this.ticket.getTicket();
		}	
	}
}