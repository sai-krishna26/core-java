class BalloonRunner
{
	public static void main(String... values)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");
		
		AirBalloon airBalloon = new AirBalloon();
		AirBalloon airBalloon1 = new AirBalloon();
		
		System.out.println(airBalloon.color);
		System.out.println(airBalloon.shape);
		System.out.println(airBalloon.size);
		airBalloon.inflate();
		airBalloon.deflate();
		System.out.println(airBalloon.altitude);
		System.out.println(airBalloon.gasType);
		System.out.println(airBalloon.isFlying);
		airBalloon.fly();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");
		
		Balloon balloon = new AirBalloon();
		Balloon balloon1 = new AirBalloon();
		
		System.out.println(balloon.color);
		System.out.println(balloon.shape);
		System.out.println(balloon.size);
		balloon.inflate();
		balloon.deflate();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");
		
		Balloon balloon2 = new Balloon();
		Balloon balloon3 = new Balloon();
		
		System.out.println(balloon2.color);
		System.out.println(balloon2.shape);
		System.out.println(balloon2.size);
		balloon2.inflate();
		balloon2.deflate();
	}
}