class ReversingString2
{
	public static void main(String[] values)
	{
		String word="MAMAS";
		String reversedWord="";
		for(int index=word.length()-1;index>=0;index--)
		{
			reversedWord=reversedWord+word.charAt(index);
		}
		System.out.println(reversedWord);
	}
}		