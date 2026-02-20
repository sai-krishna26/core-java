class TaskonArrayContinues{
	
	static void crickters(){
		String cricktersNames[]={"kohli","rohit","dhoni","raina","yuvraj"};
		
		System.out.println("player 2: "+cricktersNames[2]);
		System.out.println("player 1: "+cricktersNames[0]);
	}
	
	static void scoreinwpl(){
		Integer score[]={12,20,6,15,1};
		
		System.out.println("score in over 1: "+score[0]);
		System.out.println("score in over 5: "+score[4]);
	}
	
	public static void main(String[] vals){
		crickters();
		scoreinwpl();
		
	}
}