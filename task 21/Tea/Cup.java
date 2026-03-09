class Cup
{
	String material;
	Cup(String material)
	{
		this.material=material;
		System.out.println("created material using Cup");
	}
	void getCup()
	{
		System.out.println("Cup material: "+this.material);
	}
}