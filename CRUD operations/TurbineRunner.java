class TurbineRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] turbineNames=new String[8];
		Turrbine turbine=new Turrbine(turbineNames);
		
		turbine.getTurbineName(null);
		turbine.getTurbineName("Steam");
		turbine.getTurbineName("Gas");
		turbine.getTurbineName("Wind");
		turbine.getTurbineName("Water");
		turbine.getTurbineName("Pelton");
		turbine.getTurbineName("Kaplan");
		turbine.getTurbineName("Francis");
		turbine.getTurbineName("Impulse");
		turbine.getTurbineName("Reaction");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		turbine.getSearchName("Steam");
		turbine.getSearchName("Gas");
		turbine.getSearchName("Wind");
		turbine.getSearchName("Water");
		turbine.getSearchName("Pelton");
		turbine.getSearchName("Kaplan");
		turbine.getSearchName("Francis");
		turbine.getSearchName("Impulse");
		turbine.getSearchName("Steam");
	}
}