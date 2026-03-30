class WarRunner
{
	public static void main(String...values)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");
		War war=new War();
		War war1=new War();
		System.out.println(war.warType);
		System.out.println(war.startYear);
		System.out.println(war.endYear);
		war.showUpdate();
		war.showDuration();
		System.out.println(war.startDate);
		System.out.println(war.stopDate);
		System.out.println(war.country1);
		System.out.println(war.country2);
		System.out.println(war.country3);
		war.showCounties();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");
		WorldWar worldwar=new War();
		WorldWar worldwar1=new War();
		System.out.println(worldwar1.warType);
		System.out.println(worldwar1.startYear);
		System.out.println(worldwar1.endYear);
		worldwar1.showUpdate();
		worldwar1.showDuration();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");
		WorldWar worldwarr=new WorldWar();
		WorldWar worldwarr1=new WorldWar();
		System.out.println(worldwarr1.warType);
		System.out.println(worldwarr1.startYear);
		System.out.println(worldwarr1.endYear);
		worldwarr1.showUpdate();
		worldwarr1.showDuration();
	}
	
}