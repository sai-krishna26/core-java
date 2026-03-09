class CalendarRunner
{
	public static void main(String[] args)
	{
		Calendar c1=new Calendar(true,"Classmate",CalendarType.WALL);
		c1.printInfo();
		System.out.println("-----------");

		Calendar c2=new Calendar(true,"Times",CalendarType.DESK);
		c2.printInfo();
		System.out.println("-----------");

		Calendar c3=new Calendar(false,"Google",CalendarType.DIGITAL);
		c3.printInfo();
		System.out.println("-----------");

		Calendar c4=new Calendar(true,"Mini",CalendarType.POCKET);
		c4.printInfo();
	}
}