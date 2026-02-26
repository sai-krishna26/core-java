class StadiumCreator
{
	static void getStadium()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a boolean constructor");
		Stadium stadium=new Stadium(true);
		System.out.println("created of new stadium as cricket stadium as a fixed");
		System.out.println("stadium belongs to cricket (true or false): "+stadium.cricketStadium+" ,it can't be changed at runtime");
	}
	
	static void getStadium(boolean cricketStadium)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a boolean constructor(runtime variable)");
		Stadium stadium=new Stadium(cricketStadium);
		System.out.println("created of new stadium as no-fixed specific type");
		System.out.println("stadium belongs to cricket (true or false): "+stadium.cricketStadium+" ,it can be changed at runtime");
	}
	
	static void getStadium(float rent)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a float constructor(runtime variable)");
		Stadium stadium=new Stadium(rent);
		System.out.println("created of new stadium with a no-fixed rent");
		System.out.println("rent of the stadium: "+stadium.rent+" ,it can be changed at runtime");
	}
	
	static void getStadium(boolean cricketStadium,float rent)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a boolean and float constructor(runtime variables)");
		Stadium stadium=new Stadium(cricketStadium,rent);
		System.out.println("created of new stadium with a no-fixed rent");
		System.out.println("stadium belongs to cricket (true or false): "+stadium.cricketStadium+" ,it can be changed at runtime");
		System.out.println("rent of the stadium: "+stadium.rent+" ,it can be changed at runtime");
		
	}
}