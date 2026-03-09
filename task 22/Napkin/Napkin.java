class Napkin
{
	boolean isSoft; 
	String brand;       
	NapkinType type;     
	
	Napkin(boolean isSoft, String brand, NapkinType type)
	{
		this.isSoft = isSoft;
		this.brand = brand;
		this.type = type;
	}
	
	void printInfo()
	{
		System.out.println("Napkin Soft: " + this.isSoft);
		
		if(this.brand != null)
		{
			System.out.println("Brand: " + this.brand);
		}
		
		if(this.type != null)
		{
			System.out.println("Napkin Type: " + this.type);
		}
	}
}