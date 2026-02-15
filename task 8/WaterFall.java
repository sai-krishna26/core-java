class WaterFall
{
	static void info(String name, String location, double height, double waterFlow)
	{
		System.out.println("\nwaterfall name: "+name+", location: "+location+", height: "+height+", water flow: "+waterFlow);
	
	
	if(name==null)
		{
			System.out.println("waterfall name should not be a null ");
			return;
		}
		
		if(location==null)
		{
			System.out.println(" location name should not be a null ");
			return;
		}
		
		
		if(height <31)
		{
			System.out.println("the age and height should be 31> ");
			return;
		}
			System.out.println("the data is valid");
	
	
	
	}
	
	static void stateOwningInfo(String owningDist, String owningState,String stateOwningCapital, int area, boolean stateIsRich)
	{
		System.out.println("\nwaterfall Owning District: "+owningDist+", waterfall owning state: "+owningState+", waterfall owning state capital: "+stateOwningCapital+", area: "+area+", state is Rich: "+stateIsRich);
		
		if(owningDist==null)
		{
			System.out.println("district should not be a null ");
			return;
		}
		
		if(owningState!="karnataka")
		{
			System.out.println(" state name should be a karnataka ");
			return;
		}
		
		if(area<600)
		{
			System.out.println("the area  should be 600> ");
			return;
		}
		
		if(stateIsRich==false)
		{
			System.out.println("the state is rich so it should be true ");
			return;
		}
			System.out.println("the data is valid");
	}
}