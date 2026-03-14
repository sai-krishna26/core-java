class SelectionSort
{
	public static void main(String... values)
	{
		int[] numbers={6,3,10,0,7};
		
		for(int i=0;i<numbers.length-1;i++)
		{
			int smallIndex=i;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]<numbers[smallIndex])
				{
					smallIndex=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[smallIndex];
			numbers[smallIndex]=temp;
		}
		
		System.out.print("sorted numbers array:");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
	}
}