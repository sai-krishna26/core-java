class MaxNumber
{
	int[] array;
	
	MaxNumber(int[] array)
	{
		this.array=array;
	}
	void sort()
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
	System.out.println();
	System.out.println("min number:"+array[0]);
	System.out.println("max number:"+array[array.length-1]);
	System.out.println("2nd max number:"+array[array.length-2]);
	}
	
	void sort()
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
	
	
	public static void main(String... val)
	{
		int[]array={2,7,3,10,9};
		MaxNumber maxnumber=new MaxNumber(array);
		maxnumber.sort();
	}
}