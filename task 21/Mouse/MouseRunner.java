class MouseRunner
{
	public static void main(String... values)
	{
		Button button=new Button("LeftRight");
		Sensor sensor=new Sensor("Optical");
		Battery battery=new Battery(500);
		ScrollWheel scrollWheel=new ScrollWheel("Rubber");
		UsbReceiver usbReceiver=new UsbReceiver("2.4Ghz");
		Light light=new Light("RGB");
		
		Mouse mouse=new Mouse("Logitech","Black",1600,5,true,
		null,sensor,battery,scrollWheel,usbReceiver,light);
		
		mouse.getMouse();
	}
}