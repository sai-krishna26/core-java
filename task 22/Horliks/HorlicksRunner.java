class HorlicksRunner
{
	public static void main(String[] args)
	{
		Horlicks h1=new Horlicks(true,"Malt",HorlicksType.CLASSIC);
		h1.printInfo();
		System.out.println("-----------");

		Horlicks h2=new Horlicks(true,"Chocolate",HorlicksType.CHOCOLATE);
		h2.printInfo();
		System.out.println("-----------");

		Horlicks h3=new Horlicks(true,"Kids",HorlicksType.JUNIOR);
		h3.printInfo();
		System.out.println("-----------");

		Horlicks h4=new Horlicks(true,"Health",HorlicksType.WOMENS);
		h4.printInfo();
	}
}