class Therapy
{
	String type;
	Therapy(String type)
	{
		this.type=type;
		System.out.println("created type using Therapy");
	}
	void getTherapy()
	{
		System.out.println("Therapy type: "+this.type);
	}
}