class LiftRunner
{
	public static void main(String[] values)
	{
	
		String company=Lift.getCompany("dwaraka");
		System.out.println("company: "+company);

		String company1=Lift.getCompany("ayodhya");
		System.out.println("company: "+company1);
		
		String company2=Lift.getCompany("hampi");
		System.out.println("company: "+company2);
		
		String company3=Lift.getCompany("vaikunta");
		System.out.println("company: "+company3);
		
		String company4=Lift.getCompany("swarga");
		System.out.println("company: "+company4);
	}
}