class IplRunner
{
	public static void main(String... values)
	{
		Stadium stadium=new Stadium("Chinnaswamy");
		Sponsor sponsor=new Sponsor("Tata");
		Coach coach=new Coach("Andy Flower","RCB",50,15,"Cricket",new Nation("England"),new Type("batting"),new Coaching("evening"),new WorldCup(1));
		Owner owner=new Owner("United Spirits");
		Jersey jersey=new Jersey("Red");
		League league=new League("2024");

		Ipl ipl=new Ipl("RCB","Faf",0,25,false,stadium,sponsor,coach,owner,jersey,league);
		ipl.getIpl();
	}
}