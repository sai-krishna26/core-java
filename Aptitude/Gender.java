class Gender
{
	String[] genderTypes;
	int currentIndex=0;
	
	Gender(int size)
	{
		this.genderTypes=new String[size];
	}
	
	void storeGenders(String gender)
	{
		System.out.println("---------------------------------");
		System.out.println("executing storeGenders in Gender");
		if(genderTypes!=null && gender!=null)
		{
			if(this.currentIndex<this.genderTypes.length)
			{
				this.genderTypes[currentIndex]=gender;
				System.out.println(gender+" gender is stored at index:"+currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("sorry,array is full");
			}
		}
		else
		{
			System.out.println("array and value should not be null");
		}
	
	}
}