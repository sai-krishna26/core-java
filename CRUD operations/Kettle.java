class Kettle
{
	String[] kettleNames;
	int index=0;
	
	Kettle(String[] kettleNames)
	{
		this.kettleNames=kettleNames;
	}
	
	void getKettleName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getKettleName in Kettle. "+"\nKettle name:"+name);
	
		if(name!=null)
		{
			int size=this.kettleNames.length;
			System.out.println("size of kettleNames array: "+size);
			if(index<size)
			{
				this.kettleNames[index]=name;
				System.out.println("name stored at index:"+this.index);
				this.index++;
				System.out.println("next index will be:"+this.index);
			}
			else
			{
				System.out.println("sorry we can't store name,bcz array is full");
			}
		}
		else
		{
			System.out.println("name and kettleNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Kettle. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int  i=0;i<kettleNames.length;i++)
		{
			if(searchName.equals(kettleNames[i]))
			{
				found=true;
				System.out.println("at index "+i);
				break;
			}
		}
		if(found == true)
		{
			System.out.println("The "+searchName+" was found!!");
		}
		else
		{
			System.out.println(searchName+" not found!!");
		}
	}
}