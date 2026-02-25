class Carrom
{
	String material;
	String owner;
	double price;
	int length;
	boolean hasWarranty;
	
	
	Carrom()
	{
		System.out.println("i am a msg of non parameterized Carrom constructor");
	}
	Carrom(String material)
	{
		this.material=material;
		System.out.println(material);
	}
	Carrom(double price)
	{
		this.price=price;
		System.out.println(price);
	}
	Carrom(int length)
	{
		this.length=length;
		System.out.println(length);
	}
	Carrom(boolean hasWarranty)
	{
		this.hasWarranty=hasWarranty;
		System.out.println(hasWarranty);
	}
	Carrom(String matarial,String owner)
	{
		this.material=material;
		this.owner=owner;
		System.out.println(material+", "+owner);
	}
	
}