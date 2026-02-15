class Person
{
	static void contactInfo(String name,String emails[],long mobileNumbers[],String address)
	{
		System.out.println("\nExecuting the contactInfo in person");
		
		if(name==null)
		{
			System.out.println("error:name should not be null");
			return;
		}
		
		if(emails.contains("@gmail.com")
			
		
		System.out.println("name:"+name);
		//string email[]
		for(int eml=0;eml<emails.length;eml++)
			System.out.println("emails: "+emails[eml]);
		
		for(int phno=0;phno<mobileNumbers.length;phno++)
			System.out.println("mobile numbers: "+mobileNumbers[phno]);
		
		System.out.println("address: "+address);	
	}
	
	
	static void foodDish(String name,String ingredient[])
	{
		System.out.println("\nExecuting the foodDish in person");
		
		System.out.println("name:"+name);
	
		for (int ingrdind=0;ingrdind<ingredient.length;ingrdind++)
			System.out.println("list of ingredient dish: "+ingredient[ingrdind]);
	}
	
	static void laptop(String brand,String model,String ports[],String countriesOfWarranty[])
	{
		System.out.println("\nExecuting the laptop in person");
		
		System.out.println("brand name:"+brand);
		
		System.out.println("model name:"+model);
	
		System.out.println("list of ports:");
		for(int portno=0;portno<ports.length;portno++)
			System.out.println(ports[portno]);
		
		System.out.println("list of countries which provide warranty:");
		for(int contno=0;contno<countriesOfWarranty.length;contno++)
			System.out.println(countriesOfWarranty[contno]);
	}
	
}