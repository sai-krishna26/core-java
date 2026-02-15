class Nurse
{
	static void basicCheck(String patientName,String symptom,int bp,boolean sugar)
	{
		
		/*String name="Mukesh";
		String symptom="Mouth cancer";*/
		
		String sugarTest;
		
		if(sugar==true)
			sugarTest="has sugar";
		else
			sugarTest="no sugar";
		System.out.println("executing the basicCheck method in side the nurse class\n");
		System.out.println("Patient name: "+patientName+", "+"symptom: "+symptom+", "+"blood pressure: "+bp+", "+"sugar test: "+sugarTest);
		System.out.println("-------------------------------------------------------");
		Doctor.treat(patientName,symptom);
		
	}
}