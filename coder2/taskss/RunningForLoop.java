class RunningForLoop{
	
//1
	static void Document(){
		String doc[]={"abstract", "introduction","cerificate","aknwoledgement"};
		
		for(int i=0;i<doc.length;i++)
			System.out.println("\n"+doc[i]);
	}
	
//2	
	static void BatId(){
		int tokenofBats[]={1122334,1122335,1122336,1122337,1122338};

		for(int i=0;i<tokenofBats.length;i++)
			System.out.println("\n"+tokenofBats[i]);
	}
	
//3	
	static void profitofCrops(){
	short profit[]={15000,11000,25000,30000,5000};
	
		for(int i=0;i<profit.length;i++)
			System.out.println("/n"+profit[i]);

	} 

//4	
	static void studentRollno(){
	byte rollnoofStudents[]={10,11,12,13};
	
		for(int i=0;i<rollnoofStudents.length;i++)
			System.out.println("\n"+rollnoofStudents[i]);
	}

//5
	static void populationGrowth(){
		long population[]={7954448678L,8021407998L,80917349768L,8161972876L,8231613546L};
			
		for(int i=0;i<population.length;i++)
			System.out.println("\n"+population[i]);
	}

//6
	static void bankBalance(){
		double balance[]={40000.098964445,50000.767666738,34000.098677543,44600.992345321,1000.757587543};

		for(int i=0;i<balance.length;i++)
			System.out.println("\n"+balance[i]);
	}
	
//7
	static void distanceDifference(){
		float distance[]={80.56544f,120.76456f,39.98764f,210.65437f,180.66884f};
		
		for(int i=0;i<distance.length;i++)
			System.out.println("\n"+distance[i]);
	}
	
//8
	static void charstoASCII(){
	char ch[]={'A','*','#','>','}'};
		
		for(int i=0;i<ch.length;i++)
			System.out.println("\n"+ch[i]);
	}
	
//9
	static void amountCredited(){
		boolean scholarshipstatus[]={true,false,true,true,false};
		
		for(int i=0;i<scholarshipstatus.length;i++)
			System.out.println("\n"+scholarshipstatus[i]);
	}
	
//10
	static void crickters(){
		String cricktersNames[]={"kohli","rohit","dhoni","raina","yuvraj"};
		
		for(int i=0;i<cricktersNames.length;i++)
			System.out.println("\n"+cricktersNames[i]);
	}
	
	public static void main(String[] val){
		Document();
		BatId();
		profitofCrops();
		studentRollno();
		populationGrowth();
		bankBalance();
		distanceDifference();
		charstoASCII();
		amountCredited();
		crickters();
	}
}