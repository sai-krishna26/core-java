class Jersey
{
	String color;
	Jersey(String color)
	{
		this.color=color;
		System.out.println("created color using Jersey");
	}
	void getJersey()
	{
		System.out.println("Jersey color: "+this.color);
	}
}