class UsbReceiver
{
	String version;
	UsbReceiver(String version)
	{
		this.version=version;
		System.out.println("created version using UsbReceiver");
	}
	void getUsbReceiver()
	{
		System.out.println("UsbReceiver version: "+this.version);
	}
}