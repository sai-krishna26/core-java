//import java.array;
class TaskonArray{
	static void batToken(){
	
	int tokenofBats[]={1122334,1122335,1122336,1122337,1122338};
		
		System.out.println("tokens of bat are: ");
		System.out.println("token of bat 3: "+"IND"+tokenofBats[2]);
		System.out.println("token of bat 1: "+"IND"+tokenofBats[0]);
	
	}
	
	
	static void studentRollno(){
	byte rollnoofStudents[]={10,11,12,13};
	
		System.out.println("\nroll no's of students: ");
		System.out.println("roll no of student 1: "+rollnoofStudents[0]);
		System.out.println("roll no of student 3: "+rollnoofStudents[2]);
	}	
	
	
	static void profitofCrops(){
	short profit[]={15000,11000,25000,30000,5000};
	
		System.out.println("\nprofits's of crops according to years: ");
		System.out.println("profit in  year 4: "+profit[3]+" Rs");
		System.out.println("profit in year 2: "+profit[1]+" Rs");
	}	
	
	
	static void populationGrowth(){
		long population[]={7954448678L,8021407998L,80917349768L,8161972876L,8231613546L};
		
		System.out.println("\nworld population growth of last 5 years(2021-2025):");
		System.out.println("population of world at year 2021: "+population[0]);
		System.out.println("population of world at year 2025: "+population[4]);
	}
	
	static void bankBalance(){
		
		double balance[]={40000.098964445,50000.767666738,34000.098677543,44600.992345321,1000.757587543};
		
		System.out.println("\nchange in bank balance of a person from(jan-may): ");
		System.out.println("bank balance in january: "+balance[0]+" Rs");
		System.out.println("bank balance in march"+balance[2]+" Rs");
	}
	
	static void distanceDifference(){
		
		float distance[]={80.56544f,120.76456f,39.98764f,210.65437f,180.66884f};
		
		System.out.println("\nDistance from gurumital to other cities: ");
		System.out.println("distance form gurumital to gulberga: "+distance[0]+" Km's");
		System.out.println("distance form gurumital to Hyderabad: "+distance[3]+" Km's");
	}
	
	
	static void charstoASCII(){
	char ch[]={'A','*','#','>','}'};
		
		System.out.println("\ncharacter to ASCII: ");
		System.out.println("A's ASCII value is: "+(int)ch[0]);
		System.out.println("*'s ASCII value is: "+(int)ch[1]);
		System.out.println("#'s ASCII value is: "+(int)ch[2]);
		System.out.println(">'s ASCII value is: "+(int)ch[3]);
		System.out.println("}'s ASCII value is: "+(int)ch[4]);
	}
	
	static void amountCredited(){
		boolean scholarshipstatus[]={true,false,true,true,false};
		//boolean loan=false;
		//boolean pendingUpi=true;
		//boolean rentincome=flase
		
		System.out.println("\ntrue=payment done & false=payment pending");
		System.out.println("\nscholarship status since 5 years");
		System.out.println("about Scholarship year 2021: "+scholarshipstatus[0]);
		System.out.println("about Scholarship year 2022: "+scholarshipstatus[1]);
		System.out.println("about Scholarship year 2023: "+scholarshipstatus[2]);
		System.out.println("about Scholarship year 2024: "+scholarshipstatus[3]);
		System.out.println("about Scholarship year 2025: "+scholarshipstatus[4]);
		
	}
	
	public static void main(String[] val)
	{
			batToken();
			studentRollno();
			profitofCrops();
			populationGrowth();
			bankBalance();
			distanceDifference();
			charstoASCII();
			amountCredited();
	}
}