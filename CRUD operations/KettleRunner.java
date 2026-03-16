class KettleRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] kettleNames=new String[8];
		Kettle kettle=new Kettle(kettleNames);
		
		kettle.getKettleName(null);
		kettle.getKettleName("Prestige");
		kettle.getKettleName("Philips");
		kettle.getKettleName("Havells");
		kettle.getKettleName("Butterfly");
		kettle.getKettleName("Pigeon");
		kettle.getKettleName("Bajaj");
		kettle.getKettleName("Orpat");
		kettle.getKettleName("Milton");
		kettle.getKettleName("Cello");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		kettle.getSearchName("Prestige");
		kettle.getSearchName("Philips");
		kettle.getSearchName("Havells");
		kettle.getSearchName("Butterfly");
		kettle.getSearchName("Pigeon");
		kettle.getSearchName("Bajaj");
		kettle.getSearchName("Orpat");
		kettle.getSearchName("Milton");
		kettle.getSearchName("Prestige");
	}
}