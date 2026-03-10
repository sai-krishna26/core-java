class Joker
{
	String[] actions;
	Smile[] smile;
	
	Joker(String[] actions,Smile[] smile)
	{
		this.actions=actions;
		this.smile=smile;
	}
	
	void displayJoker()
	{
		System.out.println("executing a displayJoker in Joker");
		if(this.actions!=null)
		{
			System.out.println("size of the actions array: "+this.actions.length);
			for(String action:actions)
			{
				System.out.println("action:"+action);
			}
		}
		System.out.println("--------------------------------------------------------");
		if(this.smile!=null)
		{
			System.out.println("size of the smiles array: "+this.smile.length);
			for(Smile hehe:smile)
			{
				hehe.displaySmile();
			}
		}
	}
}