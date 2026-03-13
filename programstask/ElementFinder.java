//program to find an element in array

class ElementFinder
{
	public static void main(String... val)
	{
		int[] number={69,14,32,6,7};
		int findNumber=6;
		
		for(int i=0;i<number.length;i++)
		{
			if(findNumber==number[i])
			{
				System.out.println("number "+findNumber+" found!, at index "+i);
			}
		}
		
		
	}
}