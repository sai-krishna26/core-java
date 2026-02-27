class StandRunner
{
	public static void main(String... value)
	{
		Stand stand1 = new Stand("Laptop Stand","Aluminum","Silver","HP","Office",30,25,10,true,1500.0,"HP Ltd","TechStore",2024,"Premium",true,true,"Rectangle","Modern","1 Year",true);
		stand1.show();
		System.out.println("------------------------------------------------");

		Stand stand2 = new Stand("TV Stand","Wood","Brown","IKEA","Home",120,80,50,false,8000.0,"IKEA","HomeMart",2023,"A Grade",false,false,"Rectangle","Classic","2 Years",true);
		stand2.show();
		System.out.println("------------------------------------------------");

		Stand stand3 = new Stand("Mobile Stand","Plastic","Black","Boat","Personal",15,10,2,true,300.0,"Boat","RetailHub",2024,"Standard",true,true,"Oval","Minimal","6 Months",true);
		stand3.show();
		System.out.println("------------------------------------------------");

		Stand stand4 = new Stand("Mic Stand","Steel","Black","Yamaha","Studio",150,40,15,true,4500.0,"Yamaha","MusicWorld",2023,"Professional",true,false,"Round","Industrial","1 Year",true);
		stand4.show();
		System.out.println("------------------------------------------------");

		Stand stand5 = new Stand("Plant Stand","Iron","White","UrbanDecor","Garden",90,30,20,false,2500.0,"UrbanDecor","GardenShop",2022,"Premium",false,false,"Circle","Vintage","1 Year",true);
		stand5.show();
		System.out.println("------------------------------------------------");

		Stand stand6 = new Stand("Book Stand","Wood","Cream","Classmate","Study",40,30,8,true,900.0,"ITC","BookHouse",2024,"Standard",true,true,"Rectangle","Simple","6 Months",true);
		stand6.show();
		System.out.println("------------------------------------------------");

		Stand stand7 = new Stand("Camera Stand","Carbon Fiber","Black","Canon","Photography",160,50,12,true,12000.0,"Canon","PhotoWorld",2024,"Professional",true,true,"Tripod","Modern","2 Years",true);
		stand7.show();
		System.out.println("------------------------------------------------");

		Stand stand8 = new Stand("Speaker Stand","Steel","Grey","Sony","Audio",110,35,25,false,6000.0,"Sony","ElectroMart",2023,"High Grade",false,false,"Rectangle","Modern","1 Year",true);
		stand8.show();
		System.out.println("------------------------------------------------");

		Stand stand9 = new Stand("Tablet Stand","Aluminum","Gold","Apple","Personal",20,15,5,true,3500.0,"Apple","iStore",2024,"Premium",true,true,"Rectangle","Elegant","1 Year",true);
		stand9.show();
		System.out.println("------------------------------------------------");

		Stand stand10 = new Stand("Display Stand","Plastic","Transparent","Generic","Shop",100,60,30,false,2000.0,"Generic","WholesaleMart",2023,"Standard",false,false,"Rectangle","Commercial","No Warranty",true);
		stand10.show();
		System.out.println("------------------------------------------------");
	}
}