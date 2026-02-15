class Patient
{
	static void sick()
	{
		
		String patientName="Mukesh";
		String symptom="Mouth cancer";
		String email="Mukesh1999@gmail.com";
		long mobile=9999888800L;
		
		System.out.println("executing the sick method in side the patient class"+"\n");
		System.out.println("Patient name: "+patientName+", "+"symptom: "+symptom+", "+"email: "+email+", "+"mobile: "+mobile);
		System.out.println("-------------------------------------------------------");
		Mobile.register(patientName,symptom,email,mobile);
	}
}