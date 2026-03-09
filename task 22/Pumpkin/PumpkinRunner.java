class PumpkinRunner
{
	public static void main(String[] args)
	{
		Pumpkin p1=new Pumpkin(true,"Orange",PumpkinType.BIG);
		p1.printInfo();
		System.out.println("-----------");

		Pumpkin p2=new Pumpkin(true,"Yellow",PumpkinType.SMALL);
		p2.printInfo();
		System.out.println("-----------");

		Pumpkin p3=new Pumpkin(false,"Green",PumpkinType.ORGANIC);
		p3.printInfo();
		System.out.println("-----------");

		Pumpkin p4=new Pumpkin(true,"Dark Orange",PumpkinType.HYBRID);
		p4.printInfo();
	}
}