class Spa
{
	String name;
	String location;
	int rooms;
	int staff;
	boolean luxury;

	Therapy therapy;
	Massage massage;
	Aroma aroma;
	Customer customer;
	Packagee packagee;
	Manager manager;

	Spa(String name,String location,int rooms,int staff,boolean luxury,
	Therapy therapy,Massage massage,Aroma aroma,Customer customer,Packagee packagee,Manager manager)
	{
		this.name=name;
		this.location=location;
		this.rooms=rooms;
		this.staff=staff;
		this.luxury=luxury;
		this.therapy=therapy;
		this.massage=massage;
		this.aroma=aroma;
		this.customer=customer;
		this.packagee=packagee;
		this.manager=manager;

		System.out.println("created a Spa using primitive and non primitive variables");
	}

	void getSpa()
	{
		System.out.println("name: "+this.name);
		System.out.println("location: "+this.location);
		System.out.println("therapy object: "+this.therapy);
	}
}
