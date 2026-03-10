class PrinterType
{
	String types;
	int totalCopies;
	
	PrinterType(String types, int totalCopies)
	{
		this.types=types;
		this.totalCopies=totalCopies;
		System.out.println("Created a class PrinterType");
	}
	
	void displayType()
	{
		System.out.println("type:"+types);
		System.out.println("totalCopies:"+totalCopies);
	}
}