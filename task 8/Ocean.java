class Ocean
{
	static void dolphin(String oceanName, String dolphinName,int size, int age, int weight)
	{
		System.out.println("\nocean name: "+oceanName+", name of dolphinName: "+dolphinName+", size of dolphin: "+size+", age of dolphin: "+age+", weight of dolphin: "+weight);
		
		if(oceanName==null)
		{
			System.out.println("ocean name should not be a null ");
			return;
		}
		
		if(dolphinName==null)
		{
			System.out.println(" dolphin name should not be a null ");
			return;
		}
		
		if(size<=0)
		{
			System.out.println("the size should be 0>");
			return;
		}
		
		if(age<=0)
		{
			System.out.println("the age should be 0> ");
			return;
		}
		
		if(weight <50)
		{
			System.out.println("the weight should be 50> ");
			return;
		}
			System.out.println("the data is valid");
	}
}