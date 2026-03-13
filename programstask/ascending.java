class ascending
{
	public static void main(String... values)
	{
		int[] n={5,4,7,0,4};
		int temp=0;
		for(int i=1;i<n.length();i++)
		{
			if(n[i]>n[i+1])
			{
				temp=n[i];
			}
			else
			{
				temp=n[i];
				n[i]=n[i+1];
				n[i+1]=temp;
			}
		}
	}
}