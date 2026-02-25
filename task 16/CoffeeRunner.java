class CoffeeRunner
{
	public static void main(String[] valu)
	{
		Coffee coffee=new Coffee("black coffee",false);
		System.out.println("name of coffee: "+coffee.name);
		System.out.println("is coffee hot?: "+coffee.isHot);
	}
}