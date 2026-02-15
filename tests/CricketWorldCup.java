class CricketWorldCup
{
	static void registerTeam(String teamName, String captainName,int ranking, boolean isHost, int squadSize)
	{
		System.out.println("\nExecuting registerTeam in CricketWorldCup");
		
		
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
			isHostresult="yes";
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
	System.out.println("VALID details");
		System.out.println("\nteam name: "+teamName+
							", captain: "+captainName+
							", rank of team: "+ranking+
							", this team is hosting : "+isHostresult+
							", size of squad: "+squadSize
						);
	}
	
	
	
	static void saveMatch(int matchId, String team1, String team2, String venue, String city, String date, float time, int overs, boolean isDayNight, String umpire1, String umpire2)
	{
		System.out.println("\nExecuting saveMatch in CricketWorldCup");
	
		
		if(matchId<0)
		{
			System.out.println("INVALID:match id should not be a <0");
			return;
		}
		
		if(team1==null)
		{
			System.out.println("INVALID:team1 should not be a null");
			return;
		}
		
		if(team2==null)
		{
			System.out.println("INVALID:team2 should not be a null");
			return;
		}
		
		if(venue==null)
		{
			System.out.println("INVALID:venue should not be a null");
			return;
		}
		
		if(city==null)
		{
			System.out.println("INVALID:city  should not be a null");
			return;
		}
		
		if(date==null)
		{
			System.out.println("INVALID:date should not be a null");
			return;
		}
		
		if(time<0)
		{
			System.out.println("INVALID:time  should not be a <0");
			return;
		}
		
		if(overs<0)
		{
			System.out.println("INVALID:overs  should not be a <0");
			return;
		}
		
		if(umpire1==null)
		{
			System.out.println("INVALID:umpire1 should not be a null");
			return;
		}
		
		if(umpire2==null)
		{
			System.out.println("INVALID:umpire2 should not be a null");
			return;
		}
	System.out.println("VALID details");
	
	System.out.println("\nmatch id: "+matchId+
							", team1: "+team1+
							", team2: "+team2+
							", venue: "+venue+
							", city: "+city+
							", date: "+date+
							", time: "+time+
							", overs: "+overs+
							", day/night (true=day/false=night): "+isDayNight+
							", umpire1: "+umpire1+
							", umpire2: "+umpire2
						);
		
	
	
	
	}
		
	
	static void savePlayer(String playerName, String teamName, int jersyNumber, String role, boolean isCaptain, boolean isViseCaptain, int matchesPlayed, int runsScored, int wicketsTaken, float battingAverage, float bowlingEconomy)
	{
		System.out.println("\nExecuting savePlayer in CricketWorldCup");
		
		
		if(playerName==null)
		{
			System.out.println("INVALID:player name should not be null");
			return;
		}
		
		if(teamName==null)
		{
			System.out.println("INVALID:team name should not be null");
			return;
		}
		
		if(jersyNumber<0)
		{
			System.out.println("INVALID:ranking  should not be a <0");
			return;
		}
		
		
		if(role==null)
		{
			System.out.println("INVALID:role should not be a null");
			return;
		}
		
		String isCaptainresult;
		if(isCaptain==true)
		{
			isCaptainresult="yes";
		}
		else
		{
			isCaptainresult="no";
		}
		
		String isViseCaptainresult;
		if(isViseCaptain==true)
		{
			isViseCaptainresult="yes";
		}
		else
		{
			isViseCaptainresult="no";
		}
		
		if(matchesPlayed<0)
		{
			System.out.println("INVALID:matches played should not be a <0");
			return;
		}
		
		if(runsScored<0)
		{
			System.out.println("INVALID:runs scored should not be a <0");
			return;
		}
		
		if(wicketsTaken<0)
		{
			System.out.println("INVALID:wickets Taken should not be a <0");
			return;
		}
		
		if(battingAverage<0)
		{
			System.out.println("INVALID:average score should not be a <0");
			return;
		}
		
		if(bowlingEconomy<0)
		{
			System.out.println("INVALID:economy should not be a <0");
			return;
		}
	System.out.println("VALID details");
		
		System.out.println("\nplayer name: "+playerName+
							", team name: "+teamName+
							", jersy number: "+jersyNumber+
							", role of the player: "+role+
							", is a captain: "+isCaptainresult+
							", is a vise captainName: "+isViseCaptainresult+
							", total matches: "+matchesPlayed+
							", total runs: "+runsScored+
							", total wickets: "+wicketsTaken+
							", batting Average: "+battingAverage+
							", bowling Economy: "+bowlingEconomy
						);
		
		
	}

	
	
	static void calculateRunrate(int totalRuns,int oversFaced,int wicketsLost)
	{
		System.out.println("\nExecuting calculateRunrate in CricketWorldCup");
		
		if(totalRuns<0)
		{
			System.out.println("INVALID:total should not be a <0");
			return;
		}
		
		if(oversFaced<0)
		{
			System.out.println("INVALID:overs played should not be a <0");
			return;
		
		}
		
		if(wicketsLost<0)
		{
			System.out.println("INVALID:wickets lost should not be a <0");
			return;
		}
		
		double netRunRateResult;
		int noOfBalls=oversFaced*6;
		netRunRateResult = totalRuns / noOfBalls;
		
		System.out.println("VALID details");
		System.out.println("\ntotal runs: "+totalRuns+
							", overs Faced: "+oversFaced+
							", wickets Lost: "+wicketsLost+
							", net run rate: "+netRunRateResult
						);
		
		
		
	}

}