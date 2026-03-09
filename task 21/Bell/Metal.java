class Metal
{
	String name;
	Metal(String name)
	{
		this.name=name;
		System.out.println("created name using Metal");
	}
	void getMetal()
	{
		System.out.println("Metal name: "+this.name);
	}
}