class Mobile
{
	static void specs(String company,int series)
	{
		System.out.println("\nexecuting String,int in specs() of Mobile{} ");
		System.out.println("Company: "+company+", series: "+series);
		
		if(company==null)
		{
			System.out.println("give a proper mobile brand");
			return;
		}
		
		if(series<7)
		{
			System.out.println("series should be >7");
			return;
		}
	}
	
	static void specs(int company,String series)
	{
		System.out.println("\nexecuting int,String in specs() of Mobile{} ");
		System.out.println("Company: "+company+", series: "+series);
		
		if(company<7)
		{
			System.out.println("series should be >7");
			return;
		}
		
		if(series=="null")
		{
			System.out.println("give a proper mobile brand");
			return;
		}
	}
}