class Pawn
{
	String material;
	String color;
	double price;
	int height;
	boolean strong;

	Pawn()
	{
		System.out.println("Non-parameterized Pawn constructor");
	}

	Pawn(String material)
	{
		this.material=material;
		System.out.println(material);
	}

	Pawn(double price)
	{
		this.price=price;
		System.out.println(price);
	}

	Pawn(int height)
	{
		this.height=height;
		System.out.println(height);
	}

	Pawn(boolean strong)
	{
		this.strong=strong;
		System.out.println(strong);
	}

	Pawn(String material,String color)
	{
		this.material=material;
		this.color=color;
		System.out.println(material+", "+color);
	}
}