class Nurse
{
	static void basicCheck(String patientName,String symptom,int bp,boolean sugar)
	{
		String sugarTest;
		
		if(sugar==true)
			sugarTest="has sugar";
		else
			sugarTest="no sugar";
		
		System.out.println("Patient name: "+patientName+"symptom: "+symptom+"blood pressure: "+bp+"sugar test: "+sugarTest)
		
	}
}