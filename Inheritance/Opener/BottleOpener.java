class BottleOpener extends Opener
{
	String type;
	double weight;
	String color;
	boolean durable;
	String usage;

	void unlock()
	{
		System.out.println("Unlocking bottle");
	}
}