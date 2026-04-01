class BarRunner
{
	public static void main(String... args)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");

		JuiceBar juiceBar = new JuiceBar();
		JuiceBar juiceBar1 = new JuiceBar();

		juiceBar.name="CoolBar";
		juiceBar.location="City";
		juiceBar.rating=4.5;
		juiceBar.drinkType="Juice";
		juiceBar.staff=10;
		juiceBar.openTime="9AM";
		juiceBar.closeTime="9PM";
		juiceBar.category="Healthy";

		System.out.println(juiceBar.name);
		System.out.println(juiceBar.location);
		System.out.println(juiceBar.rating);
		System.out.println(juiceBar.drinkType);
		System.out.println(juiceBar.staff);
		System.out.println(juiceBar.openTime);
		System.out.println(juiceBar.closeTime);
		System.out.println(juiceBar.category);
		juiceBar.openBar();
		juiceBar.closeBar();
		juiceBar.serve();

		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");

		Bar bar = new JuiceBar();
		Bar bar1 = new JuiceBar();

		bar.name="MiniBar";
		bar.location="Town";
		bar.rating=3.5;

		System.out.println(bar.name);
		System.out.println(bar.location);
		System.out.println(bar.rating);
		bar.openBar();
		bar.closeBar();

		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");

		Bar bar2 = new Bar();
		Bar bar3 = new Bar();

		bar2.name="LocalBar";
		bar2.location="Village";
		bar2.rating=2.5;

		System.out.println(bar2.name);
		System.out.println(bar2.location);
		System.out.println(bar2.rating);
		bar2.openBar();
		bar2.closeBar();
	}
}