class BiscuitRunner
{
	public static void main(String[] value)
	{
		String name="mary gold";
		String name2="burbon";
		String name3="dark fantasy";
		
		
		double cost = Biscuit.getCost(name2);
		System.out.println("cost:"+cost);
		
		String shape = Biscuit.getShape(name2);
		System.out.println("shape: "+shape);
		
		String values[]={name,name2,name3};
		String flavours = Biscuit.getFlavours(values);
		//System.out.println("flavours: "+flavours);
	}
}