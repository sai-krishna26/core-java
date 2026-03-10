class Lens
{
	String type;
	int size;
	
	Lens(String type,int size)
	{
		this.type=type;
		this.size=size;
	}
	
	void displayLens()
	{
		System.out.println("lens type: "+this.type);
		System.out.println("lens size: "+this.size);
	}
}