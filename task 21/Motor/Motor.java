class Motor
{
	String brand;
	String type;
	int power;
	int speed;
	boolean electric;

	Coil coil;
	Rotor rotor;
	Stator stator;
	Bearing bearing;
	Fan fan;
	Wire wire;

	Motor(String brand,String type,int power,int speed,boolean electric,
	Coil coil,Rotor rotor,Stator stator,Bearing bearing,Fan fan,Wire wire)
	{
		this.brand=brand;
		this.type=type;
		this.power=power;
		this.speed=speed;
		this.electric=electric;
		this.coil=coil;
		this.rotor=rotor;
		this.stator=stator;
		this.bearing=bearing;
		this.fan=fan;
		this.wire=wire;

		System.out.println("created a Motor using primitive and non primitive variables");
	}

	void getMotor()
	{
		System.out.println("brand: "+this.brand);
		System.out.println("type: "+this.type);
		System.out.println("rotor object: "+this.rotor);
	}
}
