class StackOverflow{
	static void stack(){
		System.out.println("Hii");
		stack();
	}
	public static void main(String[] val){
		stack();
	}
}