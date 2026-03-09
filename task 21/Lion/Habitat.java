class Habitat
{
	String place;
	Habitat(String place)
	{
		this.place=place;
		System.out.println("created place using Habitat");
	}
	void getHabitat()
	{
		System.out.println("Habitat Place: "+this.place);
	}
}