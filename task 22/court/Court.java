class Court
{
	int totalCourts;
	Lawyer name;
	CourtLevels courtLevel;
	
	Court(int totalCourts, Lawyer name, CourtLevels courtLevel)
	{
		this.totalCourts=totalCourts;
		this.name=name;
		this.courtLevel=courtLevel;
	}
	
	void PrintCourtInfo()
	{
		System.out.println("totalCourts: "+this.totalCourts);
		
		if(this.name!=null)
		{
			this.name.getLawyer();
		}
		else
		{
			System.out.println("value cannot be a null");
		}
		
		if(this.courtLevel!=null)
		{
			System.out.println("Level of court: "+this.courtLevel);
			
		}
		else
		{
			System.out.println("value cannot be a null");
		}
	}
}