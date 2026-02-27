class MapRunner
{
	public static void main(String... value)
	{
		Map map1 = new Map("Political","World","1:5000000","English","Oxford",120,80,2024,true,500.0,"John Smith","Offset",5,"Paper",true,true,"Education","Mercator","Rectangle",true);
		map1.show();
		System.out.println("------------------------------------------------");

		Map map2 = new Map("Physical","India","1:2500000","Hindi","NCERT",100,70,2023,false,350.0,"Raj Kumar","Digital",3,"Paper",false,true,"Geography","Lambert","Rectangle",true);
		map2.show();
		System.out.println("------------------------------------------------");

		Map map3 = new Map("Road","USA","1:1000000","English","RandMcNally",110,75,2022,true,600.0,"Emily Clark","Laser",4,"Laminated Sheet",true,true,"Travel","Mercator","Rectangle",true);
		map3.show();
		System.out.println("------------------------------------------------");

		Map map4 = new Map("Tourist","Europe","1:2000000","French","EuroMaps",90,60,2024,true,450.0,"Pierre Louis","Digital",2,"Glossy Paper",true,true,"Tourism","Robinson","Rectangle",true);
		map4.show();
		System.out.println("------------------------------------------------");

		Map map5 = new Map("Topographic","Nepal","1:500000","Nepali","HimalayaPub",85,55,2023,false,700.0,"Suman Rai","Offset",6,"Matte Paper",false,false,"Mountains","UTM","Rectangle",true);
		map5.show();
		System.out.println("------------------------------------------------");

		Map map6 = new Map("Historical","Rome","1:1500000","Italian","HistoryHouse",95,65,2021,true,550.0,"Marco Polo","Digital",1,"Vintage Paper",true,false,"History","Robinson","Rectangle",true);
		map6.show();
		System.out.println("------------------------------------------------");

		Map map7 = new Map("Climate","Asia","1:3000000","English","GeoWorld",130,85,2024,true,650.0,"Lisa Wong","Laser",3,"Waterproof Sheet",true,true,"Climate","Mercator","Rectangle",true);
		map7.show();
		System.out.println("------------------------------------------------");

		Map map8 = new Map("Satellite","Africa","1:4000000","English","SpaceMaps",115,78,2023,false,800.0,"David Lee","Digital",7,"Glossy Sheet",true,false,"Satellite","Robinson","Rectangle",true);
		map8.show();
		System.out.println("------------------------------------------------");

		Map map9 = new Map("Railway","Japan","1:800000","Japanese","TokyoMaps",88,58,2024,true,480.0,"Kenji Tanaka","Offset",2,"Paper",false,true,"Transport","Mercator","Rectangle",true);
		map9.show();
		System.out.println("------------------------------------------------");

		Map map10 = new Map("City","London","1:500000","English","CityPub",92,62,2024,true,520.0,"Oliver Stone","Digital",8,"Laminated Paper",true,true,"Urban","Lambert","Rectangle",true);
		map10.show();
		System.out.println("------------------------------------------------");
	}
}