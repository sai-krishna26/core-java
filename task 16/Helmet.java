class Helmet
{
	String brand="Vega";
	int price=1500;
	boolean safety=true;

	Helmet(String brand,int price,boolean safety)
	{
		this.brand=brand;
		this.price=price;
		this.safety=safety;

		System.out.println("Helmet brand: "+brand);
		System.out.println("Helmet price: "price);
		System.out.println("Helmet safety: "+safety);
	}
}

