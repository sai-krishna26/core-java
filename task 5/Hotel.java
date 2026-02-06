class Hotel{
	static void storeUtensils(){
		String[] utensils={"glass","plate","bowl","spoon","measurables"};
		
		for (String su:utensils)
			System.out.println(su);
		
	}
	
	static void storeStaffs(){
		String[] staffs={"chef","Dishwasher","helpercheff","waiter","manager"};
		
		for (String ss:staffs)
			System.out.println(ss);
	}
	
	static void storeHotelInfo(){
		String[] info={"HotelName","HotelAdress","RoomCount","Prices","Reviews"};
		
		for (String hi:info)
			System.out.println(hi);
	}
	
	static void storeMenu(){
		String[] menu={"Starters","Veg","Non-veg","Juices","Roties"};
		
		for (String sm:menu)
			System.out.println(sm);
	}
}