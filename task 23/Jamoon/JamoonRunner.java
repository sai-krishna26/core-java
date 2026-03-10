class JamoonRunner
{
	public static void main(String... val)
	{
		int[] price=new int[3];
		price[0]=10;
		price[1]=20;
		price[2]=30;
		
		Syrup[] syrup=new Syrup[3];
		syrup[0]=new Syrup("sugar syrup",50);
		syrup[1]=new Syrup("honey syrup",60);
		syrup[2]=new Syrup("rose syrup",70);
		
		Jamoon jamoon=new Jamoon(price,syrup);
		jamoon.displayJamoon();
	}
}