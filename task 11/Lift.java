class Lift
{
	static String getCompany(String name)
	{
		System.out.println("\nexecuting getCompany in list"+"\nname :"+name);
		
		if(name==null)
		{
			System.out.println("Name should not be null");
			return "*no null*";
		}
		
		if(name=="dwaraka")
		{
			return "usha elevators";
		}
		
		if(name=="ayodhya")
		{
			return "uturn elevators";
		}
		
		if(name=="hampi")
		{
			return "ring elevators";
		}
		
		if(name=="vaikunta")
		{
			return "manohar elevators";
		}
		
		if(name=="swarga")
		{
			return "elephant elevators";
		}
		
		System.out.println("try mythological building names");
		return "company:";
	}
	
}