class OfficeRunner
{
	public static void main(String... value)
	{
		Office o1 = new Office("TechSoft","Bangalore","IT","Ravi Kumar","Anita Rao","Development","Corporate","India","9AM-6PM","info@techsoft.com",500,2010,5,50,true,5000000.0,"Biometric","Airtel","Day Shift",false);
		o1.show();
		System.out.println("------------------------------------------------");

		Office o2 = new Office("HealthCare Pvt Ltd","Mumbai","Medical","Suresh Mehta","Priya Shah","HR","Commercial","India","10AM-7PM","contact@healthcare.com",300,2005,3,30,false,3000000.0,"CCTV","Jio","Day Shift",false);
		o2.show();
		System.out.println("------------------------------------------------");

		Office o3 = new Office("EduSmart","Delhi","Education","Amit Verma","Sneha Kapoor","Academics","Corporate","India","8AM-4PM","admin@edusmart.com",200,2015,4,25,true,2000000.0,"Security Guard","BSNL","Morning Shift",true);
		o3.show();
		System.out.println("------------------------------------------------");

		Office o4 = new Office("FinCorp","Hyderabad","Finance","Raj Malhotra","Neha Reddy","Accounts","IT Park","India","9AM-5PM","support@fincorp.com",400,2008,6,45,true,7000000.0,"Biometric","ACT","Day Shift",false);
		o4.show();
		System.out.println("------------------------------------------------");

		Office o5 = new Office("DesignHub","Chennai","Creative","Arjun Das","Meera Iyer","Design","Studio","India","11AM-8PM","hello@designhub.com",150,2018,2,20,false,1500000.0,"CCTV","Airtel","Evening Shift",true);
		o5.show();
		System.out.println("------------------------------------------------");

		Office o6 = new Office("AgroTech","Pune","Agriculture","Vikram Patil","Kiran Joshi","Research","Industrial","India","9AM-6PM","info@agrotech.com",220,2012,3,18,false,1800000.0,"Security Guard","Jio","Day Shift",false);
		o6.show();
		System.out.println("------------------------------------------------");

		Office o7 = new Office("MediaWorks","Kolkata","Media","Sanjay Roy","Pooja Sen","Production","Corporate","India","10AM-6PM","contact@mediaworks.com",350,2007,5,40,true,4200000.0,"Biometric","Vodafone","Day Shift",true);
		o7.show();
		System.out.println("------------------------------------------------");

		Office o8 = new Office("AutoDrive","Ahmedabad","Automobile","Manish Patel","Ritika Shah","Manufacturing","Factory","India","8AM-5PM","support@autodrive.com",600,2000,4,60,true,9000000.0,"CCTV","BSNL","Morning Shift",false);
		o8.show();
		System.out.println("------------------------------------------------");

		Office o9 = new Office("GreenEnergy","Jaipur","Energy","Harish Sharma","Divya Jain","Operations","Industrial","India","9AM-6PM","info@greenenergy.com",275,2016,3,22,false,2500000.0,"Security Guard","Airtel","Day Shift",false);
		o9.show();
		System.out.println("------------------------------------------------");

		Office o10 = new Office("NextGen Solutions","Noida","IT","Karthik Nair","Simran Kaur","Testing","Corporate","India","9AM-6PM","admin@nextgen.com",480,2011,5,48,true,5200000.0,"Biometric","ACT","Day Shift",false);
		o10.show();
		System.out.println("------------------------------------------------");
	}
}