class Tail
{
	double length;
	Tail(double length)
	{
		this.length=length;
		System.out.println("created length using Tail");
	}
	void getTail()
	{
		System.out.println("Tail length: "+this.length);
	}
}