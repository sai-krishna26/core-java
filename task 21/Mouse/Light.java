class Light
{
	String color;
	Light(String color)
	{
		this.color=color;
		System.out.println("created color using Light");
	}
	void getLight()
	{
		System.out.println("Light color: "+this.color);
	}
}