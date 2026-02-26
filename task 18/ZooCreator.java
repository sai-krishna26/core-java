class ZooCreator
{
	static void getZoo()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a int constructor");
		Zoo zoo=new Zoo(300);
		System.out.println("created of new Zoo with fixed species");
		System.out.println("count of the species: "+zoo.noOfSpecies+" ,it can't be changed at runtime");
	}
	static void getZoo(int noOfSpecies)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a int constructor(runtime value)");
		Zoo zoo=new Zoo(noOfSpecies);
		System.out.println("created of new Zoo with no-fixed species");
		System.out.println("count of the species: "+zoo.noOfSpecies+" ,it can be changed at runtime");
	}
	static void getZoo(double areaCoverd)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a double constructor(runtime value)");
		Zoo zoo=new Zoo(areaCoverd);
		System.out.println("created of new Zoo with no-fixed areaCoverd");
		System.out.println("area of the zoo covered: "+zoo.areaCoverd+" ,it can be changed at runtime");
	}
	static void getZoo(int noOfSpecies, double areaCoverd)
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("just wait.. creating a int and double constructor(runtime value)");
		Zoo zoo=new Zoo(noOfSpecies,areaCoverd);
		System.out.println("created of new Zoo and areaCoverd with no-fixed species");
		System.out.println("count of the species: "+zoo.noOfSpecies+" ,it can be changed at runtime");
		System.out.println("area of the zoo covered: "+zoo.areaCoverd+" ,it can be changed at runtime");
	}
}