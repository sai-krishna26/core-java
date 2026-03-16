class InsertionSort
{
	public static void main(String...values)
	{
		int[] array={7,3,5,2,0};
		
		System.out.print("original array: ");
		for(int i=0;i<array.length;i++)//true
		{
			System.out.print(array[i]+" ");//printing
		}
		
		for(int i=1;i<=array.length-1;i++)
		{
			int curr=array[i];//3
			int prev=i-1;//7
			//true && true
			while(prev>=0 && array[prev]>curr)
			{
				array[prev+1]=array[prev];
				prev--;
			}
			array[prev+1]=curr;//3
		}
		System.out.print("\nsorted array: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}