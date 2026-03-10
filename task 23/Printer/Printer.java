class Printer
{
	String[] locations;
	PrinterType[] printerType;
	
	Printer(String[] locations,PrinterType[] printerType)
	{
		this.locations=locations;
		this.printerType=printerType;
	}
	
	void  displayPrinter()
	{
		System.out.println("executing displayPrinter in Printer");
		if(this.locations!=null)
		{
			System.out.println("total length of locations: "+this.locations.length);
			for(String location:locations)
			{
				System.out.println("location:"+location);
			}
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("executing displayPrinter in Printer for printerType");
		if(this.printerType!=null)
		{
			System.out.println("total length of printerType: "+this.printerType.length);
			for(PrinterType pType:printerType)
			{
				if(pType!=null)
				{
				pType.displayType();
				}
			}
		}
	}
	
}