class CricketWorldCupRunner
{
	public static void main(String[] cricket)
	{
			
		
			CricketWorldCup.registerTeam("India","Surya kumar yadav",1,true,30);
			CricketWorldCup.registerTeam("Australia","pat cummins",2,false,24);
			CricketWorldCup.registerTeam("england","phill salt",4,false,20);
			
			
			CricketWorldCup.saveMatch(88,"india","afghanistan","sharza,soudhi arebia","dubai","12th march 2026",10.16f,20,true,"nithin","donald");
			CricketWorldCup.saveMatch(92,"india","england","wankhde staduim,india","mumbai","16th march 2026",7.15f,20,false,"nithin","donald");
			CricketWorldCup.saveMatch(95,"india","pakistan","colombo,sri lanka","colombo","20th march 2026",7.15f,20,false,"nithin","donald");
			
			
			CricketWorldCup.savePlayer("Youraj singh","india",97,"all-rounder",false,false,150,10000,450,66.77f,8.5f);
			CricketWorldCup.savePlayer("Suresh raina","india",41,"all-rounder",false,false,200,15000,300,51.33f,7.5f);
			CricketWorldCup.savePlayer("jasprit bumrahh","india",88,"bowler",false,true,100,1500,1500,10.5f,4.7f);
			
			CricketWorldCup.calculateRunrate(130,10,2);
			CricketWorldCup.calculateRunrate(150,13,5);
	}
}