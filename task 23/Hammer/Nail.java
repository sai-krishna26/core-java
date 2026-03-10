class Nail
{
	String type;
	int size;
	
	Nail(String type,int size)
	{
		this.type=type;
		this.size=size;
	}
	
	void displayNail()
	{
		System.out.println("nail type: "+this.type);
		System.out.println("nail size: "+this.size);
	}
}