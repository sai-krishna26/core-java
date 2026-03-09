class LionRunner
{
	public static void main(String... values)
	{
		Habitat habitat=new Habitat("Savannah");
		Diet diet=new Diet("Meat");
		Tail tail=new Tail(1.2);
		Claw claw=new Claw(18);
		Pride pride=new Pride(10);
		Forest forest=new Forest("Gir");

		Lion lion=new Lion("Simba","Golden",6,190,true,null,diet,tail,claw,pride,forest);
		System.out.println("----------------------------------------------");
		lion.getLion();
	}
}