class Painter
{
	String[] worksfor;
	Color[] color;
	
	
	Painter(String[] worksfor,Color[] color)
	{
		this.worksfor=worksfor;
		this.color=color;
	}
	
	void displayPainter()
	{
		System.out.println("executing the displayPainter in Painter");
		if(this.worksfor!=null)
		{
			System.out.println("size of the worksfor array: "+this.worksfor.length);
			for(String work:worksfor)
			{
				System.out.println("work: "+work);
			}
		}
		System.out.println("----------------------------------------------------------");
		if(this.color!=null)
		{
			System.out.println("size of the worksfor array: "+this.color.length);
			for(Color col:color)
			{
				col.displayColor();
			}
		}
	}
	
}