class AgencyRunner
{
	public static void main(String...numbers)
	{
		int[] cylinderNumbers=new cylinderNumbers[5];
		Agency agency=new Agency(cylinderNumbers);
		
		agency.getCylinderNumber(10);
		agency.getCylinderNumber(11);
		agency.getCylinderNumber(12);
		agency.getCylinderNumber(13);
		agency.getCylinderNumber(14);
		
	}
}