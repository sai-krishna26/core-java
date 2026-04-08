class ArrayReverse
{
	static int[] array={1,2,3,4,5};
	public static void main(String... val)
	{
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}
	}
}