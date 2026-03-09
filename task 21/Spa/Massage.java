class Massage
{
	String style;
	Massage(String style)
	{
		this.style=style;
		System.out.println("created style using Massage");
	}
	void getMassage()
	{
		System.out.println("Massage style: "+this.style);
	}
}
