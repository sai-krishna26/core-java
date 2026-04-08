class PastaStoringg
{
	String[] flavours;
	int index=0;
	
	PastaStoringg(String[] flavours)
	{
		this.flavours=flavours;
		this.index=index;
	}
	
	void getPastaFlavours(String flavour)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing the getPastaFlavours in PastaStoring"+"\nflavour: "+flavour);
		if(this.flavours!=null)
		{
			if(flavour!=null)
			{
				int size=this.flavours.length;
				System.out.println("the size of array: "+size);
				if(this.index<size)
				{
					flavours[index]=flavour;
					System.out.println(flavour+" stored at index: "+this.index);
					this.index++;
					System.out.println("next index will be: "+this.index);
				}
				else
				{
					System.out.println("sorry flavour can't be stored, array full!!");
				}
			}
			else
			{
				System.out.println("flavour should not be null");
			}
		}
		else
		{
			System.out.println("flavours array should not be empty");
		}
	}
	
	void searchFlavour(String flavourName)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing SearchFlavour in PastaStoring. "+"\nsearching flavourName:"+flavourName);
		
		boolean available=false;
		
		if(flavourName!=null)
		{
			for(String name:flavours)
			{
				if(flavourName==name)
				{
					available=true;
					break;
				}
			}
		}
		else
		{
			System.out.println("flavourName should not be null");
		}
		
		if(available==true)
		{
			System.out.println("The "+flavourName+" found!!");
		}
		else
		{
			System.out.println("The "+flavourName+" not found!!");
		}
	}
}