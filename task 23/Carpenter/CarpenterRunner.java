class CarpenterRunner
{
	public static void main(String... values)
	{
		Wood[] wood=new Wood[3];
		wood[0]=new Wood("oak","furniture");
		wood[1]=new Wood("pine","construction");
		wood[2]=new Wood("plywood","inner roof");
		
		String[] roles=new String[3];
		roles[0]="requirements";
		roles[1]="design";
		roles[2]="product";
		
		Carpenter carpenter=new Carpenter(roles,wood);
		carpenter.printCarpenter();
	}
}