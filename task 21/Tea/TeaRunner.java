class TeaRunner
{
	public static void main(String... values)
	{
		Leaf leaf=new Leaf("Assam");
		Milk milk=new Milk("Cow");
		Sugar sugar=new Sugar(2);
		Cup cup=new Cup("Ceramic");
		Kettle kettle=new Kettle("Prestige");
		Shop shop=new Shop("ChaiPoint");
		
		Tea tea=new Tea("Tata","Strong",1,20,true,
		leaf,milk,sugar,cup,kettle,shop);
		
		tea.getTea();
	}
}