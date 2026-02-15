class NTR
{
	static void about(String fullName, int noOfMovies)
	{
		System.out.println("\nexecuting String and int in about method of NTR class ");
		System.out.println("\nfull name: "+fullName+", no of Movies: "+noOfMovies);
		
		if(fullName != "nandamuri taraka ramarao")
		{
			System.out.println("enter the proper full name");
			return;
		}
		
		if(noOfMovies != 30)
		{
			System.out.println("enter the proper total movies");
			return;
		}
		System.out.println("you like NTR right..!!");
	}
	
	static void about(String fullName, int age, String recentMovie)
	{
		System.out.println("\nexecuting String,int,String in about method of NTR class ");
		System.out.println("\nfull name: "+fullName+", age: "+age+", recent movie: "+recentMovie);
		
		if(fullName != "nandamuri taraka ramarao")
		{
			System.out.println("enter the proper full name");
			return;
		}
		
		if(age!= 40)
		{
			System.out.println("enter the proper age");
			return;
		}
		
		if(recentMovie != "devara")
		{
			System.out.println("enter the exact recent movie");
			return;
		}
		System.out.println("you like NTR right..!!");
	}
}