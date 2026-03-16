class StorePetroliumCompanyRunner
{
	public static void main(String... values)
	{
		String[] companyName=new String[5];
		StorePetroliumCompany storePetroliumCompany=new StorePetroliumCompany(companyName);
		
		storePetroliumCompany.getCompanyName("Indian oil");
		storePetroliumCompany.getCompanyName("Bharath petrolium");
		storePetroliumCompany.getCompanyName("shell");
		storePetroliumCompany.getCompanyName("Hindusthan petrolium");
		storePetroliumCompany.getCompanyName(null);
		storePetroliumCompany.getCompanyName("nayara");
		storePetroliumCompany.getCompanyName("nayara");
	}
}