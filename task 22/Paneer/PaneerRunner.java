class PaneerRunner
{
	public static void main(String[] args)
	{
		Paneer p1=new Paneer(true,"Amul",PaneerType.FULLCREAM);
		p1.printInfo();
		System.out.println("-----------");

		Paneer p2=new Paneer(true,"Nandini",PaneerType.LOWFAT);
		p2.printInfo();
		System.out.println("-----------");

		Paneer p3=new Paneer(true,"OrganicFarm",PaneerType.ORGANIC);
		p3.printInfo();
		System.out.println("-----------");

		Paneer p4=new Paneer(true,"MilkFresh",PaneerType.MALAI);
		p4.printInfo();
	}
}