class GarlicRunner
{
	public static void main(String... value)
	{
		Garlic garlic1 = new Garlic("White Garlic","India","White","Large","A",100,12,90,true,250.0,"Ramesh","AgroSuppliers",2024,"Net Bag",true,false,"Cold Storage","FarmFresh","Round",true);
		garlic1.show();
		System.out.println("------------------------------------------------");

		Garlic garlic2 = new Garlic("Red Garlic","China","Red","Medium","B",80,10,60,false,180.0,"Li Wei","Global Traders",2023,"Box",false,false,"Dry Storage","SpiceWorld","Oval",true);
		garlic2.show();
		System.out.println("------------------------------------------------");

		Garlic garlic3 = new Garlic("Organic Garlic","USA","White","Small","Premium",60,8,75,true,300.0,"John","OrganicFarm",2024,"Packet",true,true,"Refrigerated","NatureBest","Round",true);
		garlic3.show();
		System.out.println("------------------------------------------------");

		Garlic garlic4 = new Garlic("Elephant Garlic","Spain","Cream","Extra Large","A",40,6,120,false,450.0,"Carlos","EuroAgro",2022,"Crate",true,false,"Cold Storage","EuroFresh","Round",true);
		garlic4.show();
		System.out.println("------------------------------------------------");

		Garlic garlic5 = new Garlic("Purple Garlic","Mexico","Purple","Medium","A",70,11,85,true,320.0,"Miguel","LatinSuppliers",2024,"Bag",true,false,"Dry Storage","SpiceMax","Oval",true);
		garlic5.show();
		System.out.println("------------------------------------------------");

		Garlic garlic6 = new Garlic("Black Garlic","Korea","Black","Small","Premium",50,5,150,true,600.0,"Kim","AsiaTrade",2023,"Box",true,true,"Refrigerated","HealthPlus","Round",true);
		garlic6.show();
		System.out.println("------------------------------------------------");

		Garlic garlic7 = new Garlic("Desi Garlic","India","White","Medium","B",90,9,70,false,200.0,"Mahesh","LocalMart",2024,"Net Bag",false,false,"Dry Storage","DailyFresh","Round",true);
		garlic7.show();
		System.out.println("------------------------------------------------");

		Garlic garlic8 = new Garlic("Hybrid Garlic","Netherlands","White","Large","A",65,13,95,true,380.0,"Hans","EuroFarm",2023,"Crate",true,false,"Cold Storage","AgroPrime","Oval",true);
		garlic8.show();
		System.out.println("------------------------------------------------");

		Garlic garlic9 = new Garlic("Mountain Garlic","Nepal","White","Small","A",55,7,80,true,275.0,"Suman","HimalayaSuppliers",2024,"Packet",true,false,"Cool Storage","HimalayaFresh","Round",true);
		garlic9.show();
		System.out.println("------------------------------------------------");

		Garlic garlic10 = new Garlic("Wild Garlic","France","Green","Medium","Premium",45,6,65,false,410.0,"Pierre","EuroMarket",2023,"Box",true,true,"Refrigerated","FrenchHarvest","Oval",true);
		garlic10.show();
		System.out.println("------------------------------------------------");
	}
}