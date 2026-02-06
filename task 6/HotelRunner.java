class HotelRunner{
public static void main(String[] val){
	
	// to print the item and payment status
		String itemName="Poori";
		int quantity=2;
		boolean parcel=true;
		
		String itemName1="Parota";
		int quantity1=1;
		boolean parcel1=true;
	
		String itemName2="Dosa";
		int quantity2=3;
		boolean parcel2=false;
		
		String itemName3="Coffee";
		int quantity3=6;
		boolean parcel3=false;
		
		String itemName4="Tea";
		int quantity4=6;
		boolean parcel4=true;
		
		String itemName5="blackTea";
		int quantity5=6;
		boolean parcel5=true;
		
		String itemName6="Boost";
		int quantity6=2;
		boolean parcel6=false;
		
		String itemName7="BlackCoffee";
		int quantity7=3;
		boolean parcel7=false;
		
		String itemName8="Idli";
        int quantity8=4;
        boolean parcel8=true;

        String itemName9="Vada";
        int quantity9=2;
        boolean parcel9=false;

        String itemName10="MasalaDosa";
        int quantity10=1;
        boolean parcel10=true;

        String itemName11="Upma";
        int quantity11=2;
        boolean parcel11=false;

        String itemName12="Pongal";
        int quantity12=1;
        boolean parcel12=true;

        String itemName13="Uttapam";
        int quantity13=2;
        boolean parcel13=false;

        String itemName14="SetDosa";
        int quantity14=3;
        boolean parcel14=true;

        String itemName15="Chapati";
        int quantity15=4;
        boolean parcel15=false;

        String itemName16="ButterNaan";
        int quantity16=2;
        boolean parcel16=true;

        String itemName17="PaneerButterMasala";
        int quantity17=1;
        boolean parcel17=true;

        String itemName18="VegMeals";
        int quantity18=1;
        boolean parcel18=false;

        String itemName19="FriedRice";
        int quantity19=2;
        boolean parcel19=true;

        String itemName20="JeeraRice";
        int quantity20=1;
        boolean parcel20=false;

        String itemName21="CurdRice";
        int quantity21=1;
        boolean parcel21=false;

        String itemName22="LemonRice";
        int quantity22=2;
        boolean parcel22=true;

        String itemName23="BadamMilk";
        int quantity23=2;
        boolean parcel23=true;

        String itemName24="FreshLimeJuice";
        int quantity24=3;
        boolean parcel24=false;

        String itemName25="GulabJamun";
        int quantity25=4;
        boolean parcel25=true;

        String itemName26="IceCream";
        int quantity26=2;
        boolean parcel26=false;

        String itemName27="FruitSalad";
        int quantity27=1;
        boolean parcel27=true;

        String itemName28="Samosa";
        int quantity28=5;
        boolean parcel28=true;

        String itemName29="Pakoda";
        int quantity29=3;
        boolean parcel29=false;

        String itemName30="VegBurger";
        int quantity30=2;
        boolean parcel30=true;

        String itemName31="VegSandwich";
        int quantity31=2;
        boolean parcel31=false;

        String itemName32="FrenchFries";
        int quantity32=1;
        boolean parcel32=true;

        String itemName33="CholeBhature";
        int quantity33=1;
        boolean parcel33=false;

        String itemName34="VegKorma";
        int quantity34=1;
        boolean parcel34=true;
		
		
		//to print the owner details 
		//owner1
		long GSTINno=200420052002026L;
		String ownerName="SAIKRISHNA";
		int age=23;
		String address="2nd stage BTM layout, Bengaluru";
		boolean taxPaid=true;
		
		//owner2
		long GSTINno1=200420052002026L;
		String ownerName1="VAMSHI";
		int age1=22;
		String address1="2nd stage BTM layout, Bengaluru";
		boolean taxPaid1=false;
		
		//owner3
		long GSTINno2=200420052002026L;
		String ownerName2="BHANU PRAKASH";
		int age2=25;
		String address2="2nd stage BTM layout, Bengaluru";
		boolean taxPaid2=true;
		
		//owner4
		long GSTINno3=200420052002026L;
		String ownerName3="SURYA";
		int age3=22;
		String address3="2nd stage BTM layout, Bengaluru";
		boolean taxPaid3=false;
		
		//owner5
		long GSTINno4=200420052002026L;
		String ownerName4="ABHISHEK";
		int age4=23;
		String address4="2nd stage BTM layout, Bengaluru";
		boolean taxPaid4=true;
		
		//to print the item and payment status
		Hotel.getItemDetails(itemName,quantity,parcel);
		Hotel.getItemDetails(itemName1,quantity1,parcel1);
		Hotel.getItemDetails(itemName2,quantity2,parcel2);
		Hotel.getItemDetails(itemName3,quantity3,parcel3);
		Hotel.getItemDetails(itemName4,quantity4,parcel4);
		Hotel.getItemDetails(itemName5,quantity5,parcel5);
		Hotel.getItemDetails(itemName6,quantity6,parcel6);
		Hotel.getItemDetails(itemName7,quantity7,parcel7);
		Hotel.getItemDetails(itemName8,quantity8,parcel8);
        Hotel.getItemDetails(itemName9,quantity9,parcel9);
        Hotel.getItemDetails(itemName10,quantity10,parcel10);
        Hotel.getItemDetails(itemName11,quantity11,parcel11);
        Hotel.getItemDetails(itemName12,quantity12,parcel12);
        Hotel.getItemDetails(itemName13,quantity13,parcel13);
        Hotel.getItemDetails(itemName14,quantity14,parcel14);
        Hotel.getItemDetails(itemName15,quantity15,parcel15);
        Hotel.getItemDetails(itemName16,quantity16,parcel16);
        Hotel.getItemDetails(itemName17,quantity17,parcel17);
        Hotel.getItemDetails(itemName18,quantity18,parcel18);
        Hotel.getItemDetails(itemName19,quantity19,parcel19);
        Hotel.getItemDetails(itemName20,quantity20,parcel20);
        Hotel.getItemDetails(itemName21,quantity21,parcel21);
        Hotel.getItemDetails(itemName22,quantity22,parcel22);
        Hotel.getItemDetails(itemName23,quantity23,parcel23);
        Hotel.getItemDetails(itemName24,quantity24,parcel24);
        Hotel.getItemDetails(itemName25,quantity25,parcel25);
        Hotel.getItemDetails(itemName26,quantity26,parcel26);
        Hotel.getItemDetails(itemName27,quantity27,parcel27);
        Hotel.getItemDetails(itemName28,quantity28,parcel28);
        Hotel.getItemDetails(itemName29,quantity29,parcel29);
        Hotel.getItemDetails(itemName30,quantity30,parcel30);
        Hotel.getItemDetails(itemName31,quantity31,parcel31);
        Hotel.getItemDetails(itemName32,quantity32,parcel32);
        Hotel.getItemDetails(itemName33,quantity33,parcel33);
        Hotel.getItemDetails(itemName34,quantity34,parcel34);
		
		//to print the owner details
		Hotel.ownerInfo(GSTINno,ownerName,age,address,taxPaid);
		Hotel.ownerInfo(GSTINno,ownerName1,age1,address,taxPaid1);
		Hotel.ownerInfo(GSTINno,ownerName2,age2,address,taxPaid2);
		Hotel.ownerInfo(GSTINno,ownerName3,age3,address,taxPaid3);
		Hotel.ownerInfo(GSTINno,ownerName4,age4,address,taxPaid4);
	}
}