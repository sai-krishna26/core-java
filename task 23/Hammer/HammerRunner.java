class HammerRunner
{
	public static void main(String... val)
	{
		int[] weights=new int[3];
		weights[0]=1;
		weights[1]=2;
		weights[2]=3;
		
		Nail[] nail=new Nail[3];
		nail[0]=new Nail("steel nail",10);
		nail[1]=new Nail("iron nail",20);
		nail[2]=new Nail("wood nail",30);
		
		Hammer hammer=new Hammer(weights,nail);
		hammer.displayHammer();
	}
}