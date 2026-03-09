class CourtRunner
{
	public static void main(String... val)
	{
		Lawyer lawyer=new Lawyer("Dharmendra");
		CourtLevels courts=CourtLevels.DISTRICTCOURT;
		Court court=new Court(743,lawyer,courts);
		court.PrintCourtInfo();
		System.out.println("--------------------------------------------");
		
		Lawyer lawyer1=new Lawyer("Karunakar");
		Court court1=new Court(743,lawyer1,CourtLevels.HIGHCOURT);
		court1.PrintCourtInfo();
		System.out.println("--------------------------------------------");
		
		Lawyer lawyer2=new Lawyer("Jagdeep");
		Court court2=new Court(743,lawyer2,CourtLevels.TALUKACOURT);
		court2.PrintCourtInfo();
		System.out.println("--------------------------------------------");
		
		Lawyer lawyer3=new Lawyer("Ramanajun");
		Court court3=new Court(743,lawyer3,CourtLevels.SUPREMECOURT);
		court3.PrintCourtInfo();
	}
}