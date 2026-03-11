class Color
{
	String pattern;
	double price;
	
	Color(String pattern,double price)
	{
		this.pattern=pattern;
		this.price=price;
	}
	
	void displayColor()
	{
		System.out.println("pattern: "+this.pattern);
		System.out.println("price: "+this.price);
	}
}