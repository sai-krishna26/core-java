class Cap
{
	String brand;
	String color;
	String materialType;
	double cost;
	char size;
	boolean hasElastic;
	
	Cap(String brand,
	String color,
	String materialType,
	double cost,
	char size,
	boolean hasElastic)
	{
		this.brand=brand;
		this.color=color;
		this.materialType=materialType;
		this.cost=cost;
		this.size=size;
		this.hasElastic=hasElastic;
	}
	
	void printDetails()
	{
		System.out.println("Executing printDetails in Cap");
		System.out.println("brand: "+this.brand);
		System.out.println("color: "+this.color);
		System.out.println("materialType: "+this.materialType);
		System.out.println("cost: "+this.cost);
		System.out.println("size: "+this.size);
		System.out.println("hasElastic: "+this.hasElastic);
	}
}