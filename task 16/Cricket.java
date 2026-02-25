class Cricket
{
	String team="India";
	String player="Virat";
	int runs=100;
	int wickets=5;
	double strikeRate=120.5;
	boolean win=true;
	char format='O';
	int matches=50;
	long audience=50000;
	float average=55.5f;
	String captain="Rohit";
	String ground="Mumbai";
	int overs=50;
	int balls=300;
	double runRate=6.5;
	boolean tossWon=true;
	char result='W';
	int year=2025;
	long score=280;
	float economy=4.5f;

	Cricket(String team,String player,int runs,int wickets,double strikeRate,
	boolean win,char format,int matches,long audience,float average,
	String captain,String ground,int overs,int balls,double runRate,
	boolean tossWon,char result,int year,long score,float economy)
	{
		this.team=team;
		this.player=player;
		this.runs=runs;
		this.wickets=wickets;
		this.strikeRate=strikeRate;
		this.win=win;
		this.format=format;
		this.matches=matches;
		this.audience=audience;
		this.average=average;
		this.captain=captain;
		this.ground=ground;
		this.overs=overs;
		this.balls=balls;
		this.runRate=runRate;
		this.tossWon=tossWon;
		this.result=result;
		this.year=year;
		this.score=score;
		this.economy=economy;

		System.out.println("Team: "+team);
	}
}

