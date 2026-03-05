class Lion
{
	String name;
	String color;
	int age;
	int weight;
	boolean wild;

	Habitat habitat;
	Diet diet;
	Tail tail;
	Claw claw;
	Pride pride;
	Forest forest;

	Lion(String name,String color,int age,int weight,boolean wild,
	Habitat habitat,Diet diet,Tail tail,Claw claw,Pride pride,Forest forest)
	{
		this.name=name;
		this.color=color;
		this.age=age;
		this.weight=weight;
		this.wild=wild;
		this.habitat=habitat;
		this.diet=diet;
		this.tail=tail;
		this.claw=claw;
		this.pride=pride;
		this.forest=forest;

		System.out.println("created a Lion using primitive and non primitive variables");
	}

	void getLion()
	{
		System.out.println("name: "+this.name);
		System.out.println("color: "+this.color);
		System.out.println("habitat object: "+this.habitat);
	}
}
