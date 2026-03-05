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

	Aquarium(String name,String location,int tanks,int fishes,boolean publicPlace,
	Fish fish,Water water,Filter filter,Light light,Plant plant,Ticket ticket)
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
		System.out.println("fish object: "+this.fish);
	}
}