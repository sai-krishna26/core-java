class Version
{
	int number;
	Version(int number)
	{
		this.number=number;
		System.out.println("created number using Version");
	}
	void getVersion()
	{
		System.out.println("Version number: "+this.number);
	}
}