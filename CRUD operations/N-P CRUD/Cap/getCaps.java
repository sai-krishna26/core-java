class getCaps
{
	Cap[] caps;
	int currentIndex=0;
	
	getCaps(Cap[] caps)
	{
		this.caps=caps;
	}
	
	void storeCaps(Cap cap)
	{
		System.out.println("executing the StoreCaps in getCaps");
		if(this.caps!=null && cap!=null)
		{
			int size=this.caps.length;
			if(currentIndex<size)
			{
				this.caps[currentIndex]=cap;
				cap.printDetails();
				System.out.println("item stored at index: "+currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("sorry,array is full!!");
			}
		}
		else
		{
			System.out.println("caps array and cap item should not be null!!");
		}
	}
}