class Reception
{
	static void book(String patientName,String symptom,String email,long mobile)
	{
		/*String name="Mukesh";
		String symptom="Mouth cancer";*/	
		
		System.out.println("executing the book method in side the Reception class\n");
		System.out.println("Patient name: "+patientName+", "+"symptom: "+symptom+", "+"email: "+email+", "+"mobile: "+mobile+"\n");
		System.out.println("-------------------------------------------------------");
		Hospital.bookAppointment(patientName,symptom);
		
	}
}