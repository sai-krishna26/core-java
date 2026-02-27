class SumOfIntegerNumbers
{
	public static void main(String... vlaues)
	{
		int number=12345;
		int total=0;
		int digit=0;
		while(number>0)
		{
			digit=number%10;
			total+=digit;
			number=number/10;
			
		}
		System.out.println(total);	
	}
}

/*	public static void main(String... vlaues)
	{
		int number=555556;
		String temp=Integer.toString(number);
		int total=0;
		
		for(int index=0;index<temp.length();index++)
		{
			total+=Integer.parseInt(temp.charAt(index)+"");//total += temp.charAt(index) - '0';
		}
		System.out.println(total);	
	}
*/