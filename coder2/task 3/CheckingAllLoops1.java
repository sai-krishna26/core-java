class CheckingAllLoops1{
	
	static void check()
	{
		int age=14;
		int rate=800;
		String value="lenin";
		checkIf(rate);
		Switch(value);
		loops(age);
		
	}
	static void checkIf(int rate)
	{
		if(rate<200)
		{
			System.out.println("no quality");
		}
		if(rate<300)
		{
			System.out.println("medium quality");
		}
		
		else if(rate<500)
		{
			System.out.println("good quality");
		}
		else if(rate<900)
		{
			System.out.println(rate+" :very good quality");
		}
		else if(rate<1500)
		{
			System.out.println("premium quality");
		}
		
		else
		{
			System.out.println("branded");
		}
		System.out.println("-----------------------------------\n");
		
	}
	
	static void Switch(String value)
	{
		switch(value)
		{
			case "lenin":System.out.println(value+" :good in summer");
			break;
			case "higlander":System.out.println("good in price");
			break;
			case "h&m":System.out.println("best quality ");
			break;
			case "puma":System.out.println("top brand");
			break;
			default:System.out.println("do shoppping in offers");
			
		}
		System.out.println("-----------------------------------\n");
	}	
	
	static void loops(int age)
	{
		int n=5;
		while(age<18)
		{
			System.out.println(age+" not eligible age to vote");
			age++;
		}
		
		System.out.println("----------------------------\n");
		
		for(int index=0;index<n;index++)
		{
			System.out.println(index);
	
		}
		System.out.println("----------------------------\n");
		
		int m=10;
		int total=m+n;
		do
		{
			total=m+n;
			n--;
			System.out.println(total);

		}
		while (total<8);
	}
	public static void main(String[] valuess)
	{
		check();
	}
}