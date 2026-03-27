class AcidStore
{
	Acid[] acids;
	int currentIndex=0;
	
	AcidStore(Acid[] acids)
	{
		this.acids=acids;
	}
	
	void acidStore(Acid acid)
	{
		if(acids!=null && acid!=null)
		{
			int sizeOfAcid=this.acids.length;
			if(this.currentIndex<sizeOfAcid)
			{
				this.acids[currentIndex]=acid;
				acid.printAcid();
				System.out.println("acid stored at index: "+this.currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("sorry, array is full!!");
			}
		}
		else
		{
			System.out.println("the acids array and acid should not be null");
		}
	}
}
