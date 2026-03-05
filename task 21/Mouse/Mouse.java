class Mouse
{
	String brand;
	String color;
	int dpi;
	int buttons;
	boolean wireless;
	
	Button button;
	Sensor sensor;
	Battery battery;
	ScrollWheel scrollWheel;
	UsbReceiver usbReceiver;
	Light light;
	
	Mouse(String brand,String color,int dpi,int buttons,boolean wireless,
	Button button,Sensor sensor,Battery battery,ScrollWheel scrollWheel,UsbReceiver usbReceiver,Light light)
	{
		this.brand=brand;
		this.color=color;
		this.dpi=dpi;
		this.buttons=buttons;
		this.wireless=wireless;
		this.button=button;
		this.sensor=sensor;
		this.battery=battery;
		this.scrollWheel=scrollWheel;
		this.usbReceiver=usbReceiver;
		this.light=light;
		
		System.out.println("created a Mouse using String brand,String color,int dpi,int buttons,boolean wireless and non primitive objects");
	}
	
	void getMouse()
	{
		System.out.println("brand: "+this.brand);
		System.out.println("dpi: "+this.dpi);
		System.out.println("battery object: "+this.battery);
	}
}
