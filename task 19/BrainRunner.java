class BrainRunner
{
	public static void main(String... value)
	{
		Brain b1 = new Brain("Ravi","Normal","Left","Short Term","High","O+","Dr. Kumar","Apollo","Bangalore","India",25,120,1400,86000,true,0.25,"None","None","Normal",false);
		b1.show();
		System.out.println("------------------------------------------------");

		Brain b2 = new Brain("Anita","Creative","Right","Long Term","Very High","A+","Dr. Mehta","Fortis","Mumbai","India",30,130,1350,85000,true,0.30,"None","None","Normal",false);
		b2.show();
		System.out.println("------------------------------------------------");

		Brain b3 = new Brain("John","Analytical","Left","Photographic","Genius","B+","Dr. Smith","CityCare","Delhi","India",28,145,1420,87000,true,0.20,"None","None","Strong",false);
		b3.show();
		System.out.println("------------------------------------------------");

		Brain b4 = new Brain("Priya","Normal","Right","Short Term","Average","AB+","Dr. Rao","MotherCare","Chennai","India",35,105,1380,83000,true,0.35,"Migraine","Medication","Normal",true);
		b4.show();
		System.out.println("------------------------------------------------");

		Brain b5 = new Brain("Kiran","Sensitive","Left","Long Term","High","O-","Dr. Reddy","Global","Hyderabad","India",40,115,1360,84000,true,0.32,"Anxiety","Therapy","Normal",true);
		b5.show();
		System.out.println("------------------------------------------------");

		Brain b6 = new Brain("Sneha","Creative","Right","Visual","High","B-","Dr. Patel","Sunrise","Pune","India",22,125,1340,82000,true,0.28,"None","None","Normal",false);
		b6.show();
		System.out.println("------------------------------------------------");

		Brain b7 = new Brain("Arjun","Analytical","Left","Auditory","Very High","A-","Dr. Varma","CarePlus","Kolkata","India",45,135,1450,88000,true,0.22,"Stress","Counseling","Strong",true);
		b7.show();
		System.out.println("------------------------------------------------");

		Brain b8 = new Brain("Meena","Normal","Right","Short Term","Average","O+","Dr. Sharma","LifeCare","Jaipur","India",29,110,1370,83500,true,0.31,"None","None","Normal",false);
		b8.show();
		System.out.println("------------------------------------------------");

		Brain b9 = new Brain("David","Creative","Left","Long Term","High","AB-","Dr. Wilson","Metro","Goa","India",33,118,1390,84500,true,0.27,"Depression","Medication","Normal",true);
		b9.show();
		System.out.println("------------------------------------------------");

		Brain b10 = new Brain("Lakshmi","Normal","Right","Visual","Above Average","A+","Dr. Iyer","Motherhood","Mysore","India",27,112,1330,81000,true,0.29,"None","None","Normal",false);
		b10.show();
		System.out.println("------------------------------------------------");
	}
}