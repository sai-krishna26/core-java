class Hammer
{
	int[] weights;
	Nail[] nail;
	
	Hammer(int[] weights,Nail[] nail)
	{
		this.weights=weights;
		this.nail=nail;
	}
	
	void displayHammer()
	{
		System.out.println("executing displayHammer in Hammer");
		
		if(this.weights!=null)
		{
			System.out.println("length of the weights array: "+this.weights.length);
			for(int w:weights)
			{
				System.out.println("weight: "+w);
			}
		}
		
		System.out.println("-------------------------------------");
		
		if(this.nail!=null)
		{
			System.out.println("length of the nail array: "+this.nail.length);
			for(Nail n:nail)
			{
				n.displayNail();
			}
		}
	}
}