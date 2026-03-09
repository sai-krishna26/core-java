class Security
{
	String type;
	Security(String type)
	{
		this.type=type;
		System.out.println("created type using Security");
	}
	void getSecurity()
	{
		System.out.println("Security type: "+this.type);
	}
}