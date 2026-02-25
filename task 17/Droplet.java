class Droplet
{
	String type;
	String color;
	double volume;
	int size;
	boolean pure;

	Droplet()
	{
		System.out.println("Non-parameterized Droplet constructor");
	}

	Droplet(String type)
	{
		this.type=type;
		System.out.println(type);
	}

	Droplet(double volume)
	{
		this.volume=volume;
		System.out.println(volume);
	}

	Droplet(int size)
	{
		this.size=size;
		System.out.println(size);
	}

	Droplet(boolean pure)
	{
		this.pure=pure;
		System.out.println(pure);
	}

	Droplet(String type,String color)
	{
		this.type=type;
		this.color=color;
		System.out.println(type+", "+color);
	}
}