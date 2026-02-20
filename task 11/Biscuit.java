//by taking the name as parameter returning the cost as a double
class Biscuit
{
	static double getCost(String name)
	{
		System.out.println("executing getCost in Biscuit"+"\nname :"+name);
		
		if(name==null)
		{
			System.out.println("Name should not be null");
			return -1;
		}
		
		if(name=="mary gold")
		{
			return 10;
		}
		
		if(name=="burbon")
		{
			return 15;
		}
		
		if(name=="dark fantasy")
		{
			return 25;
		}
		System.out.println("biscuit type not found");
		return 0;
	}
	
	
	static String getShape(String name)
	{
		System.out.println("\nexecuting getShape in Biscuit"+"\nname :"+name);
		
		if(name==null)
		{
			System.out.println("Name should not be null");
			return "X null X";
		}
		
		if(name=="mary gold")
		{
			return "circle";
		}
		
		if(name=="burbon")
		{
			return "Rectangle";
		}
		
		if(name=="dark fantasy")
		{
			return "circular with bigger sizes";
		}
		System.out.println("biscuit type not found");
		return "no match";
	}
	
	
	static String getFlavours(String[] flavours)
	{
		System.out.println("\nexecuting getFlavours in Biscuit");
		
		String fList[]={"sweet","hot","fruit mix"};
		String fList1[]={"chocolate","cream","extra cream"};
		String fList2[]={"venela","strawberry","butter scotch"};
		
		
			if(flavours==null)
			{
				System.out.println("the should not be a null");
				return "*no null*";
			}
			
		for(int i=0;i<flavours.length;i++)
		{
			if(flavours[i]==null)
			{
				System.out.println("the should not be a null");
				return "*no null*";
			}
			
			else if(flavours[i]=="mary gold")
			{
				System.out.println("\nflavours of "+flavours[i]+" are:");
				for(int j=0;j<fList.length;j++)
				{
					System.out.println(fList[j]);
				}
				//return "flavours of mary gold";
			}
			
			else if(flavours[i]=="burbon")
			{
				System.out.println("\nflavours of "+flavours[i]+" are:");
				for(int j=0;j<fList1.length;j++)
				{
					System.out.println(fList1[j]);
				}
				//return "flavours of burbon";
			}
			
			else if(flavours[i]=="dark fantasy")
			{
				System.out.println("\nflavours of "+flavours[i]+" are:");
				for(int j=0;j<fList2.length;j++)
				{
					System.out.println(fList2[j]);
				}
				//return "flavours of dark fantasy";
			}
		}
		return null;
		
	}
}