class MushroomRunner
{
	public static void main(String[] args)
	{
		Mushroom m1=new Mushroom(true,"White",MushroomType.BUTTON);
		m1.printInfo();
		System.out.println("-----------");

		Mushroom m2=new Mushroom(true,"Grey",MushroomType.OYSTER);
		m2.printInfo();
		System.out.println("-----------");

		Mushroom m3=new Mushroom(true,"Brown",MushroomType.SHIITAKE);
		m3.printInfo();
		System.out.println("-----------");

		Mushroom m4=new Mushroom(true,"Dark",MushroomType.PORTOBELLO);
		m4.printInfo();
	}
}