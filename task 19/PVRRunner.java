class PVRRunner
{
	public static void main(String... value)
	{
		PVR pvr1 = new PVR("PVR Orion","Rajajinagar","IMAX","Toxic","10:00 AM","Gold","Popcorn+Pepsi","Ramesh","Bangalore","Karnataka",8,1200,200,350,true,250000.0,"Dolby Atmos","BookMyShow","Kannada",false);
		pvr1.show();
		System.out.println("------------------------------------------------");

		PVR pvr2 = new PVR("PVR Phoenix","Whitefield","4DX","Toxic","1:00 PM","Recliner","Nachos+Cola","Suresh","Bangalore","Karnataka",10,1500,0,450,true,400000.0,"Dolby Atmos","Paytm","Hindi",true);
		pvr2.show();
		System.out.println("------------------------------------------------");

		PVR pvr3 = new PVR("PVR Forum","Koramangala","2D","Toxic","4:00 PM","Silver","Burger+Pepsi","Anil","Bangalore","Karnataka",6,900,150,250,false,150000.0,"Dolby 7.1","BookMyShow","Telugu",false);
		pvr3.show();
		System.out.println("------------------------------------------------");

		PVR pvr4 = new PVR("PVR Lulu","Kochi","IMAX","Toxic","6:00 PM","Gold","Pizza+Cola","Manoj","Kochi","Kerala",12,1800,50,400,true,500000.0,"Dolby Atmos","PhonePe","Malayalam",false);
		pvr4.show();
		System.out.println("------------------------------------------------");

		PVR pvr5 = new PVR("PVR Express","Chennai","2D","Toxic","9:00 PM","Normal","Popcorn","Arvind","Chennai","Tamil Nadu",5,800,0,200,false,120000.0,"Dolby 5.1","BookMyShow","Tamil",true);
		pvr5.show();
		System.out.println("------------------------------------------------");

		PVR pvr6 = new PVR("PVR Central","Hyderabad","4DX","Toxic","11:00 AM","Recliner","Combo Meal","Ravi","Hyderabad","Telangana",9,1400,100,420,true,370000.0,"Dolby Atmos","Paytm","Telugu",false);
		pvr6.show();
		System.out.println("------------------------------------------------");

		PVR pvr7 = new PVR("PVR Mall","Mumbai","IMAX","Toxic","2:00 PM","Gold","Popcorn+Coffee","Kiran","Mumbai","Maharashtra",15,2200,300,500,true,600000.0,"Dolby Atmos","BookMyShow","Hindi",false);
		pvr7.show();
		System.out.println("------------------------------------------------");

		PVR pvr8 = new PVR("PVR City","Delhi","2D","Toxic","5:00 PM","Silver","Nachos","Amit","Delhi","Delhi",7,1000,0,280,false,210000.0,"Dolby 7.1","Paytm","Hindi",true);
		pvr8.show();
		System.out.println("------------------------------------------------");

		PVR pvr9 = new PVR("PVR Square","Pune","IMAX","Toxic","7:30 PM","Recliner","Pizza+Pepsi","Vikas","Pune","Maharashtra",11,1600,80,380,true,450000.0,"Dolby Atmos","PhonePe","Marathi",false);
		pvr9.show();
		System.out.println("------------------------------------------------");

		PVR pvr10 = new PVR("PVR Grand","Ahmedabad","4DX","Toxic","10:30 PM","Gold","Premium Combo","Harsh","Ahmedabad","Gujarat",8,1300,0,420,true,390000.0,"Dolby Atmos","BookMyShow","Hindi",true);
		pvr10.show();
		System.out.println("------------------------------------------------");
	}
}