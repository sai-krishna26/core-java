class Sponsor
{
	String company;
	Sponsor(String company)
	{
		this.company=company;
		System.out.println("created company using Sponsor");
	}
	void getSponsor()
	{
		System.out.println("Sponsor company: "+this.company);
	}
}