class BeerRunner
{
	public static void main(String[] args)
	{
		Beer b1=new Beer(true,"Kingfisher",BeerType.LAGER);
		b1.printInfo();
		System.out.println("-----------");

		Beer b2=new Beer(true,"Budweiser",BeerType.ALE);
		b2.printInfo();
		System.out.println("-----------");

		Beer b3=new Beer(true,"Guinness",BeerType.STOUT);
		b3.printInfo();
		System.out.println("-----------");

		Beer b4=new Beer(true,"Hoegaarden",BeerType.WHEAT);
		b4.printInfo();
	}
}