class MultiDArray
{
	public static void main(String[] args)
	{
		int[][] items={{1,2,3},{4,5,6}};
					  
		for(int i=0;i<items.length;i++)
		{
			for(int j=0;j<items[i].length;j++)
			{
				System.out.print(items[i][j]+" ");
			}
			System.out.println();
		}
	}	
}