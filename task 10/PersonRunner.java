class PersonRunner
{
	public static void main(String[] args)
	{
		String name="ramkrishna";
		String[] emails={"ramkrishna@gmail.com","krishnaram@gmail.com","rk@gmail.com"};
		long[] mobileNumbers={9900887766L,9900884422L};
		String address="ramanagar";
		Person.contactInfo(name,emails,mobileNumbers,address);
		
		
		
		String dishName="EggRice";
		String ingredients[]={"rice","egg","salt","red chilli powder","onion and green chilli"};
		Person.foodDish(dishName,ingredients);
		
		
		
		String brand="HP 15s";
		String model="HP 15s-fq5xxx";
		String ports[]={"usb","thunderbolt","HDMI","DVI","3.5mm Audio","ethernet"};
		String contWarnty[]={"India","USA","UK","Germany"};
		Person.laptop(brand,model,ports,contWarnty);
	}
}