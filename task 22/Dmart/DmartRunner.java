class DmartRunner
{
	public static void main(String... args)
	{
		DMart dmart =new DMart(4,	"Majestic",Products.STATIONARY);
		dmart.PrintDMartInfo();
		System.out.println("-----------------------------------------------");
			
		DMart dmart1 =new DMart(5,"MGBS",Products.GROSSORY);
		dmart1.PrintDMartInfo();
		System.out.println("-----------------------------------------------");
		
		DMart dmart2 =new DMart(2,"HSRlayout",Products.CLOTHS);
		dmart2.PrintDMartInfo();
		System.out.println("-----------------------------------------------");
		
		DMart dmart3 =new DMart(5,"Anekal",Products.SNACKS);
		dmart3.PrintDMartInfo();
	}
}