class ShoeFactory extends Factory
{
	String company;
	String material;
	String productType;
	char size;
	double basePrize;
	
	void purchaseProduct()
	{
		System.out.println("executing purchaseProduct in shoeFactory");
	}
}