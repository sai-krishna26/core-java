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
		System.out.println("color: "+this.color);
		System.out.println("dpi: "+this.dpi);
		System.out.println("buttons: "+this.buttons);
		System.out.println("wireless: "+this.wireless);
		
		if(this.button!=null)
		{
			this.button.getButton();
		}
		else
		{
			System.out.println("button not found");
		}
		if(this.sensor!=null)
		{
			this.sensor.getSensor();
		}
		if(this.battery!=null)
		{
			this.battery.getBattery();
		}
		if(this.scrollWheel!=null)
		{
			this.scrollWheel.getScrollWheel();
		}
		if(this.usbReceiver!=null)
		{
			this.usbReceiver.getUsbReceiver();
		}
		if(this.light!=null)
		{
			this.light.getLight();
		}
	}
}
