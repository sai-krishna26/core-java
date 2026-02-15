class RishabShetty
{
	static void details(String name, String wifeName)
	{
		System.out.println("\nexecuting String,String in details() of RishabShetty{} ");
		System.out.println("name: "+name+", wifeName: "+wifeName);
		
		if(name!="rishab shetty")
		{
			System.out.println("name should be[rishab shetty]");
			return;
		}
		
		if(wifeName!="pragathi")
		{
			System.out.println("name should be[pragathi]");
			return;
		}
		System.out.println("you rocked it bro !!");
	}
	
	static void details(String name, String famousMovie, int childrenCount)
	{
		System.out.println("\nexecuting String,String,int in details() of RishabShetty{} ");
		System.out.println("name: "+name+", famous movie: "+famousMovie+", no of children: "+childrenCount);
		
		if(name!="rishab shetty")
		{
			System.out.println("name should be[rishab shetty]");
			return;
		}
		
		if(famousMovie!="kaantara")
		{
			System.out.println("famous movie should be[kaantara]");
			return;
		}
		
		if(childrenCount!=2)
		{
			System.out.println("children count should be[2]");
			return;
		}
		
		System.out.println("you are the movie lover");
	}
	
		
}