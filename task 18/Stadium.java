class Stadium
{
	boolean cricketStadium;
	float rent;
	
	Stadium(boolean cricketStadium)
	{
		this.cricketStadium=cricketStadium;
		System.out.println("boolean constructor is created");
	}
	Stadium(float rent)
	{
		this.rent=rent;
		System.out.println("float constructor id created");
	}
	Stadium(boolean cricketStadium, float rent)
	{
		this.cricketStadium=cricketStadium;
		this.rent=rent;
		System.out.println("boolean and float constructors are created");
	}
}