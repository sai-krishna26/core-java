class Wire
{
	String quality;
	Wire(String quality)
	{
		this.quality=quality;
		System.out.println("created quality using Wire");
	}
	void getWire()
	{
		System.out.println("wire quality: "+this.quality);
	}
}