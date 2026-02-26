class Musuem
{
	String name;
	String location;
	
	Musuem(String name)
	{
		this.name=name;
		System.out.println("String constructor is created");
	}
	
	Musuem(String name, String location)
	{
		this.name=name;
		this.location=location;
		System.out.println("String String constructor is created");
	}
}