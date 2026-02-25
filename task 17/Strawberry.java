class Strawberry
{
	String color;
	String taste;
	double price;
	int weight;
	boolean fresh;

	Strawberry()
	{
		System.out.println("Non-parameterized Strawberry constructor");
	}

	Strawberry(String color)
	{
		this.color=color;
		System.out.println(color);
	}

	Strawberry(double price)
	{
		this.price=price;
		System.out.println(price);
	}

	Strawberry(int weight)
	{
		this.weight=weight;
		System.out.println(weight);
	}

	Strawberry(boolean fresh)
	{
		this.fresh=fresh;
		System.out.println(fresh);
	}

	Strawberry(String color,String taste)
	{
		this.color=color;
		this.taste=taste;
		System.out.println(color+", "+taste);
	}
}