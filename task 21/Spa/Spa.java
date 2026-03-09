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
		System.out.println("rooms: "+this.rooms);
		System.out.println("staff: "+this.staff);
		System.out.println("luxury: "+this.luxury);
		
		if(this.therapy!=null)
		{
			this.therapy.getTherapy();
		}
		if(this.massage!=null)
		{
			this.massage.getMassage();
		}
		if(this.aroma!=null)
		{
			this.aroma.getAroma();
		}
		if(this.customer!=null)
		{
			this.customer.getCustomer();
		}
		if(this.packagee!=null)
		{
			this.packagee.getPackagee();
		}
		if(this.manager!=null)
		{
			this.manager.getManager();
		}
	}
}
