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
		
		for(int i=0;i<emails.length;i++)
			
		if(emails[i]==null && !emails[i].contains("@gmail.com"))
		{
			System.out.println("error:email should contain @gmail.com");
			return;	
		}
		
		for(int i=0;i<mobileNumbers.length;i++)
		
		if(String.valueOf(mobileNumbers[i]).length()!=10)
		{
			System.out.println("error:mobile number should contain only 10 digits with starting number >6");
			return;
		}
		
		
		if(address==null)
		{
			System.out.println("error:address should not be null");
			return;
		}
		
		
		
		System.out.println("name:"+name);
		//string email[]
		for(int eml=0;eml<emails.length;eml++)
			System.out.println("emails: "+emails[eml]);
		
		for(int phno=0;phno<mobileNumbers.length;phno++)
			System.out.println("mobile numbers: "+mobileNumbers[phno]);
		
		System.out.println("address: "+address);	
	}
	
	
	static void foodDish(String name,String ingredients[])
	{
		System.out.println("\nExecuting the foodDish in person");
		
		
		if(name==null)
		{
			System.out.println("error:name should not be null");
			return;
		}
		
		for(int i=0;i<ingredients.length;i++)
			
		if(ingredients[i]==null)
		{
			System.out.println("error: ingredients should not be null");
			return;
		}
		
		System.out.println("name:"+name);
	
		for (int ingrdind=0;ingrdind<ingredients.length;ingrdind++)
			System.out.println("list of ingredient dish: "+ingredients[ingrdind]);
	}
	
	static void laptop(String brand,String model,String ports[],String countriesOfWarranty[])
	{
		System.out.println("\nExecuting the laptop in person");
		
		
		if(brand==null)
		{
			System.out.println("error:brand should not be null");
			return;
		}
		
		if(model==null)
		{
			System.out.println("error:model should not be null");
			return;
		}
		
		for(int i=0;i<ports.length;i++)
		
		if(ports[i]==null)
		{
			System.out.println("error: ports should not be null");
			return;
		}
		
		for(int i=0;i<countriesOfWarranty.length;i++)
		
		if(countriesOfWarranty[i]==null)
		{
			System.out.println("error:should be proper country names");
			return;
		}
	
		
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