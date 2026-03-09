class Button
{
	String type;
	Button(String type)
	{
		this.type=type;
		System.out.println("created type using Button");
	}
	void getButton()
	{
		System.out.println("Button type: "+this.type);
	}
}