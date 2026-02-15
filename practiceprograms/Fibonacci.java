//fibonacci  0 1 1 2 3 5 8 13......

class Fibonacci{
	static void fibb(){
		int a=0;
		int b=1;
		int n=100;
		
		System.out.println(a+" "+b+" ");
		for(int i=3;i<=n;i++){
		int c=a+b;
		System.out.println(c+" ");
		a=b;
		b=c;
		}
	}
	
public static void main(String[] x){
	
	fibb();
}
}
