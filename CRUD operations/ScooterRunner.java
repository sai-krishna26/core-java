class ScooterRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] scooterNames=new String[8];
		Scooterr scooter=new Scooterr(scooterNames);
		
		scooter.getScooterName(null);
		scooter.getScooterName("Activa");
		scooter.getScooterName("Jupiter");
		scooter.getScooterName("Access");
		scooter.getScooterName("Fascino");
		scooter.getScooterName("Pleasure");
		scooter.getScooterName("Ntorq");
		scooter.getScooterName("Burgman");
		scooter.getScooterName("Dio");
		scooter.getScooterName("RayZR");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		scooter.getSearchName("Activa");
		scooter.getSearchName("Jupiter");
		scooter.getSearchName("Access");
		scooter.getSearchName("Fascino");
		scooter.getSearchName("Pleasure");
		scooter.getSearchName("Ntorq");
		scooter.getSearchName("Burgman");
		scooter.getSearchName("Dio");
		scooter.getSearchName("Activa");
	}
}