class BannerRunner
{
	public static void main(String... val)
	{
		int[] size=new int[3];
		size[0]=5;
		size[1]=10;
		size[2]=15;
		
		Text[] text=new Text[3];
		text[0]=new Text("Welcome",1);
		text[1]=new Text("Sale",2);
		text[2]=new Text("Offer",3);
		
		Banner banner=new Banner(size,text);
		banner.displayBanner();
	}
}