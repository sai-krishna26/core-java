class Blanket
{
	String color="Blue";
	double price=1200.5;
	int size=6;
	boolean warm=true;
	float weight=2.5f;
	char quality='A';

	Blanket(String color,double price,int size,
	boolean warm,float weight,char quality)
	{
		this.color=color;
		this.price=price;
		this.size=size;
		this.warm=warm;
		this.weight=weight;
		this.quality=quality;

		System.out.println("Blanket color: "+color);
	}
}
