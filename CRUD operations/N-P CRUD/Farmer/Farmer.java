class Farmer
{
	String name;
	String type;
	int age;
	double landSize;
	String crop;
	boolean loan;
	
	Farmer(String name,
	String type,
	int age,
	double landSize,
	String crop,
	boolean loan)
	{
		this.name=name;
		this.type=type;
		this.age=age;
		this.landSize=landSize;
		this.crop=crop;
		this.loan=loan;
	}
	
	void showDetails()
	{
		System.out.println("----------------------------------------");
		System.out.println("executing showDetails in Farmer");
		System.out.println("farmer name :"+this.name);
		System.out.println("farmer type :"+this.type);
		System.out.println("farmer age :"+this.age);
		System.out.println("farmer landSize :"+this.landSize);
		System.out.println("farmer crop :"+this.crop);
		System.out.println("farmer loan :"+this.loan);
	}
	
}