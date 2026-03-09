class Fan
{
	int blades;
	Fan(int blades)
	{
		this.blades=blades;
		System.out.println("created blades using Fan");
	}
	void getFan()
	{
		System.out.println("Fan blades: "+this.blades);
	}
}