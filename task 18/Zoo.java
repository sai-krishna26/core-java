class Zoo
{
	int noOfSpecies;
    double areaCoverd;

	Zoo(int noOfSpecies)
	{
		this.noOfSpecies=noOfSpecies;
		System.out.println("int constructor is created");
	}
	Zoo(double areaCoverd)
	{
		this.areaCoverd=areaCoverd;
		System.out.println("double constructor is created");
	}
	Zoo(int noOfSpecies,double areaCoverd)
	{
		this.noOfSpecies=noOfSpecies;
		this.areaCoverd=areaCoverd;
		System.out.println("int and double constructor is created");
	}
}