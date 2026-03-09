class WalnutRunner
{
	public static void main(String[] args)
	{
		Walnut w1=new Walnut(true,"USA",WalnutType.CALIFORNIA);
		w1.printInfo();
		System.out.println("-----------");

		Walnut w2=new Walnut(true,"India",WalnutType.KASHMIRI);
		w2.printInfo();
		System.out.println("-----------");

		Walnut w3=new Walnut(true,"Farm",WalnutType.ORGANIC);
		w3.printInfo();
		System.out.println("-----------");

		Walnut w4=new Walnut(true,"Export",WalnutType.PREMIUM);
		w4.printInfo();
	}
}