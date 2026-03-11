class Signal
{
	int height;
	boolean isWorking;
	
	Signal(int height,boolean isWorking)
	{
		this.height=height;
		this.isWorking=isWorking;
		
	}
	
	void showDisplay()
	{
		System.out.println("height: "+this.height);
		System.out.println("isWorking: "+this.isWorking);
	}
}