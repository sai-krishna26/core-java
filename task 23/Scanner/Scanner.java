class Scanner
{
	int[] codes;
	Lens[] lens;
	
	Scanner(int[] codes,Lens[] lens)
	{
		this.codes=codes;
		this.lens=lens;
	}
	
	void displayScanner()
	{
		System.out.println("executing displayScanner in Scanner");
		
		if(this.codes!=null)
		{
			System.out.println("length of the codes array: "+this.codes.length);
			for(int code:codes)
			{
				System.out.println("code: "+code);
			}
		}
		
		System.out.println("-------------------------------------");
		
		if(this.lens!=null)
		{
			System.out.println("length of the lens array: "+this.lens.length);
			for(Lens l:lens)
			{
				l.displayLens();
			}
		}
	}
}