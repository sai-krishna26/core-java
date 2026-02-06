class Palindrome{
	
	static void string(){
		String word="RACECA";
		String rword="";
		
		for(int i=word.length()-1;i>=0;i--){
			rword=rword+word.charAt(i);
		}
		if(word.equals(rword)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not a Palindrome");
		}
	}

	
	public static void main(String[] args){
		string();
	}
}

