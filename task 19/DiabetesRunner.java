class DiabetesRunner
{
	public static void main(String... value)
	{
		Diabetes d1 = new Diabetes("Ravi","Type 1","Male","O+","Dr. Kumar","Apollo","Bangalore","India","Insulin","Low Carb",25,210,150,2020,true,72.5,"Frequent Urination","Insulin Therapy","Walking",true);
		d1.show();
		System.out.println("------------------------------------------------");

		Diabetes d2 = new Diabetes("Anita","Type 2","Female","A+","Dr. Mehta","Fortis","Mumbai","India","Metformin","Balanced Diet",45,180,130,2018,false,68.0,"Fatigue","Oral Medication","Yoga",true);
		d2.show();
		System.out.println("------------------------------------------------");

		Diabetes d3 = new Diabetes("John","Type 2","Male","B+","Dr. Smith","CityCare","Delhi","India","Glipizide","Low Sugar",50,250,170,2015,false,85.0,"Blurred Vision","Medication","Cycling",false);
		d3.show();
		System.out.println("------------------------------------------------");

		Diabetes d4 = new Diabetes("Priya","Gestational","Female","AB+","Dr. Rao","MotherCare","Chennai","India","Insulin","Pregnancy Diet",30,190,140,2023,true,70.0,"Nausea","Insulin Therapy","Light Exercise",true);
		d4.show();
		System.out.println("------------------------------------------------");

		Diabetes d5 = new Diabetes("Kiran","Type 1","Male","O-","Dr. Reddy","Global Hospital","Hyderabad","India","Insulin","Strict Diet",18,230,160,2019,true,60.0,"Weight Loss","Insulin Pump","Running",false);
		d5.show();
		System.out.println("------------------------------------------------");

		Diabetes d6 = new Diabetes("Sneha","Type 2","Female","B-","Dr. Patel","Sunrise","Pune","India","Metformin","Low Carb",55,175,120,2016,false,74.0,"Dry Mouth","Oral Medication","Walking",true);
		d6.show();
		System.out.println("------------------------------------------------");

		Diabetes d7 = new Diabetes("Arjun","Type 2","Male","A-","Dr. Varma","CarePlus","Kolkata","India","Insulin","Balanced Diet",60,260,180,2014,true,90.0,"Slow Healing","Insulin Therapy","Swimming",false);
		d7.show();
		System.out.println("------------------------------------------------");

		Diabetes d8 = new Diabetes("Meena","Type 1","Female","O+","Dr. Sharma","LifeCare","Jaipur","India","Insulin","Low Sugar",22,200,150,2021,true,58.0,"Fatigue","Injection","Yoga",true);
		d8.show();
		System.out.println("------------------------------------------------");

		Diabetes d9 = new Diabetes("David","Type 2","Male","AB-","Dr. Wilson","Metro","Goa","India","Metformin","Diet Control",48,220,155,2017,false,80.0,"Increased Thirst","Medication","Gym",false);
		d9.show();
		System.out.println("------------------------------------------------");

		Diabetes d10 = new Diabetes("Lakshmi","Gestational","Female","A+","Dr. Iyer","Motherhood","Mysore","India","Insulin","Healthy Diet",28,185,135,2024,true,65.0,"Frequent Urination","Insulin Therapy","Walking",true);
		d10.show();
		System.out.println("------------------------------------------------");
	}
}