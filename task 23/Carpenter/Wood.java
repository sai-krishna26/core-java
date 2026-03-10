class 	Wood
{
	String type;
	String purpose;
	
	Wood(String type,String purpose)
	{
		this.type=type;
		this.purpose=purpose;
		//System.out.println("created a wood constructor by type and purpose");
	}
	
	void displayWood()
	{
		System.out.println("type:"+this.type);
		System.out.println("purpose:"+this.purpose);
	}
}