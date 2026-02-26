class MusuemCreator
{
	static void getMusuem()
	{
		System.out.println("just wait.. creating a String constructor");
		Musuem musuem=new Musuem("Animal world");
		System.out.println("created of new musuem with fixed name");
		System.out.println("name of the musuem: "+musuem.name+" ,it cant be changed at runtime");
	}
	
	static void getMusuem(String name)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a String constructor(runtime value)");
		Musuem musuem=new Musuem(name);
		System.out.println("created of new musuem with not-fixed name");
		System.out.println("name of the musuem: "+musuem.name+" ,it can be changed at runtime");
	}
	
	static void getMusuem(String name, String location)
	{
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("just wait.. creating a String constructor(runtime values)");
		Musuem musuem=new Musuem(name,location);
		System.out.println("created of new musuem with not-fixed name and location");
		System.out.println("name of the musuem: "+musuem.name+" ,it cant be changed at runtime");System.out.println("name of the location: "+musuem.location+" ,this can be changed at runtime");		
	}
}