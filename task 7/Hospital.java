class Hospital
{
	static void bookAppointment(String patientName,String symptom)
	{
		
		//tring name="Mukesh";
		//String symptom="Mouth cancer";
		int bp=150;
		boolean sugar=true;
		
		System.out.println("executing the bookAppointment method in side the hospital class\n");
		System.out.println("Patient name: "+patientName+", "+"symptom: "+symptom+"\n");
		System.out.println("-------------------------------------------------------");
		Nurse.basicCheck(patientName,symptom,bp,sugar);
	}
}