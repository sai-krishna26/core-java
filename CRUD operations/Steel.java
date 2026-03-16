class Steel
{
	String[] steelNames;
	int index=0;
	
	Steel(String[] steelNames)
	{
		this.steelNames=steelNames;
	}
	
	void getSteelName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSteelName in Steel. "+"\nSteel name:"+name);
	
		if(name!=null)
		{
			int size=this.steelNames.length;
			System.out.println("size of steelNames array: "+size);
			if(index<size)
			{
				this.steelNames[index]=name;
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
			System.out.println("name and steelNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Steel. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int  i=0;i<steelNames.length;i++)
		{
			if(searchName.equals(steelNames[i]))
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