class NumberStringOperations
{
	static void sumOfOddEven(int[] array)
	{
		int sum=0;
		int sum1=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				sum+=array[i];
			}
			else
			{
				sum1+=array[i];
			}			
		}
		System.out.println("odd sum: "+sum);
		System.out.println("even sum: "+sum1);
	}
	
	
	static void reverse()
	{
		String value="ramesh";
		String rval="";
		//for(String rval:value)
		for(int i=value.length()-1;i>=0;i--)
		{
			rval+=value.charAt(i);
		}
		System.out.println("original string: "+value);
		System.out.println("reversed string: "+rval);
	}
	
	public static void main(String... valu)
	{
		int[] array={3,4,5,22,45};
		sumOfOddEven(array);
		reverse();
	}
}