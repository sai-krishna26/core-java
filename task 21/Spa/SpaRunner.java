class SpaRunner
{
	public static void main(String... values)
	{
		Therapy therapy=new Therapy("Body");
		Massage massage=new Massage("Thai");
		Aroma aroma=new Aroma("Lavender");
		Customer customer=new Customer("Rahul");
		Packagee packagee=new Packagee("Premium");
		Manager manager=new Manager("Anita");

		Spa spa=new Spa("RelaxSpa","Bangalore",10,20,true,
		therapy,massage,aroma,customer,packagee,manager);

		spa.getSpa();
	}
}