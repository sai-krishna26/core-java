class SortingArray
{
	int[] array;
	
	SortingArray(int[] array)
	{
		this.array=array;
	}
	
	void sortArray()
	{
		System.out.print("original array: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int  j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.print("\narray after sorting in ascending: ");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}	
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int  j=0;j<array.length-i-1;j++)
			{
				if(array[j]<array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.print("\narray after sorting in descending: ");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}	
		
	}
}
