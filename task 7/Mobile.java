class Mobile
{
	static void register(String patientName,String symptom,String email,long mobile)
	{
		/*String name="Mukesh";
		String symptomm="Mouth cancer";
		String emaill="Mukesh1999@gmail.com";
		long mobilee=9999888800L;*/
		
		System.out.println("executing the register method in side the mobile class"+"\n");
		System.out.println("Patient name: "+patientName+", "+"symptom: "+symptom+", "+"email: "+email+", "+"mobile: "+mobile+"\n");
		System.out.println("-------------------------------------------------------");
		Reception.book(patientName,symptom,email,mobile);
	}
}