class PrinterRunner
{
	public static void main(String... values)
	{
		PrinterType[] printerType=new PrinterType[3];
		printerType[0]= new PrinterType("colour", 50);
		printerType[1]= new PrinterType("blue", 40);
		printerType[2]= new PrinterType("black", 60);
		
		String[] locations=new String[3];
		locations[0]="btm layout";
		locations[1]="hsr layout";
		locations[2]="mico layout";
		
		Printer printer=new Printer(locations,printerType);
		printer.displayPrinter();
	}
}