class OpenerRunner
{
	public static void main(String... args)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");

		BottleOpener bottleOpener = new BottleOpener();
		BottleOpener bottleOpener1 = new BottleOpener();

		System.out.println(bottleOpener.material);
		System.out.println(bottleOpener.size);
		System.out.println(bottleOpener.brand);
		System.out.println(bottleOpener.type);
		System.out.println(bottleOpener.weight);
		System.out.println(bottleOpener.color);
		System.out.println(bottleOpener.durable);
		System.out.println(bottleOpener.usage);
		bottleOpener.open();
		bottleOpener.close();
		bottleOpener.unlock();

		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");

		Opener opener = new BottleOpener();
		Opener opener1 = new BottleOpener();

		System.out.println(opener.material);
		System.out.println(opener.size);
		System.out.println(opener.brand);
		opener.open();
		opener.close();

		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");

		Opener opener2 = new Opener();
		Opener opener3 = new Opener();

		System.out.println(opener2.material);
		System.out.println(opener2.size);
		System.out.println(opener2.brand);
		opener2.open();
		opener2.close();
	}
}