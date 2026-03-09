class Handle
{
	String material;
	Handle(String material)
	{
		this.material=material;
		System.out.println("created material using Handle");
	}
	void getHandle()
	{
		System.out.println("Handle material: "+this.material);
	}
}
