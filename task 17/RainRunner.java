class RainRunner
{
	public static void main(String[] values)
	{
		Rain rain=new Rain();
		Rain rain1=new Rain("winter");
		Rain rain2=new Rain("winter",true);
		Rain rain3=new Rain("summer",true,22.4);
		Rain rain4=new Rain("rainy",false,15.32,23.54);
		Rain rain5=new Rain("rainy",true,12.33,53.9,98.5);
	}
}