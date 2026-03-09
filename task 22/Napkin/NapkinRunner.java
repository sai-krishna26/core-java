class NapkinRunner
{
	public static void main(String[] args)
	{
		Napkin napkin1 = new Napkin(true,"Softy",NapkinType.PAPER);
		napkin1.printInfo();
		System.out.println("---------------------");
		
		Napkin napkin2 = new Napkin(true,"CleanPro",NapkinType.CLOTH);
		napkin2.printInfo();
		System.out.println("---------------------");
		
		Napkin napkin3 = new Napkin(false,"FreshWipe",NapkinType.TISSUE);
		napkin3.printInfo();
		System.out.println("---------------------");
		
		Napkin napkin4 = new Napkin(true,"HygienePlus",NapkinType.WET);
		napkin4.printInfo();
	}
}