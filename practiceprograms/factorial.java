class factorial
{
	static void factnor(long number)
	{
		//number=4;
		
		int fact=1;
		
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void main(String val[])
	{
		factnor(7);
	}
}