class Aroma
{
	String smell;
	Aroma(String smell)
	{
		this.smell=smell;
		System.out.println("created smell using Aroma");
	}
	void getAroma()
	{
		System.out.println("Aroma smell: "+this.smell);
	}
}