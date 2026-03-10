class Smile
{
	String smileType;
	
	Smile(String smileType)
	{
		this.smileType=smileType;
	}
	
	void displaySmile()
	{
		System.out.println("created Smile by smileType");
		System.out.println("smile type: "+this.smileType);
	}
}