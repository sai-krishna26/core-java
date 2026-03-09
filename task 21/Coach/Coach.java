class Coach
{
	String name;
	String teamName;
	int age;
	int experience;
	String sportType;
	
	Nation nation;
	Type type;
	Coaching coaching;
	WorldCup worldCup;
	
	Coach(String name,String teamName,int age,int experience,String SportType,Nation nation,Type type,Coaching coaching,WorldCup worldCup)
	{
		this.name=name;
		this.teamName=teamName;
		this.age=age;
		this.experience=experience;
		this.sportType=sportType;
		this.nation=nation;
		this.type=type;
		this.coaching=coaching;
		this.worldCup=worldCup;
		
		System.out.println("created a Coach using String name,String teamName,int ageint experience,String SportType,Nation nation,Type type,Coaching coaching,WorldCup worldCup");
	}
	
	void getCoach()
	{
		System.out.println("name: "+this.name);
		System.out.println("teamName: "+this.teamName);
		System.out.println("age: "+this.age);
		System.out.println("experience: "+this.experience);
		System.out.println("sportType: "+this.sportType);
		if(this.nation!=null)
		{
			this.nation.getNation();
		}
		else
		{
			System.out.println("nationality not found");
		}
		if(this.type!=null)
		{
			this.type.getType();
		}
		if(this.coaching!=null)
		{
			this.coaching.getCoaching();
		}
		if(this.worldCup!=null)
		{
			this.worldCup.getWorldCup();
		}		
	}
}