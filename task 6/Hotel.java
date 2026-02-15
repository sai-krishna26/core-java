class Hotel
{
		
	//method for payment status items	
	static void getItemDetails(String itemName, int quantity, boolean parcel)
	{
		String paymentStatus;
		
		if(parcel==true)
			paymentStatus="Paid";
		else
			paymentStatus="Not paid";
		
	System.out.println("THE DETAILS OF ITEMS AND PAYMENT STATUS\n");	
		System.out.println("details of items are: "+itemName+
		"\n"+quantity+
		" items\n"+
		paymentStatus+"\n=========================");
	}
	
	
	//method for owner information
	static void ownerInfo(long GSTINno, String ownerName, int age, String address,  boolean taxPaid)
	{
		String taxStatus;
		
		if(taxPaid==true)
			taxStatus="Paid";
		else
			taxStatus="Not paid";
		
	System.out.println("THE DETAILS OF OWNER AND GSTINno\n");
		System.out.println("details of owners are: "
		+"GSTINno: "+GSTINno+"\n"
		+"ownerName: "+ownerName+"\n"
		+"age: "+age+"\n"
		+"address: "+address+"\n"
		+"taxStatus: "+taxStatus+"\n=========================");
	}
	
	
	//method for staff information
	static void staffInfo(String staffType, String staffName, int salary, String nativity, String email, long mobileNo)
	{
	System.out.println("THE DETAILS OF STAFF\n");
		System.out.println("details of staff are: "
		+"staffType: "+staffType+"\n"
		+"staffName: "+staffName+"\n"
		+"salary: "+salary+"\n"
		+"nativity: "+nativity+"\n"
		+"email: "+email+"\n"
		+"mobileNo: "+mobileNo+"\n=========================");
	}
	
	
	static void hotelInfo(String hotelName, String location,int noOfRooms, float rating, boolean vegOnly)
    {
        String vegOnlyStatus;
		
		if(vegOnly==true)
			vegOnlyStatus="VEG";
		else
			vegOnlyStatus="VEG AND NON-VEG";

        System.out.println("HOTEL DETAILS");
        System.out.println(
            "Hotel Name: " + hotelName +
            "\nLocation: " + location +
            "\nRooms: " + noOfRooms +
            "\nRating: " + rating +
            "\nFood Type: " + vegOnlyStatus +
            "\n=========================");
    }
}