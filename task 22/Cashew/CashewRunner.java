class CashewRunner
{
	public static void main(String[] args)
	{
		Cashew c1=new Cashew(true,"Premium",CashewType.W180);
		c1.printInfo();
		System.out.println("-----------");

		Cashew c2=new Cashew(true,"Standard",CashewType.W210);
		c2.printInfo();
		System.out.println("-----------");

		Cashew c3=new Cashew(false,"Medium",CashewType.W240);
		c3.printInfo();
		System.out.println("-----------");

		Cashew c4=new Cashew(true,"Economy",CashewType.W320);
		c4.printInfo();
	}
}