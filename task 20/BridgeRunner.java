class BridgeRunner
{
	public static void main(String... args)
	{
		Bridge b=new Bridge();
		Bridge b1=new Bridge();
		b.open(); 
		b.close(); 
		b.supportVehicles(); 
		b.supportTrains();
		b.allowPedestrians(); 
		b.checkStrength(); 
		b.maintenance();
		b.repair(); 
		b.paint(); 
		b.displayLength(); 
		b.displayHeight();
		b.showLocation(); 
		b.inspect(); 
		b.calculateLoad(); 
		b.emergencyClose();
	}
}