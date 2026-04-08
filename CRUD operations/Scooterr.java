class Scooterr
{
	String[] scooterNames;
	int index=0;
	
	Scooterr(String[] scooterNames)
	{
		this.scooterNames=scooterNames;
	}
	
	void getScooterName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getScooterName in Scooter. "+"\nScooter name:"+name);
	
		if(name!=null)
		{
			int size=this.scooterNames.length;
			System.out.println("size of scooterNames array: "+size);
			if(index<size)
			{
				this.scooterNames[index]=name;
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
			System.out.println("name and scooterNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Scooter. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int  i=0;i<scooterNames.length;i++)
		{
			if(searchName.equals(scooterNames[i]))
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