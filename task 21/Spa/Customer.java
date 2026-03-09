class Customer
{
	String name;
	Customer(String name)
	{
		this.name=name;
		System.out.println("created name using Customer");
	}
	void getCustomer()
	{
		System.out.println("Customer name: "+this.name);
	}
}