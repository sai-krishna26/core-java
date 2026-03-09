class Filter
{
	String brand;
	Filter(String brand)
	{
		this.brand=brand;
		System.out.println("created brand using Filter");
	}
	
	void getFilter()
	{
		System.out.println("filter brand:" + this.brand);
	}
}