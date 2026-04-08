class Treee
{
	String[] treeNames;
	int index=0;
	
	Treee(String[] treeNames)
	{
		this.treeNames=treeNames;
	}
	
	void getTreeName(String name)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getTreeName in Tree. "+"\nTree name:"+name);
	
		if(name!=null)
		{
			int size=this.treeNames.length;
			System.out.println("size of treeNames array: "+size);
			if(index<size)
			{
				this.treeNames[index]=name;
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
			System.out.println("name and treeNames array should not be null");
		}
	}
	
	void getSearchName(String searchName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchName in Tree. "+"\nSearch name:"+searchName);

		boolean found=false;
		for(int  i=0;i<treeNames.length;i++)
		{
			if(searchName.equals(treeNames[i]))
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