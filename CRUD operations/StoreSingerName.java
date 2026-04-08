class StoreSingerNamee
{
	String[] names;
	int index=0;
	 
	StoreSingerNamee(String[] names)
	{
		this.names=names;
	}
	
	void getSingerName(String name)
	{
		System.out.println("executing the getSingerName in StopParseException\nname: "+name);
		if(this.names!=null)
		{
			int size=this.names.length;
			System.out.println("the max size of array: "+size);
			
			if(index<size)
			{
				System.out.println("present index: "+index);
				this.names[index]=name;
				index++;
				System.out.println("singer name saved,next index: "+index);
			}
			else
			{
				System.out.println("sorry,array is filled with names,so we cant save");
			}
		}
		else
		{
			System.out.println("the singer names should not be null");
		}
	}
	 
	
}