class UsingDecrement{
	static void decrement(){
		String product="IRONBOX";
		String reverse="";
		String original="";
		
		for(int i=product.length()-1;i>=0;i--){
			reverse=reverse+product.charAt(i);
		}
		System.out.println(reverse);
		
		for(int i=0;i<product.length();i++){
			original=original+product.charAt(i);
		}
		System.out.println(original);
	}
	
	public static void main(String[] args){
		decrement();
	}
}
