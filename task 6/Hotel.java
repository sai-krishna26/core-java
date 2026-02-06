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
		System.out.println("details of items are: "+itemName+"\n"+quantity+" items\n"+paymentStatus+"\n");
	};
	
	
	//method for owner information
	static void ownerInfo(long GSTINno, String ownerName, int age, String address,  boolean taxPaid)
	{
		String taxStatus;
		
		if(taxPaid==true)
			taxStatus="Paid";
		else
			taxStatus="Not paid";
		
	System.out.println("THE DETAILS OF OWNER AND GSTINno\n");
		System.out.println("details of owners are: "+"GSTINno: "+GSTINno+"\n"+"ownerName: "+ownerName+"\n"+"age: "+age+"\n"+"address: "+address+"\n"+"taxStatus: "+taxStatus+"\n");
	};
	
	
	
}