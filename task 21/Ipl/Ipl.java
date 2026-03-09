class Ipl
{
	String teamName;
	String captain;
	int titles;
	int players;
	boolean champion;

	Stadium stadium;
	Sponsor sponsor;
	Owner owner;
	Jersey jersey;
	League league;

	Ipl(String teamName,String captain,int titles,int players,boolean champion,
	Stadium stadium,Sponsor sponsor,Owner owner,Jersey jersey,League league)
	{
		this.teamName=teamName;
		this.captain=captain;
		this.titles=titles;
		this.players=players;
		this.champion=champion;
		this.stadium=stadium;
		this.sponsor=sponsor;
		this.owner=owner;
		this.jersey=jersey;
		this.league=league;

		System.out.println("created a IPL team using primitive and non primitive variables");
	}

	void getIpl()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("teamName: "+this.teamName);
		System.out.println("captain: "+this.captain);
		System.out.println("titles: "+this.titles);
		System.out.println("players: "+this.players);
		System.out.println("champion: "+this.champion);
		if(this.stadium==null)
		{
			System.out.println("stadium not found");
		}
		else
		{
			this.stadium.getStadium();
		}
		if(this.sponsor!=null)
		{
			this.sponsor.getSponsor();
		}
		if(this.owner!=null)
		{
			this.owner.getOwner();
		}
		if(this.jersey!=null)
		{
			this.jersey.getJersey();
		}
		if(this.league!=null)
		{
			this.league.getLeague();
		}
	}
	
}