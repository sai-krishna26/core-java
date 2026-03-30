class TimeRunner
{
	public static void main(String... values)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");
		Time time=new Time();
		Time time1=new Time();
		System.out.println(time.hour);
		System.out.println(time.minute);
		System.out.println(time.second);
		time.showTime();
		time.alarm();
		System.out.println(time.miliSecond);
		System.out.println(time.Name);
		System.out.println(time.hourAngle);
		time.stopWatch();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");
		
		Clock clock=new Time();
		Clock clock1=new Time();
		System.out.println(clock.hour);
		System.out.println(clock.minute);
		System.out.println(clock.second);
		clock.showTime();
		clock.alarm();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");
		
		Clock clockk=new Clock();
		Clock clockk1=new Clock();
		System.out.println(clockk.hour);
		System.out.println(clockk.minute);
		System.out.println(clockk.second);
		clockk.showTime();
		clockk.alarm();
	}
}