class StoreTwoWheelerModel
{
	String[] modelNames;
	int index=0;
	
	StoreTwoWheelerModel(String[] modelNames)
	{
		this.modelNames=modelNames;
	}
	
	void getModelname(String model)
	{
		System.out.println("executing the getModelname in StoreTwoWheelerModel\nname: "+model);
		
		if(this.modelNames!=null)
		{
			
			int size=this.modelNames.length;
			System.out.println("the size of the array: "+size);
			if(index<size)
			{
				System.out.println("current index: "+index);
				this.modelNames[index]=model;
				index++;
				System.out.println("saved, next index is: "+index);
			}
			else
			{
				System.out.println("sorry,we can't save array is full!!");
			}
		}
		else
		{
			System.out.println("array should not be null");
		}
	}
	
	
	
}