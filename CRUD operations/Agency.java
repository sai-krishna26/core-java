class Agency
{
	int[] cylinderNumbers;
	int index=0;
	
	Agency(int[] cylinderNumbers)
	{
		this.cylinderNumbers=cylinderNumbers;
	}
	
	void getCylinderNumber(int serialNo)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getCylinderNumber in Agency. "+"\nSerial number:"+serialNo);
	
		if(serialNo!=0)
		{
			int size=this.cylinderNumbers.length;
			System.out.println("size of cylinderNumbers array: "+size);
			if(index<size)
			{
				this.cylinderNumbers[index]=serialNo;
				System.out.println("serialNo stored at index:"+this.index);
				this.index++;
				System.out.println("next index will be:"+this.index);
			}
			else
			{
				System.out.println("sorry we can't store serialNo,bcz array is full");
			}
		}
		else
		{
			System.out.println("serialNo and cylinderNumbers array should not be a zero");
		}
	}
	
	void getSearchNumber(int serialSearchNo)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing getSearchNumber in Agency. "+"\nSerial Search number:"+serialSearchNo);

		boolean found=false;
		for(int  i=0;i<cylinderNumbers.length;i++)
		{
			if(serialSearchNo==cylinderNumbers[i])
			{
				found=true;
				System.out.println("at index "+i);
				break;
			}
		}
		if(found == true)
		{
			System.out.println("The "+serialSearchNo+" was found!!");
		}
		else
		{
			System.out.println(serialSearchNo+" not found!!");
		}
	}
}