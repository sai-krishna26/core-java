class CoachRunner
{
	public static void main(String... values)
	{
		Nation nation=new Nation("India");
		Type type=new Type("batting");
		Coaching coaching=new Coaching("morning");
		WorldCup worldCup=new WorldCup(3);
		
		Coach coach=new Coach("Ravi shastry","India",50,10,"Cricket",nation,type,coaching,worldCup);
		coach.getCoach();

	}
}