class StorePetroliumCompany
{
	String[] companyName;
	int index=0;
	
	StorePetroliumCompany(String[] companyName)
	{
		this.companyName=companyName;
	}
	
	void getCompanyName(String company)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getCompanyName in StorePetroliumCompany. "+"\nname:"+company);
	
		if(companyName!=null)
		{
			if(company!=null)
			{
				int size=this.companyName.length;
				System.out.println("the size items of the array:"+size);
				if(index<size)
				{
					this.companyName[index]=company;
					System.out.println("current index: "+this.index);
					index++;
					System.out.println("company name saved,next index: "+this.index);
				}
				else
				{
					System.out.println("sorry, company names are filled, we cant store");
				}
			}
			else
			{
				System.out.println("the company name should not be a null");
			}
			
		}
		else
		{
			System.out.println("the company array should not be a null");
		}
	}
}