class FiberRunner
{
	public static void main(String[] values)
	{
		Fiber fiber=new Fiber();
		Fiber fiber1=new Fiber();
		System.out.println("default name: "+fiber.name);
		System.out.println("default length: "+fiber.length);
		System.out.println("default vendors: "+fiber.vendors);
		
		fiber.name="single mode fiber";
		fiber.length=100;
		fiber.vendors=new String[]{"OS1","OS2","OM1","OM2"};
			
		System.out.println("\ninitialized name: "+fiber.name);
		System.out.println("initialized length: "+fiber.length);
		System.out.println("initialized vendors: ");
		for (String vendor:fiber.vendors)
		{
			System.out.print(vendor+" ");
		}
	}
}