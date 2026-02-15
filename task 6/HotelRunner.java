class HotelRunner{
public static void main(String[] val){
	
	//=======================================declaring the values to invoke============================================
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
		long gstinNo=200420052002026L;
		String ownerName="SAIKRISHNA";
		int age=23;
		String address="2nd stage BTM layout, Bengaluru";
		boolean taxPaid=true;
		
		//owner2
		long gstinNo=200420052002026L;
		String ownerName1="VAMSHI";
		int age1=22;
		String address1="2nd stage BTM layout, Bengaluru";
		boolean taxPaid=false;
		
		//owner3
		long gstinNo=200420052002026L;
		String ownerName2="BHANU PRAKASH";
		int age2=25;
		String address="2nd stage BTM layout, Bengaluru";
		boolean taxPaid2=true;
		
		//owner4
		long gstinNo=200420052002026L;
		String ownerName3="SURYA";
		int age3=22;
		String addres="2nd stage BTM layout, Bengaluru";
		boolean taxPaid3=false;
		
		//owner5
		long gstinNo=200420052002026L;
		String ownerName4="ABHISHEK";
		int age4=23;
		String address="2nd stage BTM layout, Bengaluru";
		boolean taxPaid4=true;	
		
		
		
		//to print	staff details
		String staffType="Relation Manager";
		String staffName="vinay";
		int salary=45000;
		String nativity="gurumitkal";
		String email="vinay2004@gmail.com";
		long mobileNo=9000000000L;
		
		String staffType1="Receptionist";
		String staffName1="narendra";
		int salary1=40000;
		String nativity1="gurumitkal";
		String email1="narendra2004@gmail.com";
		long mobileNo1=9000000001L;
		
		String staffType2="Front Desk Executive";
		String staffName2="siddarth";
		int salary2=35000;
		String nativity2="narayanpur";
		String email2="siddu2004@gmail.com";
		long mobileNo2=9000000002L;
		
		String staffType3="Waiter";
		String staffName3="ramesh";
		int salary3=25000;
		String nativity3="kalaburagi";
		String email3="ramesh2004@gmail.com";
		long mobileNo3=9000000003L;

		String staffType4="Chef";
		String staffName4="suresh";
		int salary4=50000;
		String nativity4="yadgir";
		String email4="suresh2004@gmail.com";
		long mobileNo4=9000000004L;

		String staffType5="Housekeeping";
		String staffName5="mahesh";
		int salary5=22000;
		String nativity5="raichur";
		String email5="mahesh2004@gmail.com";
		long mobileNo5=9000000005L;

		String staffType6="Security";
		String staffName6="arjun";
		int salary6=28000;
		String nativity6="bidar";
		String email6="arjun2004@gmail.com";
		long mobileNo6=9000000006L;

		String staffType7="Cashier";
		String staffName7="kiran";
		int salary7=32000;
		String nativity7="gulbarga";
		String email7="kiran2004@gmail.com";
		long mobileNo7=9000000007L;

		String staffType8="Cleaner";
		String staffName8="prasad";
		int salary8=20000;
		String nativity8="shahapur";
		String email8="prasad2004@gmail.com";
		long mobileNo8=9000000008L;

		String staffType9="Manager";
		String staffName9="ravindra";
		int salary9=60000;
		String nativity9="bangalore";
		String email9="ravindra2004@gmail.com";
		long mobileNo9=9000000009L;

		String staffType10="Assistant Manager";
		String staffName10="ajay";
		int salary10=38000;
		String nativity10="yadgir";
		String email10="ajay2004@gmail.com";
		long mobileNo10=9000000010L;

		String staffType11="Room Service";
		String staffName11="vijay";
		int salary11=26000;
		String nativity11="kalaburagi";
		String email11="vijay2004@gmail.com";
		long mobileNo11=9000000011L;

		String staffType12="Bell Boy";
		String staffName12="manoj";
		int salary12=23000;
		String nativity12="raichur";
		String email12="manoj2004@gmail.com";
		long mobileNo12=9000000012L;

		String staffType13="Maintenance";
		String staffName13="shankar";
		int salary13=30000;
		String nativity13="bidar";
		String email13="shankar2004@gmail.com";
		long mobileNo13=9000000013L;

		String staffType14="Store Keeper";
		String staffName14="anil";
		int salary14=27000;
		String nativity14="shahapur";
		String email14="anil2004@gmail.com";
		long mobileNo14=9000000014L;

		String staffType15="Accounts Executive";
		String staffName15="sunil";
		int salary15=42000;
		String nativity15="bangalore";
		String email15="sunil2004@gmail.com";
		long mobileNo15=9000000015L;

		String staffType16="HR Executive";
		String staffName16="rohit";
		int salary16=48000;
		String nativity16="mysore";
		String email16="rohit2004@gmail.com";
		long mobileNo16=9000000016L;

		String staffType17="Kitchen Helper";
		String staffName17="naveen";
		int salary17=21000;
		String nativity17="hospet";
		String email17="naveen2004@gmail.com";
		long mobileNo17=9000000017L;

		String staffType18="Laundry Staff";
		String staffName18="girish";
		int salary18=22000;
		String nativity18="koppal";
		String email18="girish2004@gmail.com";
		long mobileNo18=9000000018L;

		String staffType19="Night Auditor";
		String staffName19="harish";
		int salary19=36000;
		String nativity19="davangere";
		String email19="harish2004@gmail.com";
		long mobileNo19=9000000019L;

		String staffType20="IT Support";
		String staffName20="deepak";
		int salary20=45000;
		String nativity20="hubli";
		String email20="deepak2004@gmail.com";
		long mobileNo20=9000000020L;

		String staffType21="Event Coordinator";
		String staffName21="chethan";
		int salary21=40000;
		String nativity21="mangalore";
		String email21="chethan2004@gmail.com";
		long mobileNo21=9000000021L;

		String staffType22="Marketing Executive";
		String staffName22="pavan";
		int salary22=47000;
		String nativity22="udupi";
		String email22="pavan2004@gmail.com";
		long mobileNo22=9000000022L;

		String staffType23="Sales Executive";
		String staffName23="lokesh";
		int salary23=39000;
		String nativity23="tumkur";
		String email23="lokesh2004@gmail.com";
		long mobileNo23=9000000023L;

		String staffType24="Travel Desk";
		String staffName24="santosh";
		int salary24=34000;
		String nativity24="chitradurga";
		String email24="santosh2004@gmail.com";
		long mobileNo24=9000000024L;

		String staffType25="Gym Trainer";
		String staffName25="mahadev";
		int salary25=50000;
		String nativity25="bellary";
		String email25="mahadev2004@gmail.com";
		long mobileNo25=9000000025L;
		
		
		String staffType26="Assistant";
		String staffName26="rajesh";
		int salary26=28000;
		String nativity26="yadgir";
		String email26="rajesh2004@gmail.com";
		long mobileNo26=9000000026L;

		String staffType27="Receptionist";
		String staffName27="manjunath";
		int salary27=30000;
		String nativity27="kalaburagi";
		String email27="manjunath2004@gmail.com";
		long mobileNo27=9000000027L;

		String staffType28="Waiter";
		String staffName28="sachin";
		int salary28=24000;
		String nativity28="raichur";
		String email28="sachin2004@gmail.com";
		long mobileNo28=9000000028L;

		String staffType29="Chef";
		String staffName29="prakash";
		int salary29=52000;
		String nativity29="bidar";
		String email29="prakash2004@gmail.com";
		long mobileNo29=9000000029L;

		String staffType30="Cleaner";
		String staffName30="basavaraj";
		int salary30=20000;
		String nativity30="shahapur";
		String email30="basavaraj2004@gmail.com";
		long mobileNo30=9000000030L;

		String staffType31="Security";
		String staffName31="mallikarjun";
		int salary31=27000;
		String nativity31="gulbarga";
		String email31="mallikarjun2004@gmail.com";
		long mobileNo31=9000000031L;

		String staffType32="Cashier";
		String staffName32="harsha";
		int salary32=33000;
		String nativity32="bangalore";
		String email32="harsha2004@gmail.com";
		long mobileNo32=9000000032L;

		String staffType33="Front Desk";
		String staffName33="akash";
		int salary33=36000;
		String nativity33="mysore";
		String email33="akash2004@gmail.com";
		long mobileNo33=9000000033L;

		String staffType34="Room Service";
		String staffName34="darshan";
		int salary34=26000;
		String nativity34="mandya";
		String email34="darshan2004@gmail.com";
		long mobileNo34=9000000034L;

		String staffType35="Bell Boy";
		String staffName35="tejas";
		int salary35=23000;
		String nativity35="hassan";
		String email35="tejas2004@gmail.com";
		long mobileNo35=9000000035L;

		String staffType36="Store Assistant";
		String staffName36="karthik";
		int salary36=29000;
		String nativity36="udupi";
		String email36="karthik2004@gmail.com";
		long mobileNo36=9000000036L;

		String staffType37="Maintenance";
		String staffName37="chandru";
		int salary37=31000;
		String nativity37="hubli";
		String email37="chandru2004@gmail.com";
		long mobileNo37=9000000037L;

		String staffType38="Laundry";
		String staffName38="nithin";
		int salary38=22000;
		String nativity38="dharwad";
		String email38="nithin2004@gmail.com";
		long mobileNo38=9000000038L;

		String staffType39="Night Shift";
		String staffName39="lohith";
		int salary39=34000;
		String nativity39="davangere";
		String email39="lohith2004@gmail.com";
		long mobileNo39=9000000039L;

		String staffType40="IT Support";
		String staffName40="vinod";
		int salary40=46000;
		String nativity40="belagavi";
		String email40="vinod2004@gmail.com";
		long mobileNo40=9000000040L;

		String staffType41="Marketing";
		String staffName41="sagar";
		int salary41=48000;
		String nativity41="mangalore";
		String email41="sagar2004@gmail.com";
		long mobileNo41=9000000041L;

		String staffType42="Sales";
		String staffName42="abhinav";
		int salary42=39000;
		String nativity42="tumkur";
		String email42="abhinav2004@gmail.com";
		long mobileNo42=9000000042L;

		String staffType43="HR";
		String staffName43="shilpa";
		int salary43=50000;
		String nativity43="bangalore";
		String email43="shilpa2004@gmail.com";
		long mobileNo43=9000000043L;

		String staffType44="Accounts";
		String staffName44="pooja";
		int salary44=42000;
		String nativity44="mysore";
		String email44="pooja2004@gmail.com";
		long mobileNo44=9000000044L;

		String staffType45="Supervisor";
		String staffName45="ravi";
		int salary45=38000;
		String nativity45="kolar";
		String email45="ravi2004@gmail.com";
		long mobileNo45=9000000045L;
		
		String staffType46="Assistant";
		String staffName46="raju";
		int salary46=28000;
		String nativity46="yadgir";
		String email46="raju2004@gmail.com";
		long mobileNo46=9000000046L;

		String staffType47="Receptionist";
		String staffName47="manoj";
		int salary47=30000;
		String nativity47="kalaburagi";
		String email47="manoj2004@gmail.com";
		long mobileNo47=9000000047L;

		String staffType48="Waiter";
		String staffName48="suresh";
		int salary48=24000;
		String nativity48="raichur";
		String email48="suresh2004@gmail.com";
		long mobileNo48=9000000048L;

		String staffType49="Chef";
		String staffName49="prakash";
		int salary49=52000;
		String nativity49="bidar";
		String email49="prakash2004@gmail.com";
		long mobileNo49=9000000049L;

		String staffType50="Cleaner";
		String staffName50="basavaraj";
		int salary50=20000;
		String nativity50="shahapur";
		String email50="basavaraj2004@gmail.com";
		long mobileNo50=9000000050L;

		String staffType51="Security";
		String staffName51="mallikarjun";
		int salary51=27000;
		String nativity51="gulbarga";
		String email51="mallikarjun2004@gmail.com";
		long mobileNo51=9000000051L;

		String staffType52="Cashier";
		String staffName52="harsha";
		int salary52=33000;
		String nativity52="bangalore";
		String email52="harsha2004@gmail.com";
		long mobileNo52=9000000052L;

		String staffType53="Front Desk";
		String staffName53="akash";
		int salary53=36000;
		String nativity53="mysore";
		String email53="akash2004@gmail.com";
		long mobileNo53=9000000053L;

		String staffType54="Room Service";
		String staffName54="darshan";
		int salary54=26000;
		String nativity54="mandya";
		String email54="darshan2004@gmail.com";
		long mobileNo54=9000000054L;

		String staffType55="Bell Boy";
		String staffName55="tejas";
		int salary55=23000;
		String nativity55="hassan";
		String email55="tejas2004@gmail.com";
		long mobileNo55=9000000055L;

		String staffType56="Store Assistant";
		String staffName56="karthik";
		int salary56=29000;
		String nativity56="udupi";
		String email56="karthik2004@gmail.com";
		long mobileNo56=9000000056L;

		String staffType57="Maintenance";
		String staffName57="chandru";
		int salary57=31000;
		String nativity57="hubli";
		String email57="chandru2004@gmail.com";
		long mobileNo57=9000000057L;

		String staffType58="Laundry";
		String staffName58="nithin";
		int salary58=22000;
		String nativity58="dharwad";
		String email58="nithin2004@gmail.com";
		long mobileNo58=9000000058L;

		String staffType59="Night Shift";
		String staffName59="lohith";
		int salary59=34000;
		String nativity59="davangere";
		String email59="lohith2004@gmail.com";
		long mobileNo59=9000000059L;

		String staffType60="IT Support";
		String staffName60="vinod";
		int salary60=46000;
		String nativity60="belagavi";
		String email60="vinod2004@gmail.com";
		long mobileNo60=9000000060L;

		String staffType61="Marketing";
		String staffName61="sagar";
		int salary61=48000;
		String nativity61="mangalore";
		String email61="sagar2004@gmail.com";
		long mobileNo61=9000000061L;

		String staffType62="Sales";
		String staffName62="abhinav";
		int salary62=39000;
		String nativity62="tumkur";
		String email62="abhinav2004@gmail.com";
		long mobileNo62=9000000062L;

		String staffType63="HR";
		String staffName63="shilpa";
		int salary63=50000;
		String nativity63="bangalore";
		String email63="shilpa2004@gmail.com";
		long mobileNo63=9000000063L;

		String staffType64="Accounts";
		String staffName64="pooja";
		int salary64=42000;
		String nativity64="mysore";
		String email64="pooja2004@gmail.com";
		long mobileNo64=9000000064L;

		String staffType65="Supervisor";
		String staffName65="ravi";
		int salary65=38000;
		String nativity65="kolar";
		String email65="ravi2004@gmail.com";
		long mobileNo65=9000000065L;

		String staffType66="Assistant Manager";
		String staffName66="anand";
		int salary66=41000;
		String nativity66="chitradurga";
		String email66="anand2004@gmail.com";
		long mobileNo66=9000000066L;

		String staffType67="Travel Desk";
		String staffName67="santosh";
		int salary67=34000;
		String nativity67="bellary";
		String email67="santosh2004@gmail.com";
		long mobileNo67=9000000067L;

		String staffType68="Gym Trainer";
		String staffName68="mahadev";
		int salary68=50000;
		String nativity68="bellary";
		String email68="mahadev2004@gmail.com";
		long mobileNo68=9000000068L;

		String staffType69="Event Coordinator";
		String staffName69="chethan";
		int salary69=40000;
		String nativity69="mangalore";
		String email69="chethan2004@gmail.com";
		long mobileNo69=9000000069L;

		String staffType70="Kitchen Helper";
		String staffName70="naveen";
		int salary70=21000;
		String nativity70="hospet";
		String email70="naveen2004@gmail.com";
		long mobileNo70=9000000070L;

		String staffType71="Store Keeper";
		String staffName71="anil";
		int salary71=27000;
		String nativity71="shahapur";
		String email71="anil2004@gmail.com";
		long mobileNo71=9000000071L;

		String staffType72="Bell Desk";
		String staffName72="ganesh";
		int salary72=23000;
		String nativity72="haveri";
		String email72="ganesh2004@gmail.com";
		long mobileNo72=9000000072L;

		String staffType73="Housekeeping";
		String staffName73="mahesh";
		int salary73=22000;
		String nativity73="raichur";
		String email73="mahesh2004@gmail.com";
		long mobileNo73=9000000073L;

		String staffType74="Cleaner";
		String staffName74="sharan";
		int salary74=20000;
		String nativity74="yadgir";
		String email74="sharan2004@gmail.com";
		long mobileNo74=9000000074L;

		String staffType75="Security Guard";
		String staffName75="veerappa";
		int salary75=28000;
		String nativity75="kalaburagi";
		String email75="veerappa2004@gmail.com";
		long mobileNo75=9000000075L;

		String staffType76="Inventory Manager";
		String staffName76="uday";
		int salary76=37000;
		String nativity76="bijapur";
		String email76="uday2004@gmail.com";
		long mobileNo76=9000000076L;

		String staffType77="Guest Relations";
		String staffName77="tarun";
		int salary77=39000;
		String nativity77="bagalkot";
		String email77="tarun2004@gmail.com";
		long mobileNo77=9000000077L;

		String staffType78="Food Supervisor";
		String staffName78="prashanth";
		int salary78=41000;
		String nativity78="ilkal";
		String email78="prashanth2004@gmail.com";
		long mobileNo78=9000000078L;

		String staffType79="Quality Checker";
		String staffName79="srinivas";
		int salary79=36000;
		String nativity79="gadag";
		String email79="srinivas2004@gmail.com";
		long mobileNo79=9000000079L;

		String staffType80="Logistics Coordinator";
		String staffName80="manish";
		int salary80=42000;
		String nativity80="ranebennur";
		String email80="manish2004@gmail.com";
		long mobileNo80=9000000080L;

		String staffType81="Procurement Officer";
		String staffName81="yogesh";
		int salary81=45000;
		String nativity81="harihar";
		String email81="yogesh2004@gmail.com";
		long mobileNo81=9000000081L;

		String staffType82="Facility Manager";
		String staffName82="santoshkumar";
		int salary82=48000;
		String nativity82="hosapete";
		String email82="santoshkumar2004@gmail.com";
		long mobileNo82=9000000082L;

		String staffType83="Training Coordinator";
		String staffName83="lokanath";
		int salary83=40000;
		String nativity83="sirsi";
		String email83="lokanath2004@gmail.com";
		long mobileNo83=9000000083L;

		String staffType84="Shift Supervisor";
		String staffName84="vinayak";
		int salary84=43000;
		String nativity84="kundapura";
		String email84="vinayak2004@gmail.com";
		long mobileNo84=9000000084L;

		String staffType85="Compliance Officer";
		String staffName85="sudarshan";
		int salary85=47000;
		String nativity85="karwar";
		String email85="sudarshan2004@gmail.com";
		long mobileNo85=9000000085L;

		String staffType86="Safety Officer";
		String staffName86="rameshkumar";
		int salary86=44000;
		String nativity86="ankola";
		String email86="rameshkumar2004@gmail.com";
		long mobileNo86=9000000086L;

		String staffType87="Energy Supervisor";
		String staffName87="mahantesh";
		int salary87=46000;
		String nativity87="navalgund";
		String email87="mahantesh2004@gmail.com";
		long mobileNo87=9000000087L;

		String staffType88="Asset Controller";
		String staffName88="basanagouda";
		int salary88=49000;
		String nativity88="mudhol";
		String email88="basanagouda2004@gmail.com";
		long mobileNo88=9000000088L;

		String staffType89="Vendor Manager";
		String staffName89="shivanand";
		int salary89=51000;
		String nativity89="jamkhandi";
		String email89="shivanand2004@gmail.com";
		long mobileNo89=9000000089L;

		String staffType90="Operations Analyst";
		String staffName90="chandrashekhar";
		int salary90=53000;
		String nativity90="sindhanur";
		String email90="chandrashekhar2004@gmail.com";
		long mobileNo90=9000000090L;

		String staffType91="Business Coordinator";
		String staffName91="prajwal";
		int salary91=48000;
		String nativity91="sira";
		String email91="prajwal2004@gmail.com";
		long mobileNo91=9000000091L;

		String staffType92="Service Planner";
		String staffName92="keshav";
		int salary92=45000;
		String nativity92="madhugiri";
		String email92="keshav2004@gmail.com";
		long mobileNo92=9000000092L;

		String staffType93="Audit Executive";
		String staffName93="shashidhar";
		int salary93=50000;
		String nativity93="tiptur";
		String email93="shashidhar2004@gmail.com";
		long mobileNo93=9000000093L;

		String staffType94="Risk Officer";
		String staffName94="hariprasad";
		int salary94=52000;
		String nativity94="arsikere";
		String email94="hariprasad2004@gmail.com";
		long mobileNo94=9000000094L;

		String staffType95="Process Controller";
		String staffName95="venkatesh";
		int salary95=54000;
		String nativity95="channarayapatna";
		String email95="venkatesh2004@gmail.com";
		long mobileNo95=9000000095L;

		String staffType96="Customer Experience Lead";
		String staffName96="adithya";
		int salary96=56000;
		String nativity96="sakleshpur";
		String email96="adithya2004@gmail.com";
		long mobileNo96=9000000096L;

		String staffType97="Data Coordinator";
		String staffName97="naveenkumar";
		int salary97=58000;
		String nativity97="alur";
		String email97="naveenkumar2004@gmail.com";
		long mobileNo97=9000000097L;

		String staffType98="Resource Planner";
		String staffName98="pradeepr";
		int salary98=60000;
		String nativity98="belur";
		String email98="pradeepr2004@gmail.com";
		long mobileNo98=9000000098L;

		String staffType99="Strategy Executive";
		String staffName99="shreyas";
		int salary99=62000;
		String nativity99="halebeedu";
		String email99="shreyas2004@gmail.com";
		long mobileNo99=9000000099L;

		String staffType100="Operations Manager";
		String staffName100="karthikeyan";
		int salary100=65000;
		String nativity100="hunsur";
		String email100="karthikeyan2004@gmail.com";
		long mobileNo100=9000000100L;

		String staffType101="Policy Administrator";
		String staffName101="sanjay";
		int salary101=67000;
		String nativity101="periyapatna";
		String email101="sanjay2004@gmail.com";
		long mobileNo101=9000000101L;

		String staffType102="Performance Analyst";
		String staffName102="rithvik";
		int salary102=69000;
		String nativity102="krishnarajanagara";
		String email102="rithvik2004@gmail.com";
		long mobileNo102=9000000102L;

		String staffType103="Knowledge Manager";
		String staffName103="vignesh";
		int salary103=71000;
		String nativity103="piriyapatna";
		String email103="vignesh2004@gmail.com";
		long mobileNo103=9000000103L;

		String staffType104="Innovation Lead";
		String staffName104="aravind";
		int salary104=73000;
		String nativity104="hebbal";
		String email104="aravind2004@gmail.com";
		long mobileNo104=9000000104L;

		String staffType105="Program Director";
		String staffName105="suraj";
		int salary105=75000;
		String nativity105="yelahanka";
		String email105="suraj2004@gmail.com";
		long mobileNo105=9000000105L;
		
		String staffType106="Systems Administrator";
		String staffName106="ashwin";
		int salary106=77000;
		String nativity106="nelamangala";
		String email106="ashwin2004@gmail.com";
		long mobileNo106=9000000106L;

		String staffType107="Network Engineer";
		String staffName107="dhanush";
		int salary107=74000;
		String nativity107="magadi";
		String email107="dhanush2004@gmail.com";
		long mobileNo107=9000000107L;

		String staffType108="Infrastructure Lead";
		String staffName108="sudeep";
		int salary108=76000;
		String nativity108="ramanagara";
		String email108="sudeep2004@gmail.com";
		long mobileNo108=9000000108L;

		String staffType109="Cloud Coordinator";
		String staffName109="rohan";
		int salary109=72000;
		String nativity109="kanakapura";
		String email109="rohan2004@gmail.com";
		long mobileNo109=9000000109L;

		String staffType110="Application Support";
		String staffName110="kishore";
		int salary110=70000;
		String nativity110="chikkaballapur";
		String email110="kishore2004@gmail.com";
		long mobileNo110=9000000110L;

		String staffType111="Service Delivery Lead";
		String staffName111="manojkumar";
		int salary111=78000;
		String nativity111="chintamani";
		String email111="manojkumar2004@gmail.com";
		long mobileNo111=9000000111L;

		String staffType112="Release Manager";
		String staffName112="avinash";
		int salary112=80000;
		String nativity112="kolar";
		String email112="avinash2004@gmail.com";
		long mobileNo112=9000000112L;

		String staffType113="Change Manager";
		String staffName113="raghavendra";
		int salary113=82000;
		String nativity113="mulbagal";
		String email113="raghavendra2004@gmail.com";
		long mobileNo113=9000000113L;

		String staffType114="Configuration Lead";
		String staffName114="narasimha";
		int salary114=79000;
		String nativity114="bangarpet";
		String email114="narasimha2004@gmail.com";
		long mobileNo114=9000000114L;

		String staffType115="Monitoring Analyst";
		String staffName115="tejaswi";
		int salary115=75000;
		String nativity115="kgf";
		String email115="tejaswi2004@gmail.com";
		long mobileNo115=9000000115L;

		String staffType116="Incident Manager";
		String staffName116="pranav";
		int salary116=83000;
		String nativity116="malur";
		String email116="pranav2004@gmail.com";
		long mobileNo116=9000000116L;

		String staffType117="Problem Manager";
		String staffName117="abhishek";
		int salary117=85000;
		String nativity117="hoskote";
		String email117="abhishek2004@gmail.com";
		long mobileNo117=9000000117L;

		String staffType118="Capacity Planner";
		String staffName118="vijeth";
		int salary118=81000;
		String nativity118="devanahalli";
		String email118="vijeth2004@gmail.com";
		long mobileNo118=9000000118L;

		String staffType119="Availability Lead";
		String staffName119="sachith";
		int salary119=84000;
		String nativity119="doddaballapur";
		String email119="sachith2004@gmail.com";
		long mobileNo119=9000000119L;

		String staffType120="Continuity Manager";
		String staffName120="nithesh";
		int salary120=86000;
		String nativity120="gubbi";
		String email120="nithesh2004@gmail.com";
		long mobileNo120=9000000120L;

		String staffType121="Security Analyst";
		String staffName121="koushik";
		int salary121=88000;
		String nativity121="turuvekere";
		String email121="koushik2004@gmail.com";
		long mobileNo121=9000000121L;

		String staffType122="Compliance Lead";
		String staffName122="srikanth";
		int salary122=90000;
		String nativity122="kunigal";
		String email122="srikanth2004@gmail.com";
		long mobileNo122=9000000122L;

		String staffType123="Governance Officer";
		String staffName123="deepesh";
		int salary123=92000;
		String nativity123="madanapalle";
		String email123="deepesh2004@gmail.com";
		long mobileNo123=9000000123L;

		String staffType124="Risk Analyst";
		String staffName124="punit";
		int salary124=94000;
		String nativity124="pavagada";
		String email124="punit2004@gmail.com";
		long mobileNo124=9000000124L;

		String staffType125="Audit Manager";
		String staffName125="sreenath";
		int salary125=96000;
		String nativity125="madhugiri";
		String email125="sreenath2004@gmail.com";
		long mobileNo125=9000000125L;

		String staffType126="Digital Transformation Lead";
		String staffName126="harsha vardhan";
		int salary126=98000;
		String nativity126="koratagere";
		String email126="harshavardhan2004@gmail.com";
		long mobileNo126=9000000126L;

		String staffType127="Automation Architect";
		String staffName127="siddharth";
		int salary127=100000;
		String nativity127="sira";
		String email127="siddharth2004@gmail.com";
		long mobileNo127=9000000127L;

		String staffType128="AI Operations Lead";
		String staffName128="rahul";
		int salary128=102000;
		String nativity128="huliyurdurga";
		String email128="rahul2004@gmail.com";
		long mobileNo128=9000000128L;

		String staffType129="ML Engineer";
		String staffName129="anurag";
		int salary129=104000;
		String nativity129="kadur";
		String email129="anurag2004@gmail.com";
		long mobileNo129=9000000129L;

		String staffType130="Data Platform Manager";
		String staffName130="varun";
		int salary130=106000;
		String nativity130="tarikere";
		String email130="varun2004@gmail.com";
		long mobileNo130=9000000130L;

		String staffType131="Analytics Director";
		String staffName131="sumanth";
		int salary131=108000;
		String nativity131="koppa";
		String email131="sumanth2004@gmail.com";
		long mobileNo131=9000000131L;

		String staffType132="Insights Lead";
		String staffName132="kiranmayi";
		int salary132=110000;
		String nativity132="sringeri";
		String email132="kiranmayi2004@gmail.com";
		long mobileNo132=9000000132L;

		String staffType133="Research Manager";
		String staffName133="meghna";
		int salary133=112000;
		String nativity133="chikmagalur";
		String email133="meghna2004@gmail.com";
		long mobileNo133=9000000133L;

		String staffType134="Innovation Strategist";
		String staffName134="tanmay";
		int salary134=114000;
		String nativity134="mudigere";
		String email134="tanmay2004@gmail.com";
		long mobileNo134=9000000134L;

		String staffType135="Chief Technology Advisor";
		String staffName135="praveen";
		int salary135=116000;
		String nativity135="narasimharajapura";
		String email135="praveen2004@gmail.com";
		long mobileNo135=9000000135L;
		
		String staffType136="Technical Consultant";
		String staffName136="vishal";
		int salary136=118000;
		String nativity136="kadur";
		String email136="vishal2004@gmail.com";
		long mobileNo136=9000000136L;

		String staffType137="Solution Architect";
		String staffName137="roopesh";
		int salary137=120000;
		String nativity137="channagiri";
		String email137="roopesh2004@gmail.com";
		long mobileNo137=9000000137L;

		String staffType138="Enterprise Planner";
		String staffName138="suhas";
		int salary138=122000;
		String nativity138="harihara";
		String email138="suhas2004@gmail.com";
		long mobileNo138=9000000138L;

		String staffType139="Platform Owner";
		String staffName139="madhav";
		int salary139=124000;
		String nativity139="ranebennur";
		String email139="madhav2004@gmail.com";
		long mobileNo139=9000000139L;

		String staffType140="Integration Lead";
		String staffName140="naren";
		int salary140=126000;
		String nativity140="shiggaon";
		String email140="naren2004@gmail.com";
		long mobileNo140=9000000140L;

		String staffType141="Service Architect";
		String staffName141="jayant";
		int salary141=128000;
		String nativity141="savanur";
		String email141="jayant2004@gmail.com";
		long mobileNo141=9000000141L;

		String staffType142="Workflow Designer";
		String staffName142="arjunrao";
		int salary142=130000;
		String nativity142="byadgi";
		String email142="arjunrao2004@gmail.com";
		long mobileNo142=9000000142L;

		String staffType143="Process Architect";
		String staffName143="lokendra";
		int salary143=132000;
		String nativity143="hangal";
		String email143="lokendra2004@gmail.com";
		long mobileNo143=9000000143L;

		String staffType144="Optimization Lead";
		String staffName144="manav";
		int salary144=134000;
		String nativity144="haveri";
		String email144="manav2004@gmail.com";
		long mobileNo144=9000000144L;

		String staffType145="Delivery Head";
		String staffName145="ranjit";
		int salary145=136000;
		String nativity145="mundgod";
		String email145="ranjit2004@gmail.com";
		long mobileNo145=9000000145L;

		String staffType146="Operations Head";
		String staffName146="pratap";
		int salary146=138000;
		String nativity146="sirsi";
		String email146="pratap2004@gmail.com";
		long mobileNo146=9000000146L;

		String staffType147="Business Head";
		String staffName147="sureshkumar";
		int salary147=140000;
		String nativity147="siddapur";
		String email147="sureshkumar2004@gmail.com";
		long mobileNo147=9000000147L;

		String staffType148="Strategy Head";
		String staffName148="mahendra";
		int salary148=142000;
		String nativity148="kumta";
		String email148="mahendra2004@gmail.com";
		long mobileNo148=9000000148L;

		String staffType149="Planning Director";
		String staffName149="bhaskar";
		int salary149=144000;
		String nativity149="bhatkal";
		String email149="bhaskar2004@gmail.com";
		long mobileNo149=9000000149L;

		String staffType150="Execution Director";
		String staffName150="ganapathi";
		int salary150=146000;
		String nativity150="ankola";
		String email150="ganapathi2004@gmail.com";
		long mobileNo150=9000000150L;

		String staffType151="Program Controller";
		String staffName151="dinesh";
		int salary151=148000;
		String nativity151="karwar";
		String email151="dinesh2004@gmail.com";
		long mobileNo151=9000000151L;

		String staffType152="Portfolio Manager";
		String staffName152="rajeshwar";
		int salary152=150000;
		String nativity152="joida";
		String email152="rajeshwar2004@gmail.com";
		long mobileNo152=9000000152L;

		String staffType153="Investment Analyst";
		String staffName153="vikram";
		int salary153=152000;
		String nativity153="yellapur";
		String email153="vikram2004@gmail.com";
		long mobileNo153=9000000153L;

		String staffType154="Financial Strategist";
		String staffName154="anup";
		int salary154=154000;
		String nativity154="supa";
		String email154="anup2004@gmail.com";
		long mobileNo154=9000000154L;

		String staffType155="Revenue Head";
		String staffName155="chaitanya";
		int salary155=156000;
		String nativity155="dandeli";
		String email155="chaitanya2004@gmail.com";
		long mobileNo155=9000000155L;

		String staffType156="Growth Manager";
		String staffName156="sameer";
		int salary156=158000;
		String nativity156="haliyal";
		String email156="sameer2004@gmail.com";
		long mobileNo156=9000000156L;

		String staffType157="Expansion Lead";
		String staffName157="akshay";
		int salary157=160000;
		String nativity157="mundgod";
		String email157="akshay2004@gmail.com";
		long mobileNo157=9000000157L;

		String staffType158="Regional Head";
		String staffName158="nithinraj";
		int salary158=162000;
		String nativity158="siddapur";
		String email158="nithinraj2004@gmail.com";
		long mobileNo158=9000000158L;

		String staffType159="Zonal Director";
		String staffName159="vivek";
		int salary159=164000;
		String nativity159="sirsi";
		String email159="vivek2004@gmail.com";
		long mobileNo159=9000000159L;

		String staffType160="National Coordinator";
		String staffName160="rohitsharma";
		int salary160=166000;
		String nativity160="hubli";
		String email160="rohitsharma2004@gmail.com";
		long mobileNo160=9000000160L;

		String staffType161="Operations Director";
		String staffName161="adwait";
		int salary161=168000;
		String nativity161="dharwad";
		String email161="adwait2004@gmail.com";
		long mobileNo161=9000000161L;

		String staffType162="Corporate Advisor";
		String staffName162="krishnaiah";
		int salary162=170000;
		String nativity162="belagavi";
		String email162="krishnaiah2004@gmail.com";
		long mobileNo162=9000000162L;

		String staffType163="Board Secretary";
		String staffName163="narayan";
		int salary163=172000;
		String nativity163="sankeshwar";
		String email163="narayan2004@gmail.com";
		long mobileNo163=9000000163L;

		String staffType164="Executive Liaison";
		String staffName164="govind";
		int salary164=174000;
		String nativity164="gokak";
		String email164="govind2004@gmail.com";
		long mobileNo164=9000000164L;

		String staffType165="Senior Advisor";
		String staffName165="shashank";
		int salary165=176000;
		String nativity165="athani";
		String email165="shashank2004@gmail.com";
		long mobileNo165=9000000165L;

		String staffType166="Principal Consultant";
		String staffName166="raghuveer";
		int salary166=178000;
		String nativity166="mudalagi";
		String email166="raghuveer2004@gmail.com";
		long mobileNo166=9000000166L;

		String staffType167="Chief Operations Officer";
		String staffName167="anilkumara";
		int salary167=180000;
		String nativity167="raibag";
		String email167="anilkumara2004@gmail.com";
		long mobileNo167=9000000167L;

		String staffType168="Chief Strategy Officer";
		String staffName168="muralidhar";
		int salary168=182000;
		String nativity168="kudachi";
		String email168="muralidhar2004@gmail.com";
		long mobileNo168=9000000168L;

		String staffType169="Chief Growth Officer";
		String staffName169="balakrishna";
		int salary169=184000;
		String nativity169="chikodi";
		String email169="balakrishna2004@gmail.com";
		long mobileNo169=9000000169L;

		String staffType170="Chief Innovation Officer";
		String staffName170="sridhar";
		int salary170=186000;
		String nativity170="nippani";
		String email170="sridhar2004@gmail.com";
		long mobileNo170=9000000170L;

		String staffType171="Chief Data Officer";
		String staffName171="ashok";
		int salary171=188000;
		String nativity171="athani";
		String email171="ashok2004@gmail.com";
		long mobileNo171=9000000171L;

		String staffType172="Chief Security Officer";
		String staffName172="veerendra";
		int salary172=190000;
		String nativity172="jamkhandi";
		String email172="veerendra2004@gmail.com";
		long mobileNo172=9000000172L;

		String staffType173="Chief Compliance Officer";
		String staffName173="rameshwar";
		int salary173=192000;
		String nativity173="mudhol";
		String email173="rameshwar2004@gmail.com";
		long mobileNo173=9000000173L;

		String staffType174="Chief Risk Officer";
		String staffName174="maheshwar";
		int salary174=194000;
		String nativity174="bilagi";
		String email174="maheshwar2004@gmail.com";
		long mobileNo174=9000000174L;

		String staffType175="Chief Audit Officer";
		String staffName175="basanth";
		int salary175=196000;
		String nativity175="badami";
		String email175="basanth2004@gmail.com";
		long mobileNo175=9000000175L;

		String staffType176="Chief Financial Officer";
		String staffName176="ravikumar";
		int salary176=198000;
		String nativity176="bagalkot";
		String email176="ravikumar2004@gmail.com";
		long mobileNo176=9000000176L;

		String staffType177="Chief Marketing Officer";
		String staffName177="manohar";
		int salary177=200000;
		String nativity177="ilkal";
		String email177="manohar2004@gmail.com";
		long mobileNo177=9000000177L;

		String staffType178="Chief Technology Officer";
		String staffName178="shivaraj";
		int salary178=202000;
		String nativity178="hungund";
		String email178="shivaraj2004@gmail.com";
		long mobileNo178=9000000178L;

		String staffType179="Chief Executive Officer";
		String staffName179="prakashraj";
		int salary179=204000;
		String nativity179="kaladgi";
		String email179="prakashraj2004@gmail.com";
		long mobileNo179=9000000179L;

		String staffType180="Executive Chairman";
		String staffName180="sudarshanrao";
		int salary180=206000;
		String nativity180="guledgudda";
		String email180="sudarshanrao2004@gmail.com";
		long mobileNo180=9000000180L;

		String staffType181="Board Member";
		String staffName181="nagendra";
		int salary181=208000;
		String nativity181="lokapur";
		String email181="nagendra2004@gmail.com";
		long mobileNo181=9000000181L;

		String staffType182="Senior Board Member";
		String staffName182="vinayakrao";
		int salary182=210000;
		String nativity182="mahalingpur";
		String email182="vinayakrao2004@gmail.com";
		long mobileNo182=9000000182L;

		String staffType183="Independent Director";
		String staffName183="chandrakant";
		int salary183=212000;
		String nativity183="terdal";
		String email183="chandrakant2004@gmail.com";
		long mobileNo183=9000000183L;

		String staffType184="Non Executive Director";
		String staffName184="sanjeev";
		int salary184=214000;
		String nativity184="rabkavi";
		String email184="sanjeev2004@gmail.com";
		long mobileNo184=9000000184L;

		String staffType185="Strategic Advisor";
		String staffName185="arunkumar";
		int salary185=216000;
		String nativity185="banahatti";
		String email185="arunkumar2004@gmail.com";
		long mobileNo185=9000000185L;

		String staffType186="Corporate Mentor";
		String staffName186="madan";
		int salary186=218000;
		String nativity186="muddebihal";
		String email186="madan2004@gmail.com";
		long mobileNo186=9000000186L;

		String staffType187="Leadership Coach";
		String staffName187="srinath";
		int salary187=220000;
		String nativity187="indi";
		String email187="srinath2004@gmail.com";
		long mobileNo187=9000000187L;

		String staffType188="Organizational Psychologist";
		String staffName188="ananya";
		int salary188=222000;
		String nativity188="basavana bagewadi";
		String email188="ananya2004@gmail.com";
		long mobileNo188=9000000188L;

		String staffType189="Executive Counselor";
		String staffName189="meera";
		int salary189=224000;
		String nativity189="sindagi";
		String email189="meera2004@gmail.com";
		long mobileNo189=9000000189L;

		String staffType190="Corporate Ombudsman";
		String staffName190="haripriya";
		int salary190=226000;
		String nativity190="devar hippargi";
		String email190="haripriya2004@gmail.com";
		long mobileNo190=9000000190L;

		String staffType191="Ethics Officer";
		String staffName191="nandakumar";
		int salary191=228000;
		String nativity191="kalakeri";
		String email191="nandakumar2004@gmail.com";
		long mobileNo191=9000000191L;

		String staffType192="Sustainability Head";
		String staffName192="kavitha";
		int salary192=230000;
		String nativity192="talikoti";
		String email192="kavitha2004@gmail.com";
		long mobileNo192=9000000192L;

		String staffType193="ESG Director";
		String staffName193="priyanka";
		int salary193=232000;
		String nativity193="chadchan";
		String email193="priyanka2004@gmail.com";
		long mobileNo193=9000000193L;

		String staffType194="Social Impact Lead";
		String staffName194="roopa";
		int salary194=234000;
		String nativity194="alur";
		String email194="roopa2004@gmail.com";
		long mobileNo194=9000000194L;

		String staffType195="Public Relations Head";
		String staffName195="sneha";
		int salary195=236000;
		String nativity195="mudhol";
		String email195="sneha2004@gmail.com";
		long mobileNo195=9000000195L;

		String staffType196="Brand Director";
		String staffName196="shweta";
		int salary196=238000;
		String nativity196="jamkhandi";
		String email196="shweta2004@gmail.com";
		long mobileNo196=9000000196L;

		String staffType197="Communications Head";
		String staffName197="aishwarya";
		int salary197=240000;
		String nativity197="bagalkot";
		String email197="aishwarya2004@gmail.com";
		long mobileNo197=9000000197L;

		String staffType198="Corporate Affairs Head";
		String staffName198="neelam";
		int salary198=242000;
		String nativity198="ilkal";
		String email198="neelam2004@gmail.com";
		long mobileNo198=9000000198L;

		String staffType199="Global Ambassador";
		String staffName199="ruturaj";
		int salary199=244000;
		String nativity199="hungund";
		String email199="ruturaj2004@gmail.com";
		long mobileNo199=9000000199L;


		
		//to print	hotel details
		String hotelName="hotel sk inn";

		String location="gurumitkal";
		int noOfRooms=50;
		float rating=8.5f;
		boolean vegOnly=true;

		String location1="narayanpet";
		int noOfRooms1=30;
		float rating1=8.0f;
		boolean vegOnly1=false;

		String location2="kalaburagi";
		int noOfRooms2=40;
		float rating2=7.8f;
		boolean vegOnly2=true;

		String location3="yadgir";
		int noOfRooms3=25;
		float rating3=7.5f;
		boolean vegOnly3=false;

		String location4="raichur";
		int noOfRooms4=60;
		float rating4=8.9f;
		boolean vegOnly4=true;

		String location5="bidar";
		int noOfRooms5=35;
		float rating5=7.9f;
		boolean vegOnly5=false;

		String location6="shahapur";
		int noOfRooms6=20;
		float rating6=7.2f;
		boolean vegOnly6=true;

		String location7="sedam";
		int noOfRooms7=28;
		float rating7=7.6f;
		boolean vegOnly7=false;

		String location8="afzalpur";
		int noOfRooms8=22;
		float rating8=7.1f;
		boolean vegOnly8=true;

		String location9="chittapur";
		int noOfRooms9=33;
		float rating9=7.7f;
		boolean vegOnly9=false;

		String location10="humnabad";
		int noOfRooms10=45;
		float rating10=8.2f;
		boolean vegOnly10=true;

		String location11="aland";
		int noOfRooms11=26;
		float rating11=7.3f;
		boolean vegOnly11=false;

		String location12="devadurga";
		int noOfRooms12=24;
		float rating12=7.0f;
		boolean vegOnly12=true;

		String location13="lingasugur";
		int noOfRooms13=38;
		float rating13=7.8f;
		boolean vegOnly13=false;

		String location14="manvi";
		int noOfRooms14=42;
		float rating14=8.1f;
		boolean vegOnly14=true;

		String location15="sindhanur";
		int noOfRooms15=55;
		float rating15=8.6f;
		boolean vegOnly15=false;

		String location16="koppal";
		int noOfRooms16=48;
		float rating16=8.3f;
		boolean vegOnly16=true;

		String location17="gangavathi";
		int noOfRooms17=36;
		float rating17=7.9f;
		boolean vegOnly17=false;

		String location18="hosapete";
		int noOfRooms18=65;
		float rating18=8.8f;
		boolean vegOnly18=true;

		String location19="ballari";
		int noOfRooms19=70;
		float rating19=9.0f;
		boolean vegOnly19=false;

		String location20="siruguppa";
		int noOfRooms20=29;
		float rating20=7.4f;
		boolean vegOnly20=true;

		String location21="kudligi";
		int noOfRooms21=23;
		float rating21=7.1f;
		boolean vegOnly21=false;

		String location22="sandur";
		int noOfRooms22=31;
		float rating22=7.6f;
		boolean vegOnly22=true;

		String location23="hadagali";
		int noOfRooms23=27;
		float rating23=7.3f;
		boolean vegOnly23=false;

		String location24="harapanahalli";
		int noOfRooms24=34;
		float rating24=7.7f;
		boolean vegOnly24=true;

		String location25="davanagere";
		int noOfRooms25=80;
		float rating25=9.1f;
		boolean vegOnly25=false;

		String location26="chitradurga";
		int noOfRooms26=58;
		float rating26=8.5f;
		boolean vegOnly26=true;

		String location27="hiriyur";
		int noOfRooms27=32;
		float rating27=7.6f;
		boolean vegOnly27=false;

		String location28="molakalmuru";
		int noOfRooms28=21;
		float rating28=7.0f;
		boolean vegOnly28=true;

		String location29="holalkere";
		int noOfRooms29=24;
		float rating29=7.2f;
		boolean vegOnly29=false;

		String location30="hosadurga";
		int noOfRooms30=26;
		float rating30=7.3f;
		boolean vegOnly30=true;

		String location31="chalakere";
		int noOfRooms31=37;
		float rating31=7.8f;
		boolean vegOnly31=false;

		String location32="tumakuru";
		int noOfRooms32=75;
		float rating32=9.0f;
		boolean vegOnly32=true;

		String location33="gubbi";
		int noOfRooms33=28;
		float rating33=7.4f;
		boolean vegOnly33=false;

		String location34="tiptur";
		int noOfRooms34=41;
		float rating34=8.0f;
		boolean vegOnly34=true;

		String location35="kunigal";
		int noOfRooms35=30;
		float rating35=7.5f;
		boolean vegOnly35=false;

		String location36="madhugiri";
		int noOfRooms36=22;
		float rating36=7.1f;
		boolean vegOnly36=true;

		String location37="koratagere";
		int noOfRooms37=20;
		float rating37=7.0f;
		boolean vegOnly37=false;

		String location38="sira";
		int noOfRooms38=39;
		float rating38=7.9f;
		boolean vegOnly38=true;

		String location39="pavagada";
		int noOfRooms39=27;
		float rating39=7.3f;
		boolean vegOnly39=false;

		String location40="bangalore";
		int noOfRooms40=120;
		float rating40=9.3f;
		boolean vegOnly40=true;

		String location41="nelamangala";
		int noOfRooms41=44;
		float rating41=8.1f;
		boolean vegOnly41=false;

		String location42="magadi";
		int noOfRooms42=31;
		float rating42=7.6f;
		boolean vegOnly42=true;

		String location43="ramanagara";
		int noOfRooms43=35;
		float rating43=7.8f;
		boolean vegOnly43=false;

		String location44="kanakapura";
		int noOfRooms44=29;
		float rating44=7.4f;
		boolean vegOnly44=true;

		String location45="channapatna";
		int noOfRooms45=33;
		float rating45=7.7f;
		boolean vegOnly45=false;

		String location46="mandya";
		int noOfRooms46=52;
		float rating46=8.4f;
		boolean vegOnly46=true;

		String location47="srirangapatna";
		int noOfRooms47=34;
		float rating47=7.8f;
		boolean vegOnly47=false;

		String location48="mysore";
		int noOfRooms48=90;
		float rating48=9.2f;
		boolean vegOnly48=true;

		String location49="nanjangud";
		int noOfRooms49=28;
		float rating49=7.5f;
		boolean vegOnly49=false;

		String location50="hunsur";
		int noOfRooms50=25;
		float rating50=7.3f;
		boolean vegOnly50=true;

		String location51="periyapatna";
		int noOfRooms51=22;
		float rating51=7.1f;
		boolean vegOnly51=false;

		String location52="krishnarajanagara";
		int noOfRooms52=30;
		float rating52=7.6f;
		boolean vegOnly52=true;

		String location53="tirumakudal";
		int noOfRooms53=21;
		float rating53=7.0f;
		boolean vegOnly53=false;

		String location54="malavalli";
		int noOfRooms54=26;
		float rating54=7.3f;
		boolean vegOnly54=true;

		String location55="pandavapura";
		int noOfRooms55=24;
		float rating55=7.2f;
		boolean vegOnly55=false;

		String location56="nagamangala";
		int noOfRooms56=27;
		float rating56=7.4f;
		boolean vegOnly56=true;

		String location57="bellur";
		int noOfRooms57=20;
		float rating57=7.0f;
		boolean vegOnly57=false;

		String location58="kikkeri";
		int noOfRooms58=23;
		float rating58=7.1f;
		boolean vegOnly58=true;

		String location59="melukote";
		int noOfRooms59=18;
		float rating59=6.9f;
		boolean vegOnly59=false;

		
		//====================================invoking a methods=================================================//
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
		Hotel.ownerInfo(gstinNo,ownerName,age,address,taxPaid);
		Hotel.ownerInfo(gstinNo,ownerName1,age1,address,taxPaid1);
		Hotel.ownerInfo(gstinNo,ownerName2,age2,address,taxPaid2);
		Hotel.ownerInfo(gstinNo,ownerName3,age3,address,taxPaid3);
		Hotel.ownerInfo(gstinNo,ownerName4,age4,address,taxPaid4);
		
			
			
			
		//to print	staff details
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		Hotel.staffInfo(staffType1, staffName1, salary1, nativity1, email1, mobileNo1);
		Hotel.staffInfo(staffType2, staffName2, salary2, nativity2, email2, mobileNo2);
		Hotel.staffInfo(staffType3, staffName3, salary3, nativity3, email3, mobileNo3);
		Hotel.staffInfo(staffType4, staffName4, salary4, nativity4, email4, mobileNo4);
		Hotel.staffInfo(staffType5, staffName5, salary5, nativity5, email5, mobileNo5);
		Hotel.staffInfo(staffType6,staffName6, salary6, nativity6, email6, mobileNo6);
		Hotel.staffInfo(staffType7, staffName7, salary7, nativity7, email7, mobileNo7);
		Hotel.staffInfo(staffType8, staffName8, salary8, nativity8, email8, mobileNo8);
		Hotel.staffInfo(staffType9, staffName9, salary9, nativity9, email9, mobileNo9);
		Hotel.staffInfo(staffType10, staffName10, salary10, nativity10, email10, mobileNo10);
		
		Hotel.staffInfo(staffType11,staffName11, salary11, nativity11, email11, mobileNo11);
		Hotel.staffInfo(staffType12, staffName12, salary12, nativity12, email12, mobileNo12);
		Hotel.staffInfo(staffType13, staffName13, salary13, nativity13, email13, mobileNo13);
		Hotel.staffInfo(staffType14,staffName14, salary14, nativity14, email14, mobileNo14);
		Hotel.staffInfo(staffType15, staffName15, salary15, nativity15, email15, mobileNo15);
		Hotel.staffInfo(staffType16,staffName16, salary16, nativity16, email16, mobileNo16);
		Hotel.staffInfo(staffType17, staffName17, salary17, nativity17, email17, mobileNo17);
		Hotel.staffInfo(staffType18, staffName18, salary18, nativity18, email18, mobileNo18);
		Hotel.staffInfo(staffType19, staffName19, salary19, nativity19, email19, mobileNo19);
		Hotel.staffInfo(staffType20, staffName20, salary20, nativity20, email20, mobileNo20);
		
		Hotel.staffInfo(staffType21, staffName21, salary21, nativity21, email21, mobileNo21);
		Hotel.staffInfo(staffType22, staffName22, salary22, nativity22, email22, mobileNo22);
		Hotel.staffInfo(staffType23, staffName23, salary23, nativity23, email23, mobileNo23);
		Hotel.staffInfo(staffType24, staffName24, salary24, nativity24, email24, mobileNo24);
		Hotel.staffInfo(staffType25, staffName25, salary25, nativity25, email25, mobileNo25);
		Hotel.staffInfo(staffType26, staffName26, salary26, nativity26, email26, mobileNo26);
		Hotel.staffInfo(staffType27, staffName27, salary27, nativity27, email27, mobileNo27);
		Hotel.staffInfo(staffType28, staffName28, salary28, nativity28, email28, mobileNo28);
		Hotel.staffInfo(staffType29, staffName29, salary29, nativity29, email29, mobileNo29);
		Hotel.staffInfo(staffType30, staffName30, salary30, nativity30, email30, mobileNo30);
		
		Hotel.staffInfo(staffType31, staffName31, salary31, nativity31, email31, mobileNo31);
		Hotel.staffInfo(staffType32, staffName32, salary32, nativity32, email32, mobileNo32);
		Hotel.staffInfo(staffType33, staffName33, salary33, nativity33, email33, mobileNo33);
		Hotel.staffInfo(staffType34, staffName34, salary34, nativity34, email34, mobileNo34);
		Hotel.staffInfo(staffType35, staffName35, salary35, nativity35, email35, mobileNo35);
		Hotel.staffInfo(staffType36, staffName36, salary36, nativity36, email36, mobileNo36);
		Hotel.staffInfo(staffType37, staffName37, salary37, nativity37, email37, mobileNo37);
		Hotel.staffInfo(staffType38, staffName38, salary38, nativity38, email38, mobileNo38);
		Hotel.staffInfo(staffType39, staffName39, salary39, nativity39, email39, mobileNo39);
		Hotel.staffInfo(staffType40, staffName40, salary40, nativity40, email40, mobileNo40);
		
		Hotel.staffInfo(staffType41, staffName41, salary41, nativity41, email41, mobileNo41);
		Hotel.staffInfo(staffType42, staffName42, salary42, nativity42, email42, mobileNo42);
		Hotel.staffInfo(staffType43, staffName43, salary43, nativity43, email43, mobileNo43);
		Hotel.staffInfo(staffType44, staffName44, salary44, nativity44, email44, mobileNo44);
		Hotel.staffInfo(staffType45, staffName45, salary45, nativity45, email45, mobileNo45);
		Hotel.staffInfo(staffType46, staffName46, salary46, nativity46, email46, mobileNo46);
		Hotel.staffInfo(staffType47, staffName47, salary47, nativity47, email47, mobileNo47);
		Hotel.staffInfo(staffType48, staffName48, salary48, nativity48, email48, mobileNo48);
		Hotel.staffInfo(staffType49, staffName49, salary49, nativity49, email49, mobileNo49);
		Hotel.staffInfo(staffType50, staffName50, salary50, nativity50, email50, mobileNo50);
		
		Hotel.staffInfo(staffType51, staffName51, salary51, nativity51, email51, mobileNo51);
		Hotel.staffInfo(staffType52, staffName52, salary52, nativity52, email52, mobileNo52);
		Hotel.staffInfo(staffType53, staffName53, salary53, nativity53, email53, mobileNo53);
		Hotel.staffInfo(staffType54, staffName54, salary54, nativity54, email54, mobileNo54);
		Hotel.staffInfo(staffType55, staffName55, salary55, nativity55, email55, mobileNo55);
		Hotel.staffInfo(staffType56, staffName56, salary56, nativity56, email56, mobileNo56);
		Hotel.staffInfo(staffType57, staffName57, salary57, nativity57, email57, mobileNo57);
		Hotel.staffInfo(staffType58, staffName58, salary58, nativity58, email58, mobileNo58);
		Hotel.staffInfo(staffType59, staffName59, salary59, nativity59, email59, mobileNo59);
		Hotel.staffInfo(staffType60, staffName60, salary60, nativity60, email60, mobileNo60);

		Hotel.staffInfo(staffType61, staffName61, salary61, nativity61, email61, mobileNo61);
		Hotel.staffInfo(staffType62, staffName62, salary62, nativity62, email62, mobileNo62);
		Hotel.staffInfo(staffType63, staffName63, salary63, nativity63, email63, mobileNo63);
		Hotel.staffInfo(staffType64, staffName64, salary64, nativity64, email64, mobileNo64);
		Hotel.staffInfo(staffType65, staffName65, salary65, nativity65, email65, mobileNo65);
		Hotel.staffInfo(staffType66, staffName66, salary66, nativity66, email66, mobileNo66);
		Hotel.staffInfo(staffType67, staffName67, salary67, nativity67, email67, mobileNo67);
		Hotel.staffInfo(staffType68, staffName68, salary68, nativity68, email68, mobileNo68);
		Hotel.staffInfo(staffType69, staffName69, salary69, nativity69, email69, mobileNo69);
		Hotel.staffInfo(staffType70, staffName70, salary70, nativity70, email70, mobileNo70);

		Hotel.staffInfo(staffType71, staffName71, salary71, nativity71, email71, mobileNo71);
		Hotel.staffInfo(staffType72, staffName72, salary72, nativity72, email72, mobileNo72);
		Hotel.staffInfo(staffType73, staffName73, salary73, nativity73, email73, mobileNo73);
		Hotel.staffInfo(staffType74, staffName74, salary74, nativity74, email74, mobileNo74);
		Hotel.staffInfo(staffType75, staffName75, salary75, nativity75, email75, mobileNo75);
		Hotel.staffInfo(staffType76, staffName76, salary76, nativity76, email76, mobileNo76);
		Hotel.staffInfo(staffType77, staffName77, salary77, nativity77, email77, mobileNo77);
		Hotel.staffInfo(staffType78, staffName78, salary78, nativity78, email78, mobileNo78);
		Hotel.staffInfo(staffType79, staffName79, salary79, nativity79, email79, mobileNo79);
		Hotel.staffInfo(staffType80, staffName80, salary80, nativity80, email80, mobileNo80);

		Hotel.staffInfo(staffType81, staffName81, salary81, nativity81, email81, mobileNo81);
		Hotel.staffInfo(staffType82, staffName82, salary82, nativity82, email82, mobileNo82);
		Hotel.staffInfo(staffType83, staffName83, salary83, nativity83, email83, mobileNo83);
		Hotel.staffInfo(staffType84, staffName84, salary84, nativity84, email84, mobileNo84);
		Hotel.staffInfo(staffType85, staffName85, salary85, nativity85, email85, mobileNo85);
		Hotel.staffInfo(staffType86, staffName86, salary86, nativity86, email86, mobileNo86);
		Hotel.staffInfo(staffType87, staffName87, salary87, nativity87, email87, mobileNo87);
		Hotel.staffInfo(staffType88, staffName88, salary88, nativity88, email88, mobileNo88);
		Hotel.staffInfo(staffType89, staffName89, salary89, nativity89, email89, mobileNo89);
		Hotel.staffInfo(staffType90, staffName90, salary90, nativity90, email90, mobileNo90);

		Hotel.staffInfo(staffType91, staffName91, salary91, nativity91, email91, mobileNo91);
		Hotel.staffInfo(staffType92, staffName92, salary92, nativity92, email92, mobileNo92);
		Hotel.staffInfo(staffType93, staffName93, salary93, nativity93, email93, mobileNo93);
		Hotel.staffInfo(staffType94, staffName94, salary94, nativity94, email94, mobileNo94);
		Hotel.staffInfo(staffType95, staffName95, salary95, nativity95, email95, mobileNo95);
		Hotel.staffInfo(staffType96, staffName96, salary96, nativity96, email96, mobileNo96);
		Hotel.staffInfo(staffType97, staffName97, salary97, nativity97, email97, mobileNo97);
		Hotel.staffInfo(staffType98, staffName98, salary98, nativity98, email98, mobileNo98);
		Hotel.staffInfo(staffType99, staffName99, salary99, nativity99, email99, mobileNo99);
		Hotel.staffInfo(staffType100, staffName100, salary100, nativity100, email100, mobileNo100);

		Hotel.staffInfo(staffType101, staffName101, salary101, nativity101, email101, mobileNo101);
		Hotel.staffInfo(staffType102, staffName102, salary102, nativity102, email102, mobileNo102);
		Hotel.staffInfo(staffType103, staffName103, salary103, nativity103, email103, mobileNo103);
		Hotel.staffInfo(staffType104, staffName104, salary104, nativity104, email104, mobileNo104);
		Hotel.staffInfo(staffType105, staffName105, salary105, nativity105, email105, mobileNo105);
		Hotel.staffInfo(staffType106, staffName106, salary106, nativity106, email106, mobileNo106);
		Hotel.staffInfo(staffType107, staffName107, salary107, nativity107, email107, mobileNo107);
		Hotel.staffInfo(staffType108, staffName108, salary108, nativity108, email108, mobileNo108);
		Hotel.staffInfo(staffType109, staffName109, salary109, nativity109, email109, mobileNo109);
		Hotel.staffInfo(staffType110, staffName110, salary110, nativity110, email110, mobileNo110);

		Hotel.staffInfo(staffType111, staffName111, salary111, nativity111, email111, mobileNo111);
		Hotel.staffInfo(staffType112, staffName112, salary112, nativity112, email112, mobileNo112);
		Hotel.staffInfo(staffType113, staffName113, salary113, nativity113, email113, mobileNo113);
		Hotel.staffInfo(staffType114, staffName114, salary114, nativity114, email114, mobileNo114);
		Hotel.staffInfo(staffType115, staffName115, salary115, nativity115, email115, mobileNo115);
		Hotel.staffInfo(staffType116, staffName116, salary116, nativity116, email116, mobileNo116);
		Hotel.staffInfo(staffType117, staffName117, salary117, nativity117, email117, mobileNo117);
		Hotel.staffInfo(staffType118, staffName118, salary118, nativity118, email118, mobileNo118);
		Hotel.staffInfo(staffType119, staffName119, salary119, nativity119, email119, mobileNo119);
		Hotel.staffInfo(staffType120, staffName120, salary120, nativity120, email120, mobileNo120);

		Hotel.staffInfo(staffType121, staffName121, salary121, nativity121, email121, mobileNo121);
		Hotel.staffInfo(staffType122, staffName122, salary122, nativity122, email122, mobileNo122);
		Hotel.staffInfo(staffType123, staffName123, salary123, nativity123, email123, mobileNo123);
		Hotel.staffInfo(staffType124, staffName124, salary124, nativity124, email124, mobileNo124);
		Hotel.staffInfo(staffType125, staffName125, salary125, nativity125, email125, mobileNo125);
		Hotel.staffInfo(staffType126, staffName126, salary126, nativity126, email126, mobileNo126);
		Hotel.staffInfo(staffType127, staffName127, salary127, nativity127, email127, mobileNo127);
		Hotel.staffInfo(staffType128, staffName128, salary128, nativity128, email128, mobileNo128);
		Hotel.staffInfo(staffType129, staffName129, salary129, nativity129, email129, mobileNo129);
		Hotel.staffInfo(staffType130, staffName130, salary130, nativity130, email130, mobileNo130);

		Hotel.staffInfo(staffType131, staffName131, salary131, nativity131, email131, mobileNo131);
		Hotel.staffInfo(staffType132, staffName132, salary132, nativity132, email132, mobileNo132);
		Hotel.staffInfo(staffType133, staffName133, salary133, nativity133, email133, mobileNo133);
		Hotel.staffInfo(staffType134, staffName134, salary134, nativity134, email134, mobileNo134);
		Hotel.staffInfo(staffType135, staffName135, salary135, nativity135, email135, mobileNo135);
		Hotel.staffInfo(staffType136, staffName136, salary136, nativity136, email136, mobileNo136);
		Hotel.staffInfo(staffType137, staffName137, salary137, nativity137, email137, mobileNo137);
		Hotel.staffInfo(staffType138, staffName138, salary138, nativity138, email138, mobileNo138);
		Hotel.staffInfo(staffType139, staffName139, salary139, nativity139, email139, mobileNo139);
		Hotel.staffInfo(staffType140, staffName140, salary140, nativity140, email140, mobileNo140);

		Hotel.staffInfo(staffType141, staffName141, salary141, nativity141, email141, mobileNo141);
		Hotel.staffInfo(staffType142, staffName142, salary142, nativity142, email142, mobileNo142);
		Hotel.staffInfo(staffType143, staffName143, salary143, nativity143, email143, mobileNo143);
		Hotel.staffInfo(staffType144, staffName144, salary144, nativity144, email144, mobileNo144);
		Hotel.staffInfo(staffType145, staffName145, salary145, nativity145, email145, mobileNo145);
		Hotel.staffInfo(staffType146, staffName146, salary146, nativity146, email146, mobileNo146);
		Hotel.staffInfo(staffType147, staffName147, salary147, nativity147, email147, mobileNo147);
		Hotel.staffInfo(staffType148, staffName148, salary148, nativity148, email148, mobileNo148);
		Hotel.staffInfo(staffType149, staffName149, salary149, nativity149, email149, mobileNo149);
		Hotel.staffInfo(staffType150, staffName150, salary150, nativity150, email150, mobileNo150);

		Hotel.staffInfo(staffType151, staffName151, salary151, nativity151, email151, mobileNo151);
		Hotel.staffInfo(staffType152, staffName152, salary152, nativity152, email152, mobileNo152);
		Hotel.staffInfo(staffType153, staffName153, salary153, nativity153, email153, mobileNo153);
		Hotel.staffInfo(staffType154, staffName154, salary154, nativity154, email154, mobileNo154);
		Hotel.staffInfo(staffType155, staffName155, salary155, nativity155, email155, mobileNo155);
		Hotel.staffInfo(staffType156, staffName156, salary156, nativity156, email156, mobileNo156);
		Hotel.staffInfo(staffType157, staffName157, salary157, nativity157, email157, mobileNo157);
		Hotel.staffInfo(staffType158, staffName158, salary158, nativity158, email158, mobileNo158);
		Hotel.staffInfo(staffType159, staffName159, salary159, nativity159, email159, mobileNo159);
		Hotel.staffInfo(staffType160, staffName160, salary160, nativity160, email160, mobileNo160);

		Hotel.staffInfo(staffType161, staffName161, salary161, nativity161, email161, mobileNo161);
		Hotel.staffInfo(staffType162, staffName162, salary162, nativity162, email162, mobileNo162);
		Hotel.staffInfo(staffType163, staffName163, salary163, nativity163, email163, mobileNo163);
		Hotel.staffInfo(staffType164, staffName164, salary164, nativity164, email164, mobileNo164);
		Hotel.staffInfo(staffType165, staffName165, salary165, nativity165, email165, mobileNo165);
		Hotel.staffInfo(staffType166, staffName166, salary166, nativity166, email166, mobileNo166);
		Hotel.staffInfo(staffType167, staffName167, salary167, nativity167, email167, mobileNo167);
		Hotel.staffInfo(staffType168, staffName168, salary168, nativity168, email168, mobileNo168);
		Hotel.staffInfo(staffType169, staffName169, salary169, nativity169, email169, mobileNo169);
		Hotel.staffInfo(staffType170, staffName170, salary170, nativity170, email170, mobileNo170);

		Hotel.staffInfo(staffType171, staffName171, salary171, nativity171, email171, mobileNo171);
		Hotel.staffInfo(staffType172, staffName172, salary172, nativity172, email172, mobileNo172);
		Hotel.staffInfo(staffType173, staffName173, salary173, nativity173, email173, mobileNo173);
		Hotel.staffInfo(staffType174, staffName174, salary174, nativity174, email174, mobileNo174);
		Hotel.staffInfo(staffType175, staffName175, salary175, nativity175, email175, mobileNo175);
		Hotel.staffInfo(staffType176, staffName176, salary176, nativity176, email176, mobileNo176);
		Hotel.staffInfo(staffType177, staffName177, salary177, nativity177, email177, mobileNo177);
		Hotel.staffInfo(staffType178, staffName178, salary178, nativity178, email178, mobileNo178);
		Hotel.staffInfo(staffType179, staffName179, salary179, nativity179, email179, mobileNo179);
		Hotel.staffInfo(staffType180, staffName180, salary180, nativity180, email180, mobileNo180);

		Hotel.staffInfo(staffType181, staffName181, salary181, nativity181, email181, mobileNo181);
		Hotel.staffInfo(staffType182, staffName182, salary182, nativity182, email182, mobileNo182);
		Hotel.staffInfo(staffType183, staffName183, salary183, nativity183, email183, mobileNo183);
		Hotel.staffInfo(staffType184, staffName184, salary184, nativity184, email184, mobileNo184);
		Hotel.staffInfo(staffType185, staffName185, salary185, nativity185, email185, mobileNo185);
		Hotel.staffInfo(staffType186, staffName186, salary186, nativity186, email186, mobileNo186);
		Hotel.staffInfo(staffType187, staffName187, salary187, nativity187, email187, mobileNo187);
		Hotel.staffInfo(staffType188, staffName188, salary188, nativity188, email188, mobileNo188);
		Hotel.staffInfo(staffType189, staffName189, salary189, nativity189, email189, mobileNo189);
		Hotel.staffInfo(staffType190, staffName190, salary190, nativity190, email190, mobileNo190);

		Hotel.staffInfo(staffType191, staffName191, salary191, nativity191, email191, mobileNo191);
		Hotel.staffInfo(staffType192, staffName192, salary192, nativity192, email192, mobileNo192);
		Hotel.staffInfo(staffType193, staffName193, salary193, nativity193, email193, mobileNo193);
		Hotel.staffInfo(staffType194, staffName194, salary194, nativity194, email194, mobileNo194);
		Hotel.staffInfo(staffType195, staffName195, salary195, nativity195, email195, mobileNo195);
		Hotel.staffInfo(staffType196, staffName196, salary196, nativity196, email196, mobileNo196);
		Hotel.staffInfo(staffType197, staffName197, salary197, nativity197, email197, mobileNo197);
		Hotel.staffInfo(staffType198, staffName198, salary198, nativity198, email198, mobileNo198);
		Hotel.staffInfo(staffType199, staffName199, salary199, nativity199, email199, mobileNo199);
		
		
	
		//to print	hotel details
		Hotel.hotelInfo(hotelName, location, noOfRooms, rating, vegOnly);
		Hotel.hotelInfo(hotelName, location1, noOfRooms1, rating1, vegOnly1);
		Hotel.hotelInfo(hotelName, location2, noOfRooms2, rating2, vegOnly2);
		Hotel.hotelInfo(hotelName, location3, noOfRooms3, rating3, vegOnly3);
		Hotel.hotelInfo(hotelName, location4, noOfRooms4, rating4, vegOnly4);
		Hotel.hotelInfo(hotelName, location5, noOfRooms5, rating5, vegOnly5);
		Hotel.hotelInfo(hotelName, location6, noOfRooms6, rating6, vegOnly6);
		Hotel.hotelInfo(hotelName, location7, noOfRooms7, rating7, vegOnly7);
		Hotel.hotelInfo(hotelName, location8, noOfRooms8, rating8, vegOnly8);
		Hotel.hotelInfo(hotelName, location9, noOfRooms9, rating9, vegOnly9);

		Hotel.hotelInfo(hotelName, location10, noOfRooms10, rating10, vegOnly10);
		Hotel.hotelInfo(hotelName, location11, noOfRooms11, rating11, vegOnly11);
		Hotel.hotelInfo(hotelName, location12, noOfRooms12, rating12, vegOnly12);
		Hotel.hotelInfo(hotelName, location13, noOfRooms13, rating13, vegOnly13);
		Hotel.hotelInfo(hotelName, location14, noOfRooms14, rating14, vegOnly14);
		Hotel.hotelInfo(hotelName, location15, noOfRooms15, rating15, vegOnly15);
		Hotel.hotelInfo(hotelName, location16, noOfRooms16, rating16, vegOnly16);
		Hotel.hotelInfo(hotelName, location17, noOfRooms17, rating17, vegOnly17);
		Hotel.hotelInfo(hotelName, location18, noOfRooms18, rating18, vegOnly18);
		Hotel.hotelInfo(hotelName, location19, noOfRooms19, rating19, vegOnly19);

		Hotel.hotelInfo(hotelName, location20, noOfRooms20, rating20, vegOnly20);
		Hotel.hotelInfo(hotelName, location21, noOfRooms21, rating21, vegOnly21);
		Hotel.hotelInfo(hotelName, location22, noOfRooms22, rating22, vegOnly22);
		Hotel.hotelInfo(hotelName, location23, noOfRooms23, rating23, vegOnly23);
		Hotel.hotelInfo(hotelName, location24, noOfRooms24, rating24, vegOnly24);
		Hotel.hotelInfo(hotelName, location25, noOfRooms25, rating25, vegOnly25);
		Hotel.hotelInfo(hotelName, location26, noOfRooms26, rating26, vegOnly26);
		Hotel.hotelInfo(hotelName, location27, noOfRooms27, rating27, vegOnly27);
		Hotel.hotelInfo(hotelName, location28, noOfRooms28, rating28, vegOnly28);
		Hotel.hotelInfo(hotelName, location29, noOfRooms29, rating29, vegOnly29);

		Hotel.hotelInfo(hotelName, location30, noOfRooms30, rating30, vegOnly30);
		Hotel.hotelInfo(hotelName, location31, noOfRooms31, rating31, vegOnly31);
		Hotel.hotelInfo(hotelName, location32, noOfRooms32, rating32, vegOnly32);
		Hotel.hotelInfo(hotelName, location33, noOfRooms33, rating33, vegOnly33);
		Hotel.hotelInfo(hotelName, location34, noOfRooms34, rating34, vegOnly34);
		Hotel.hotelInfo(hotelName, location35, noOfRooms35, rating35, vegOnly35);
		Hotel.hotelInfo(hotelName, location36, noOfRooms36, rating36, vegOnly36);
		Hotel.hotelInfo(hotelName, location37, noOfRooms37, rating37, vegOnly37);
		Hotel.hotelInfo(hotelName, location38, noOfRooms38, rating38, vegOnly38);
		Hotel.hotelInfo(hotelName, location39, noOfRooms39, rating39, vegOnly39);

		Hotel.hotelInfo(hotelName, location40, noOfRooms40, rating40, vegOnly40);
		Hotel.hotelInfo(hotelName, location41, noOfRooms41, rating41, vegOnly41);
		Hotel.hotelInfo(hotelName, location42, noOfRooms42, rating42, vegOnly42);
		Hotel.hotelInfo(hotelName, location43, noOfRooms43, rating43, vegOnly43);
		Hotel.hotelInfo(hotelName, location44, noOfRooms44, rating44, vegOnly44);
		Hotel.hotelInfo(hotelName, location45, noOfRooms45, rating45, vegOnly45);
		Hotel.hotelInfo(hotelName, location46, noOfRooms46, rating46, vegOnly46);
		Hotel.hotelInfo(hotelName, location47, noOfRooms47, rating47, vegOnly47);
		Hotel.hotelInfo(hotelName, location48, noOfRooms48, rating48, vegOnly48);
		Hotel.hotelInfo(hotelName, location49, noOfRooms49, rating49, vegOnly49);

		Hotel.hotelInfo(hotelName, location50, noOfRooms50, rating50, vegOnly50);
		Hotel.hotelInfo(hotelName, location51, noOfRooms51, rating51, vegOnly51);
		Hotel.hotelInfo(hotelName, location52, noOfRooms52, rating52, vegOnly52);
		Hotel.hotelInfo(hotelName, location53, noOfRooms53, rating53, vegOnly53);
		Hotel.hotelInfo(hotelName, location54, noOfRooms54, rating54, vegOnly54);
		Hotel.hotelInfo(hotelName, location55, noOfRooms55, rating55, vegOnly55);
		Hotel.hotelInfo(hotelName, location56, noOfRooms56, rating56, vegOnly56);
		Hotel.hotelInfo(hotelName, location57, noOfRooms57, rating57, vegOnly57);
		Hotel.hotelInfo(hotelName, location58, noOfRooms58, rating58, vegOnly58);
		Hotel.hotelInfo(hotelName, location59, noOfRooms59, rating59, vegOnly59);
	}
}