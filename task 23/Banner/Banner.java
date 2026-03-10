class Banner
{
	int[] size;
	Text[] text;
	
	Banner(int[] size,Text[] text)
	{
		this.size=size;
		this.text=text;
	}
	
	void displayBanner()
	{
		System.out.println("executing displayBanner in Banner");
		
		if(this.size!=null)
		{
			System.out.println("length of the size array: "+this.size.length);
			for(int s:size)
			{
				System.out.println("size: "+s);
			}
		}
		
		System.out.println("-------------------------------------");
		
		if(this.text!=null)
		{
			System.out.println("length of the text array: "+this.text.length);
			for(Text t:text)
			{
				t.displayText();
			}
		}
	}
}
