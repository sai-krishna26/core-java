class CheckPalindrome
{
	public static void main(String... args)
	{
		int number=12321;
		String temp=number+"";//or  String temp=String.values(number);
		//or String temp = Integer.toString(number);
		String reversedNumber="";
		for (int index=temp.length()-1;index>=0;index--)
		{
			reversedNumber=reversedNumber+temp.charAt(index);
		}
		if(temp.equals(reversedNumber))
		{
			System.out.println("the number: "+number+" is palindrome");
		}
		else
		{
			System.out.println("the number: "+number+" is not a palindrome");
		}
	}
}