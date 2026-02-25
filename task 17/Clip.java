class Clip
{
	String material;
	String color;
	double price;
	int length;
	boolean flexible;

	Clip()
	{
		System.out.println("Non-parameterized Clip constructor");
	}

	Clip(String material)
	{
		this.material=material;
		System.out.println(material);
	}

	Clip(double price)
	{
		this.price=price;
		System.out.println(price);
	}

	Clip(int length)
	{
		this.length=length;
		System.out.println(length);
	}

	Clip(boolean flexible)
	{
		this.flexible=flexible;
		System.out.println(flexible);
	}

	Clip(String material,String color)
	{
		this.material=material;
		this.color=color;
		System.out.println(material+", "+color);
	}
}