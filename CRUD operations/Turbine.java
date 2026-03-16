class Turbine
{
	String[] turbineNames;
	int index=0;
	
	Turbine(String[] turbineNames)
	{
		this.turbineNames=turbineNames;
	}
	
	void getTurbineName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getTurbineName in Turbine. "+"\nTurbine name:"+name);
	
		if(name!=null)
		{
			int size=this.turbineNames.length;
			System.out.println("size of turbineNames array: "+size);
			if(index<size)
			{
				this.turbineNames[index]=name;
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
			System.out.println("name and turbineNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Turbine. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int  i=0;i<turbineNames.length;i++)
		{
			if(searchName.equals(turbineNames[i]))
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