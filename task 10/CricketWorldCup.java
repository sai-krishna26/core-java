class CricketWorldCup
{
	static void registerTeam(String teamName, String captainName,int ranking, boolean isHost, int squadSize)
	{
		System.out.println("Executing registerTeam in CricketWorldCup");
		
		
		if(teamName==null)
		{
			System.out.println("INVALID:team name should not be null");
			return;
		}
		
		if(captainName==null)
		{
			System.out.println("INVALID:captain name should not be null");
			return;
		}
		
		if(ranking<=0)
		{
			System.out.println("INVALID:ranking  should not be a <=0");
			return;
		}
		
		String isHostresult;
		if(isHost==true)
		{
			isHostresult="yes ";
		}
		else
		{
			isHostresult="no";
		}
		
		if(squadSize<=0)
		{
			System.out.println("INVALID:squad size should not be <=0");
			return;
		}
		
		
		
		System.out.println("team name: "+teamName+
							", captain: "+captainName+
							", rank of team: "+ranking+
							", this team is hosting : "+isHost+
							", size of squad: "+squadSize
						);
	}
}