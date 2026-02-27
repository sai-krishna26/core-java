class SumOfIntegerNumbers
{
	public static void main(String... vlaues)
	{
		int number=55555;
		String temp=Integer.toString(number);
		int total=0;
		
		for(int index=0;index<temp.length();index++)
		{
			total+=Integer.parseInt(temp.charAt(index)+"");//total += temp.charAt(index) - '0';
		}
		System.out.println(total);
	}
}