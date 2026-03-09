class Calendar
{
	boolean isPrinted;
	String brand;
	CalendarType type;

	Calendar(boolean isPrinted,String brand,CalendarType type)
	{
		this.isPrinted=isPrinted;
		this.brand=brand;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Printed: "+this.isPrinted);

		if(this.brand!=null)
		{
			System.out.println("Brand: "+this.brand);
		}

		if(this.type!=null)
		{
			System.out.println("Calendar Type: "+this.type);
		}
	}
}