class AquariumRunner
{
	public static void main(String... values)
	{
		Fish fish=new Fish("Goldfish");
		Water water=new Water("Fresh");
		Filter filter=new Filter("AquaPro");
		Light light=new Light("Blue");
		Plant plant=new Plant("Lotus");
		Ticket ticket=new Ticket(100);

		Aquarium aquarium=new Aquarium("City Aquarium","Mysore",10,200,true,
		fish,water,filter,light,plant,ticket);

		aquarium.getAquarium();
	}
}
