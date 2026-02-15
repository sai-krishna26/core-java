class Bullet
{
	static float getSize(float size)
	{
		System.out.println("Executing the getSize in Bullet ,size of bullet: "+size+"mm");
		return 5.56f;
	}
	
	static String getRealtedGun(String gunName)
	{
		System.out.println("Executing the getRealtedGun in Bullet ,name of gun: "+gunName);
		return "M416";
	}
	
	static boolean isExist(boolean existance)
	{
		System.out.println("Executing the isExist in Bullet ,is gun exist: "+existance);
		return true;
	}
}