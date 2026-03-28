class getFarmerRunner
{
	public static void main(String... val)
	{
		Farmer[] farmer=new Farmer[10];
		getFarmer getfarmer=new getFarmer(farmer);
		
		Farmer farmer1=new Farmer("venkatesh","marginal",40,1.05,"rice",false);
		getfarmer.storeFarmer(farmer1);
		
		Farmer farmer2=new Farmer("Ramesh","small",35,2.80,"coffee",true);
		getfarmer.storeFarmer(farmer2);
		
		Farmer farmer3 = new Farmer("Suresh","medium",50,5.20,"wheat",true);
		getfarmer.storeFarmer(farmer3);

		Farmer farmer4 = new Farmer("Mahesh","large",60,10.50,"sugarcane",true);
		getfarmer.storeFarmer(farmer4);

		Farmer farmer5 = new Farmer("Kiran","small",32,2.10,"maize",false);
		getfarmer.storeFarmer(farmer5);

		Farmer farmer6 = new Farmer("Ravi","marginal",28,1.20,"pepper",false);
		getfarmer.storeFarmer(farmer6);

		Farmer farmer7 = new Farmer("Manjunath","medium",45,4.75,"cotton",true);
		getfarmer.storeFarmer(farmer7);

		Farmer farmer8 = new Farmer("Shankar","large",55,12.30,"tea",true);
		getfarmer.storeFarmer(farmer8);

		Farmer farmer9 = new Farmer("Prakash","small",38,2.50,"coconut",false);
		getfarmer.storeFarmer(farmer9);

		Farmer farmer10 = new Farmer("Anil","medium",42,3.90,"groundnut",true);
		getfarmer.storeFarmer(farmer10);
		
		Farmer farmer11 = new Farmer("ranganna","large",42,3.90,"sorghum",true);
		getfarmer.storeFarmer(farmer11);
		
	}
}