class Rain
{
	String season;
	boolean isRaining;
	double humidity;
	double temparature;
	double probability;
	
	Rain()
	{
		System.out.println("i am a msg of non parameterized Run constructor");
	}
	Rain(String season)
	{
		this.season=season;
		System.out.println(season);
	}
	Rain(String season,boolean isRaining)
	{
		this.season=season;
		this.isRaining=isRaining;
		System.out.println(season+", "+isRaining);
	}
	Rain(String season,boolean isRaining,double humidity)
	{
		this.season=season;
		this.isRaining=isRaining;
		this.humidity=humidity;
		System.out.println(season+", "+isRaining+", "+humidity);
	}
	Rain(String season,boolean isRaining,double humidity,double temparature)
	{
		this.season=season;
		this.isRaining=isRaining;
		this.humidity=humidity;
		this.temparature=temparature;
		System.out.println(season+", "+isRaining+", "+humidity+", "+temparature);
	}
	Rain(String season,boolean isRaining,double humidity,double temparature,double probability)
	{
		this.season=season;
		this.isRaining=isRaining;
		this.humidity=humidity;
		this.temparature=temparature;
		System.out.println(season+", "+isRaining+", "+humidity+", "+temparature+", "+probability);
	}
}