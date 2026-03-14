class InsertionSort
{
	public static void main(String...values)
	{
		int[] array={7,3,5,2,0};
		
		for(int i=1;i<array.length-1;i++)
		{
			int curr=array[i];
			int prev=i-1;
			
			while(prev>=0 && array[prev]>curr)
			{
				array[prev+1]=prev;
				prev--
			}
			array[prev+1]=curr;
		}
	}
}