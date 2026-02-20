class BreadRunner
{
	public static void main(String[] value)
	{
		Bread bread=new Bread();
		Bread bread1=new Bread();
		
		System.out.println("default type :"+bread.type);
		System.out.println("default outletNames :"+bread.outletNames);
		System.out.println("default ingredeints :"+bread.ingredeints);
		System.out.println("default shape :"+bread.shape);
		
		bread.type="With Egg";
		bread.outletNames=new String[]{"Brittania","amul","wibs"};
		bread.ingredeints=new String[]{"maida","egg","water"};
		bread.shape="circle";
		
		System.out.println("\ninitialized type :"+bread.type);
		System.out.println("initialized outletNames :");
		for(String out:bread.outletNames)
		{
			System.out.print(out+", ");
		}
		
		System.out.println("\ninitialized ingredeints :");
		for(String ing:bread.ingredeints)
		{
			System.out.print(ing+", ");
		}
		System.out.println("\ninitialized shape :"+bread.shape);
		
	}
}