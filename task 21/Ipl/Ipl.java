class Ipl
{
	String teamName;
	String captain;
	int titles;
	int players;
	boolean champion;

	Stadium stadium;
	Sponsor sponsor;
	Coach coach;
	Owner owner;
	Jersey jersey;
	League league;

	Ipl(String teamName,String captain,int titles,int players,boolean champion,
	Stadium stadium,Sponsor sponsor,Coach coach,Owner owner,Jersey jersey,League league)
	{
		this.teamName=teamName;
		this.captain=captain;
		this.titles=titles;
		this.players=players;
		this.champion=champion;
		this.stadium=stadium;
		this.sponsor=sponsor;
		this.coach=coach;
		this.owner=owner;
		this.jersey=jersey;
		this.league=league;

		System.out.println("created a IPL team using primitive and non primitive variables");
	}

	void getIpl()
	{
		System.out.println("teamName: "+this.teamName);
		System.out.println("captain: "+this.captain);
		System.out.println("stadium object: "+this.stadium);
	}
}