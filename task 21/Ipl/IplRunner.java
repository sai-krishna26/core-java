class IplRunner
{
	public static void main(String... values)
	{
		Stadium stadium=new Stadium("Chinnaswamy");
		Sponsor sponsor=new Sponsor("Tata");
		Owner owner=new Owner("United Spirits");
		Jersey jersey=new Jersey("Red");
		League league=new League("2024");

		Ipl ipl=new Ipl("RCB","Faf",0,25,false,null,sponsor,owner,jersey,league);
		ipl.getIpl();
	}
}