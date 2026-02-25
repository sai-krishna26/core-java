class Track
{
	String type;
	String color;
	double length;
	int width;
	boolean electric;

	Track()
	{
		System.out.println("Non-parameterized Track constructor");
	}

	Track(String type)
	{
		this.type=type;
		System.out.println(type);
	}

	Track(double length)
	{
		this.length=length;
		System.out.println(length);
	}

	Track(int width)
	{
		this.width=width;
		System.out.println(width);
	}

	Track(boolean electric)
	{
		this.electric=electric;
		System.out.println(electric);
	}

	Track(String type,String color)
	{
		this.type=type;
		this.color=color;
		System.out.println(type+", "+color);
	}
}