class ProductStoreRunner
{
	public static void main(String[] args)
	{
		Product[] products=new Product[137];
		ProductStore productstore=new ProductStore(products);
		
		Product product0=new Product("realme 10 pro","realme","24th nov 2022",18999.99,Type.SMARTPHONE,"realme official website",WarrantyYears.ONE,true,2022001,"china");
		productstore.save(product0);
		
		Product product1=new Product("realme 11","realme","1 Jan 2023",15000,Type.FLIP,"seller1",WarrantyYears.ONE,false,2022002,"India");
		
		Product product2=new Product("iphone 12","apple","2 Jan 2023",50000,Type.SMARTPHONE,"seller2",WarrantyYears.TWO,true,2022003,"USA");
		
		Product product3=new Product("nokia 3310","nokia","3 Jan 2023",3000,Type.QWERTY,"seller3",WarrantyYears.FIVE,false,2022004,"Finland");
		
		Product product4=new Product("samsung m31","samsung","4 Jan 2023",18000,Type.SMARTPHONE,"seller4",WarrantyYears.THREE,true,2022005,"Korea");
		
		Product product5=new Product("oppo a5","oppo","5 Jan 2023",12000,Type.SENSOR,"seller5",WarrantyYears.ONE,false,2022006,"China");
		
		Product product6=new Product("vivo y20","vivo","6 Jan 2023",13000,Type.SENSOR,"seller6",WarrantyYears.TWO,true,2022007,"China");
		
		Product product7=new Product("oneplus nord","oneplus","7 Jan 2023",28000,Type.SMARTPHONE,"seller7",WarrantyYears.THREE,false,2022008,"India");
		
		Product product8=new Product("motorola g40","motorola","8 Jan 2023",14000,Type.SMARTPHONE,"seller8",WarrantyYears.FIVE,true,2022009,"USA");
		
		Product product9=new Product("lava z1","lava","9 Jan 2023",7000,Type.FLIP,"seller9",WarrantyYears.ONE,false,2022010,"India");
		
		Product product10=new Product("micromax in","micromax","10 Jan 2023",9000,Type.SENSOR,"seller10",WarrantyYears.TWO,true,2022011,"India");
		
		Product product11=new Product("iphone 13","apple","11 Jan 2023",65000,Type.SMARTPHONE,"seller11",WarrantyYears.ONE,false,2022012,"USA");
		
		Product product12=new Product("iphone 14","apple","12 Jan 2023",75000,Type.SMARTPHONE,"seller12",WarrantyYears.ONE,true,2022013,"USA");
		
		Product product13=new Product("samsung s21","samsung","13 Jan 2023",55000,Type.SMARTPHONE,"seller13",WarrantyYears.TWO,false,2022014,"Korea");
		
		Product product14=new Product("samsung s22","samsung","14 Jan 2023",70000,Type.SMARTPHONE,"seller14",WarrantyYears.TWO,true,2022015,"Korea");
		
		Product product15=new Product("oneplus 9","oneplus","15 Jan 2023",45000,Type.SMARTPHONE,"seller15",WarrantyYears.ONE,false,2022016,"India");
		
		Product product16=new Product("oneplus 10 pro","oneplus","16 Jan 2023",65000,Type.SMARTPHONE,"seller16",WarrantyYears.ONE,true,2022017,"India");
		
		Product product17=new Product("realme narzo 50","realme","17 Jan 2023",14000,Type.SMARTPHONE,"seller17",WarrantyYears.ONE,false,2022018,"China");
		
		Product product18=new Product("realme gt","realme","18 Jan 2023",30000,Type.SMARTPHONE,"seller18",WarrantyYears.ONE,true,2022019,"China");
		
		Product product19=new Product("redmi note 10","xiaomi","19 Jan 2023",13000,Type.SMARTPHONE,"seller19",WarrantyYears.ONE,false,2022020,"China");
		
		Product product20=new Product("redmi note 11","xiaomi","20 Jan 2023",15000,Type.SMARTPHONE,"seller20",WarrantyYears.ONE,true,2022021,"China");

		Product product21=new Product("poco x3","poco","21 Jan 2023",16000,Type.SMARTPHONE,"seller21",WarrantyYears.ONE,false,2022022,"China");
		
		Product product22=new Product("poco f1","poco","22 Jan 2023",20000,Type.SMARTPHONE,"seller22",WarrantyYears.TWO,true,2022023,"China");
		
		Product product23=new Product("nokia g20","nokia","23 Jan 2023",12000,Type.SMARTPHONE,"seller23",WarrantyYears.THREE,false,2022024,"Finland");
		
		Product product24=new Product("nokia xr20","nokia","24 Jan 2023",45000,Type.SMARTPHONE,"seller24",WarrantyYears.FIVE,true,2022025,"Finland");
		
		Product product25=new Product("motorola edge 20","motorola","25 Jan 2023",30000,Type.SMARTPHONE,"seller25",WarrantyYears.ONE,false,2022026,"USA");
		
		Product product26=new Product("motorola g60","motorola","26 Jan 2023",18000,Type.SMARTPHONE,"seller26",WarrantyYears.ONE,true,2022027,"USA");
		
		Product product27=new Product("vivo v20","vivo","27 Jan 2023",24000,Type.SMARTPHONE,"seller27",WarrantyYears.ONE,false,2022028,"China");
		
		Product product28=new Product("vivo v25","vivo","28 Jan 2023",30000,Type.SMARTPHONE,"seller28",WarrantyYears.ONE,true,2022029,"China");
		
		Product product29=new Product("oppo reno 6","oppo","29 Jan 2023",28000,Type.SMARTPHONE,"seller29",WarrantyYears.ONE,false,2022030,"China");
		
		Product product30=new Product("oppo reno 8","oppo","30 Jan 2023",35000,Type.SMARTPHONE,"seller30",WarrantyYears.ONE,true,2022031,"China");

		Product product31=new Product("asus rog phone 5","asus","1 Feb 2023",50000,Type.SMARTPHONE,"seller31",WarrantyYears.TWO,false,2022032,"Taiwan");
		
		Product product32=new Product("asus zenfone 8","asus","2 Feb 2023",42000,Type.SMARTPHONE,"seller32",WarrantyYears.TWO,true,2022033,"Taiwan");
		
		Product product33=new Product("google pixel 6","google","3 Feb 2023",60000,Type.SMARTPHONE,"seller33",WarrantyYears.ONE,false,2022034,"USA");
		
		Product product34=new Product("google pixel 7","google","4 Feb 2023",70000,Type.SMARTPHONE,"seller34",WarrantyYears.ONE,true,2022035,"USA");
		
		Product product35=new Product("sony xperia 5","sony","5 Feb 2023",65000,Type.SMARTPHONE,"seller35",WarrantyYears.TWO,false,2022036,"Japan");
		
		Product product36=new Product("sony xperia 1","sony","6 Feb 2023",90000,Type.SMARTPHONE,"seller36",WarrantyYears.TWO,true,2022037,"Japan");
		
		Product product37=new Product("lava agni","lava","7 Feb 2023",20000,Type.SMARTPHONE,"seller37",WarrantyYears.ONE,false,2022038,"India");
		
		Product product38=new Product("micromax note 1","micromax","8 Feb 2023",11000,Type.SMARTPHONE,"seller38",WarrantyYears.ONE,true,2022039,"India");
		
		Product product39=new Product("blackberry key2","blackberry","9 Feb 2023",40000,Type.QWERTY,"seller39",WarrantyYears.THREE,false,2022040,"Canada");
		
		Product product40=new Product("samsung guru","samsung","10 Feb 2023",2500,Type.FLIP,"seller40",WarrantyYears.FIVE,true,2022041,"Korea");
		
		Product product41=new Product("iphone 11","apple","11 Feb 2023",45000,Type.SMARTPHONE,"seller41",WarrantyYears.ONE,false,2022042,"USA");
		
		Product product42=new Product("iphone se","apple","12 Feb 2023",30000,Type.SMARTPHONE,"seller42",WarrantyYears.ONE,true,2022043,"USA");
		
		Product product43=new Product("samsung a50","samsung","13 Feb 2023",20000,Type.SMARTPHONE,"seller43",WarrantyYears.TWO,false,2022044,"Korea");
		
		Product product44=new Product("samsung a73","samsung","14 Feb 2023",42000,Type.SMARTPHONE,"seller44",WarrantyYears.TWO,true,2022045,"Korea");
		
		Product product45=new Product("oneplus nord ce","oneplus","15 Feb 2023",25000,Type.SMARTPHONE,"seller45",WarrantyYears.ONE,false,2022046,"India");
		
		Product product46=new Product("oneplus nord 2","oneplus","16 Feb 2023",32000,Type.SMARTPHONE,"seller46",WarrantyYears.ONE,true,2022047,"India");
		
		Product product47=new Product("realme 9 pro","realme","17 Feb 2023",18000,Type.SMARTPHONE,"seller47",WarrantyYears.ONE,false,2022048,"China");
		
		Product product48=new Product("realme c35","realme","18 Feb 2023",12000,Type.SMARTPHONE,"seller48",WarrantyYears.ONE,true,2022049,"China");
		
		Product product49=new Product("redmi 9","xiaomi","19 Feb 2023",10000,Type.SMARTPHONE,"seller49",WarrantyYears.ONE,false,2022050,"China");
		
		Product product50=new Product("redmi 12","xiaomi","20 Feb 2023",15000,Type.SMARTPHONE,"seller50",WarrantyYears.ONE,true,2022051,"China");

		Product product51=new Product("poco m3","poco","21 Feb 2023",11000,Type.SMARTPHONE,"seller51",WarrantyYears.ONE,false,2022052,"China");
		
		Product product52=new Product("poco x5","poco","22 Feb 2023",20000,Type.SMARTPHONE,"seller52",WarrantyYears.TWO,true,2022053,"China");
		
		Product product53=new Product("nokia c20","nokia","23 Feb 2023",8000,Type.SMARTPHONE,"seller53",WarrantyYears.THREE,false,2022054,"Finland");
		
		Product product54=new Product("nokia 105","nokia","24 Feb 2023",1500,Type.FLIP,"seller54",WarrantyYears.FIVE,true,2022055,"Finland");
		
		Product product55=new Product("motorola g13","motorola","25 Feb 2023",14000,Type.SMARTPHONE,"seller55",WarrantyYears.ONE,false,2022056,"USA");
		
		Product product56=new Product("motorola edge 30","motorola","26 Feb 2023",35000,Type.SMARTPHONE,"seller56",WarrantyYears.ONE,true,2022057,"USA");
		
		Product product57=new Product("vivo y16","vivo","27 Feb 2023",13000,Type.SMARTPHONE,"seller57",WarrantyYears.ONE,false,2022058,"China");
		
		Product product58=new Product("vivo x80","vivo","28 Feb 2023",55000,Type.SMARTPHONE,"seller58",WarrantyYears.ONE,true,2022059,"China");
		
		Product product59=new Product("oppo a78","oppo","1 Mar 2023",17000,Type.SMARTPHONE,"seller59",WarrantyYears.ONE,false,2022060,"China");
		
		Product product60=new Product("oppo find x5","oppo","2 Mar 2023",65000,Type.SMARTPHONE,"seller60",WarrantyYears.ONE,true,2022061,"China");

		Product product61=new Product("asus rog 6","asus","3 Mar 2023",60000,Type.SMARTPHONE,"seller61",WarrantyYears.TWO,false,2022062,"Taiwan");
		
		Product product62=new Product("asus zenfone 9","asus","4 Mar 2023",50000,Type.SMARTPHONE,"seller62",WarrantyYears.TWO,true,2022063,"Taiwan");
		
		Product product63=new Product("google pixel 5","google","5 Mar 2023",50000,Type.SMARTPHONE,"seller63",WarrantyYears.ONE,false,2022064,"USA");
		
		Product product64=new Product("google pixel 8","google","6 Mar 2023",80000,Type.SMARTPHONE,"seller64",WarrantyYears.ONE,true,2022065,"USA");
		
		Product product65=new Product("sony xperia 10","sony","7 Mar 2023",40000,Type.SMARTPHONE,"seller65",WarrantyYears.TWO,false,2022066,"Japan");
		
		Product product66=new Product("sony xperia pro","sony","8 Mar 2023",120000,Type.SMARTPHONE,"seller66",WarrantyYears.TWO,true,2022067,"Japan");
		
		Product product67=new Product("lava blaze","lava","9 Mar 2023",10000,Type.SMARTPHONE,"seller67",WarrantyYears.ONE,false,2022068,"India");
		
		Product product68=new Product("micromax in 2c","micromax","10 Mar 2023",9000,Type.SMARTPHONE,"seller68",WarrantyYears.ONE,true,2022069,"India");
		
		Product product69=new Product("blackberry bold","blackberry","11 Mar 2023",35000,Type.QWERTY,"seller69",WarrantyYears.THREE,false,2022070,"Canada");
		
		Product product70=new Product("samsung metro","samsung","12 Mar 2023",2500,Type.FLIP,"seller70",WarrantyYears.FIVE,true,2022071,"Korea");
		
		Product product71=new Product("iphone xr","apple","13 Mar 2023",35000,Type.SMARTPHONE,"seller71",WarrantyYears.ONE,false,2022072,"USA");
		
		Product product72=new Product("iphone 15","apple","14 Mar 2023",90000,Type.SMARTPHONE,"seller72",WarrantyYears.ONE,true,2022073,"USA");
		
		Product product73=new Product("samsung s20 fe","samsung","15 Mar 2023",40000,Type.SMARTPHONE,"seller73",WarrantyYears.TWO,false,2022074,"Korea");
		
		Product product74=new Product("samsung m13","samsung","16 Mar 2023",14000,Type.SMARTPHONE,"seller74",WarrantyYears.TWO,true,2022075,"Korea");
		
		Product product75=new Product("oneplus 8","oneplus","17 Mar 2023",35000,Type.SMARTPHONE,"seller75",WarrantyYears.ONE,false,2022076,"India");
		
		Product product76=new Product("oneplus 11","oneplus","18 Mar 2023",65000,Type.SMARTPHONE,"seller76",WarrantyYears.ONE,true,2022077,"India");
		
		Product product77=new Product("realme c55","realme","19 Mar 2023",11000,Type.SMARTPHONE,"seller77",WarrantyYears.ONE,false,2022078,"China");
		
		Product product78=new Product("realme gt neo","realme","20 Mar 2023",30000,Type.SMARTPHONE,"seller78",WarrantyYears.ONE,true,2022079,"China");
		
		Product product79=new Product("redmi note 12","xiaomi","21 Mar 2023",17000,Type.SMARTPHONE,"seller79",WarrantyYears.ONE,false,2022080,"China");
		
		Product product80=new Product("redmi k50","xiaomi","22 Mar 2023",30000,Type.SMARTPHONE,"seller80",WarrantyYears.ONE,true,2022081,"China");

		Product product81=new Product("poco f4","poco","23 Mar 2023",28000,Type.SMARTPHONE,"seller81",WarrantyYears.ONE,false,2022082,"China");
		
		Product product82=new Product("poco c31","poco","24 Mar 2023",9000,Type.SMARTPHONE,"seller82",WarrantyYears.TWO,true,2022083,"China");
		
		Product product83=new Product("nokia g11","nokia","25 Mar 2023",12000,Type.SMARTPHONE,"seller83",WarrantyYears.THREE,false,2022084,"Finland");
		
		Product product84=new Product("nokia 8210","nokia","26 Mar 2023",4000,Type.FLIP,"seller84",WarrantyYears.FIVE,true,2022085,"Finland");
		
		Product product85=new Product("motorola g73","motorola","27 Mar 2023",18000,Type.SMARTPHONE,"seller85",WarrantyYears.ONE,false,2022086,"USA");
		
		Product product86=new Product("motorola edge 40","motorola","28 Mar 2023",40000,Type.SMARTPHONE,"seller86",WarrantyYears.ONE,true,2022087,"USA");
		
		Product product87=new Product("vivo y100","vivo","29 Mar 2023",20000,Type.SMARTPHONE,"seller87",WarrantyYears.ONE,false,2022088,"China");
		
		Product product88=new Product("vivo x90","vivo","30 Mar 2023",65000,Type.SMARTPHONE,"seller88",WarrantyYears.ONE,true,2022089,"China");
		
		Product product89=new Product("oppo f21 pro","oppo","31 Mar 2023",25000,Type.SMARTPHONE,"seller89",WarrantyYears.ONE,false,2022090,"China");
		
		Product product90=new Product("oppo find n2","oppo","1 Apr 2023",90000,Type.SMARTPHONE,"seller90",WarrantyYears.ONE,true,2022091,"China");

		Product product91=new Product("asus rog 7","asus","2 Apr 2023",70000,Type.SMARTPHONE,"seller91",WarrantyYears.TWO,false,2022092,"Taiwan");
		
		Product product92=new Product("asus zenfone 10","asus","3 Apr 2023",55000,Type.SMARTPHONE,"seller92",WarrantyYears.TWO,true,2022093,"Taiwan");
		
		Product product93=new Product("google pixel 4a","google","4 Apr 2023",30000,Type.SMARTPHONE,"seller93",WarrantyYears.ONE,false,2022094,"USA");
		
		Product product94=new Product("google pixel fold","google","5 Apr 2023",120000,Type.SMARTPHONE,"seller94",WarrantyYears.ONE,true,2022095,"USA");
		
		Product product95=new Product("sony xperia 5 ii","sony","6 Apr 2023",70000,Type.SMARTPHONE,"seller95",WarrantyYears.TWO,false,2022096,"Japan");
		
		Product product96=new Product("sony xperia 1 v","sony","7 Apr 2023",130000,Type.SMARTPHONE,"seller96",WarrantyYears.TWO,true,2022097,"Japan");
		
		Product product97=new Product("lava storm","lava","8 Apr 2023",12000,Type.SMARTPHONE,"seller97",WarrantyYears.ONE,false,2022098,"India");
		
		Product product98=new Product("micromax in note 2","micromax","9 Apr 2023",15000,Type.SMARTPHONE,"seller98",WarrantyYears.ONE,true,2022099,"India");
		
		Product product99=new Product("blackberry classic","blackberry","10 Apr 2023",30000,Type.QWERTY,"seller99",WarrantyYears.THREE,false,2022100,"Canada");
		
		Product product100=new Product("samsung guru music","samsung","11 Apr 2023",3000,Type.FLIP,"seller100",WarrantyYears.FIVE,true,2022101,"Korea");

		Product product101=new Product("iphone xs","apple","12 Apr 2023",40000,Type.SMARTPHONE,"seller101",WarrantyYears.ONE,false,2022102,"USA");
		
		Product product102=new Product("iphone 15 pro","apple","13 Apr 2023",130000,Type.SMARTPHONE,"seller102",WarrantyYears.ONE,true,2022103,"USA");
		
		Product product103=new Product("samsung z flip","samsung","14 Apr 2023",80000,Type.FLIP,"seller103",WarrantyYears.TWO,false,2022104,"Korea");
		
		Product product104=new Product("samsung z fold","samsung","15 Apr 2023",150000,Type.SMARTPHONE,"seller104",WarrantyYears.TWO,true,2022105,"Korea");
		
		Product product105=new Product("oneplus nord 3","oneplus","16 Apr 2023",35000,Type.SMARTPHONE,"seller105",WarrantyYears.ONE,false,2022106,"India");
		
		Product product106=new Product("oneplus ace","oneplus","17 Apr 2023",30000,Type.SMARTPHONE,"seller106",WarrantyYears.ONE,true,2022107,"India");
		
		Product product107=new Product("realme 11 pro plus","realme","18 Apr 2023",28000,Type.SMARTPHONE,"seller107",WarrantyYears.ONE,false,2022108,"China");
		
		Product product108=new Product("realme c30","realme","19 Apr 2023",8000,Type.SMARTPHONE,"seller108",WarrantyYears.ONE,true,2022109,"China");
		
		Product product109=new Product("redmi a1","xiaomi","20 Apr 2023",7000,Type.SMARTPHONE,"seller109",WarrantyYears.ONE,false,2022110,"China");
		
		Product product110=new Product("redmi note 13","xiaomi","21 Apr 2023",18000,Type.SMARTPHONE,"seller110",WarrantyYears.ONE,true,2022111,"China");

		Product product111=new Product("poco f5","poco","22 Apr 2023",30000,Type.SMARTPHONE,"seller111",WarrantyYears.ONE,false,2022112,"China");
		
		Product product112=new Product("poco x6","poco","23 Apr 2023",20000,Type.SMARTPHONE,"seller112",WarrantyYears.TWO,true,2022113,"China");
		
		Product product113=new Product("nokia g42","nokia","24 Apr 2023",15000,Type.SMARTPHONE,"seller113",WarrantyYears.THREE,false,2022114,"Finland");
		
		Product product114=new Product("nokia 2660","nokia","25 Apr 2023",5000,Type.FLIP,"seller114",WarrantyYears.FIVE,true,2022115,"Finland");
		
		Product product115=new Product("motorola g84","motorola","26 Apr 2023",20000,Type.SMARTPHONE,"seller115",WarrantyYears.ONE,false,2022116,"USA");
		
		Product product116=new Product("motorola edge 50","motorola","27 Apr 2023",45000,Type.SMARTPHONE,"seller116",WarrantyYears.ONE,true,2022117,"USA");
		
		Product product117=new Product("vivo v27","vivo","28 Apr 2023",32000,Type.SMARTPHONE,"seller117",WarrantyYears.ONE,false,2022118,"China");
		
		Product product118=new Product("vivo x100","vivo","29 Apr 2023",70000,Type.SMARTPHONE,"seller118",WarrantyYears.ONE,true,2022119,"China");
		
		Product product119=new Product("oppo reno 10","oppo","30 Apr 2023",35000,Type.SMARTPHONE,"seller119",WarrantyYears.ONE,false,2022120,"China");
		
		Product product120=new Product("oppo find x6","oppo","1 May 2023",70000,Type.SMARTPHONE,"seller120",WarrantyYears.ONE,true,2022121,"China");

		Product product121=new Product("asus rog 8","asus","2 May 2023",80000,Type.SMARTPHONE,"seller121",WarrantyYears.TWO,false,2022122,"Taiwan");
		
		Product product122=new Product("asus zenfone 11","asus","3 May 2023",60000,Type.SMARTPHONE,"seller122",WarrantyYears.TWO,true,2022123,"Taiwan");
		
		Product product123=new Product("google pixel 9","google","4 May 2023",90000,Type.SMARTPHONE,"seller123",WarrantyYears.ONE,false,2022124,"USA");
		
		Product product124=new Product("google pixel 9 pro","google","5 May 2023",110000,Type.SMARTPHONE,"seller124",WarrantyYears.ONE,true,2022125,"USA");
		
		Product product125=new Product("sony xperia 1 vi","sony","6 May 2023",140000,Type.SMARTPHONE,"seller125",WarrantyYears.TWO,false,2022126,"Japan");
		
		Product product126=new Product("sony xperia 10 vi","sony","7 May 2023",50000,Type.SMARTPHONE,"seller126",WarrantyYears.TWO,true,2022127,"Japan");
		
		Product product127=new Product("lava blaze pro","lava","8 May 2023",15000,Type.SMARTPHONE,"seller127",WarrantyYears.ONE,false,2022128,"India");
		
		Product product128=new Product("micromax in 3","micromax","9 May 2023",12000,Type.SMARTPHONE,"seller128",WarrantyYears.ONE,true,2022129,"India");
		
		Product product129=new Product("blackberry priv","blackberry","10 May 2023",35000,Type.QWERTY,"seller129",WarrantyYears.THREE,false,2022130,"Canada");
		
		Product product130=new Product("samsung guru plus","samsung","11 May 2023",3000,Type.FLIP,"seller130",WarrantyYears.FIVE,true,2022131,"Korea");

		Product product131=new Product("iphone 16","apple","12 May 2023",100000,Type.SMARTPHONE,"seller131",WarrantyYears.ONE,false,2022132,"USA");
		
		Product product132=new Product("samsung s24","samsung","13 May 2023",95000,Type.SMARTPHONE,"seller132",WarrantyYears.TWO,true,2022133,"Korea");
		
		Product product133=new Product("oneplus 12","oneplus","14 May 2023",70000,Type.SMARTPHONE,"seller133",WarrantyYears.ONE,false,2022134,"India");
		
		Product product134=new Product("realme gt 6","realme","15 May 2023",32000,Type.SMARTPHONE,"seller134",WarrantyYears.ONE,true,2022135,"China");
		
		Product product135=new Product("redmi note 14","xiaomi","16 May 2023",20000,Type.SMARTPHONE,"seller135",WarrantyYears.ONE,false,2022136,"China");
		
		Product product136=new Product("poco f6","poco","17 May 2023",35000,Type.SMARTPHONE,"seller136",WarrantyYears.TWO,true,2022137,"China");
		
		//--------------------------------------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>
		
		Product[] products1={product0,product1,product2,product3,product4,product5,product6,product7,product8,product9};
		productstore.save(products1);

		Product[] products2={product10,product11,product12,product13,product14,product15,product16,product17,product18,product19};
		productstore.save(products2);

		Product[] products3={product20,product21,product22,product23,product24,product25,product26,product27,product28,product29};
		productstore.save(products3);

		Product[] products4={product30,product31,product32,product33,product34,product35,product36,product37,product38,product39};
		productstore.save(products4);

		Product[] products5={product40,product41,product42,product43,product44,product45,product46,product47,product48,product49};
		productstore.save(products5);

		Product[] products6={product50,product51,product52,product53,product54,product55,product56,product57,product58,product59};
		productstore.save(products6);

		Product[] products7={product60,product61,product62,product63,product64,product65,product66,product67,product68,product69};
		productstore.save(products7);

		Product[] products8={product70,product71,product72,product73,product74,product75,product76,product77,product78,product79};
		productstore.save(products8);

		Product[] products9={product80,product81,product82,product83,product84,product85,product86,product87,product88,product89};
		productstore.save(products9);

		Product[] products10={product90,product91,product92,product93,product94,product95,product96,product97,product98,product99};
		productstore.save(products10);

		Product[] products11={product100,product101,product102,product103,product104,product105,product106,product107,product108,product109};
		productstore.save(products11);

		Product[] products12={product110,product111,product112,product113,product114,product115,product116,product117,product118,product119};
		productstore.save(products12);

		Product[] products13={product120,product121,product122,product123,product124,product125,product126,product127,product128,product129};
		productstore.save(products13);

		Product[] products14={product130,product131,product132,product133,product134,product135,product136};
		productstore.save(products14);
		
		//------------------------------------------------------------------------------
		productstore.searchByUniqeId(2022137);
		
		productstore.searchByUniqeIdAndName(2022135,"realme gt 6");
		
		productstore.searchByUniqeIdAndNameAndOriginCountry(2022001,"realme 10 pro","china");
		
		productstore.getAllOriginCountry();
		
		productstore.checkWarrantyExpiredByUniqueId(2022135);
		
		productstore.displayAllProducts();
		
		productstore.getAllByType(Type.FLIP);
		productstore.getAllByType(Type.SMARTPHONE);
	
		productstore.getAllByWarrantyYears(WarrantyYears.ONE);
		productstore.getAllByWarrantyYears(WarrantyYears.TWO);
	}
}