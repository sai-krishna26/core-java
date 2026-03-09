class Cashew
{
	boolean isRoasted;
	String grade;
	CashewType type;

	Cashew(boolean isRoasted,String grade,CashewType type)
	{
		this.isRoasted=isRoasted;
		this.grade=grade;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Roasted: "+this.isRoasted);

		if(this.grade!=null)
		{
			System.out.println("Grade: "+this.grade);
		}

		if(this.type!=null)
		{
			System.out.println("Type: "+this.type);
		}
	}
}