// Create a static method findMin with parameter int[] arr to find and print the minimum value in the array. 

class ArrayOperations
{
	static void findMin(int array[])
	{
		int min=array[0];
		
		for (int i=1;i<array.length;i++)
			if(array[i]<min)
			{
				min=array[i];
			}
			
		System.out.println("min value :"+min);
	}
	
	
	static int findMax(int arr[])
	{
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("max value :"+max);
		return max;
	}
	
	static int findAverage(int aarray[])
	{
		int sum=0;
		for(int i=0;i<aarray.length;i++)
		{
			sum=sum+aarray[i];
		}
		int average=sum/aarray.length;
		System.out.println("average value :"+average);
		return average;
	}
	
//main methods	
public static void main(String[] args)
{
	int array[]={23,1,99,65,30,77,-22};
	findMin(array);
	findMax(array);
	findAverage(array);
}
}