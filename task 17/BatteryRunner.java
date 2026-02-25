class BatteryRunner
{
	public static void main(String[] args)
	{
		Battery battery = new Battery();
		Battery battery1 = new Battery("Duracell");
		Battery battery2 = new Battery(250.5);
		Battery battery3 = new Battery(5000);
		Battery battery4 = new Battery(true);
		Battery battery5 = new Battery("Duracell","Lithium");
	}
}