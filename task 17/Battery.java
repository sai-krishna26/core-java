class Battery
{
	String brand;
	String type;
	double price;
	int capacity;
	boolean rechargeable;

	Battery()
	{
		System.out.println("Non-parameterized Battery constructor");
	}

	Battery(String brand)
	{
		this.brand=brand;
		System.out.println(brand);
	}

	Battery(double price)
	{
		this.price=price;
		System.out.println(price);
	}

	Battery(int capacity)
	{
		this.capacity=capacity;
		System.out.println(capacity);
	}

	Battery(boolean rechargeable)
	{
		this.rechargeable=rechargeable;
		System.out.println(rechargeable);
	}

	Battery(String brand,String type)
	{
		this.brand=brand;
		this.type=type;
		System.out.println(brand+", "+type);
	}
}