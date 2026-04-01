class FactoryRunner
{
	public static void main(String...values)
	{
		System.out.println("-------------------printing members by instance of subclass using same type--------------------------");

		ShoeFactory shoeFactory=new ShoeFactory();
		ShoeFactory shoeFactory1=new ShoeFactory();
		System.out.println(shoeFactory.type);
		System.out.println(shoeFactory.product);
		System.out.println(shoeFactory.turnover);
		shoeFactory.showDetails();
		shoeFactory.storeProduct();
		
		System.out.println(shoeFactory.company+"\n"+shoeFactory.material+"\n"+shoeFactory.productType+"\n"+shoeFactory.size+"\n"+shoeFactory.basePrize);
		shoeFactory.purchaseProduct();
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using subclass type--------------------------");
		
		Factory factory=new ShoeFactory();
		Factory factory1=new ShoeFactory();
		System.out.println(factory.type);
		System.out.println(factory.product);
		System.out.println(factory.turnover);
		factory.showDetails();
		factory.storeProduct();
		
		
		System.out.println();
		System.out.println("-------------------printing members by instance of parentclass using same type--------------------------");
		
		Factory factori=new Factory();
		Factory factori1=new Factory();
		System.out.println(factori1.type);
		System.out.println(factori1.product);
		System.out.println(factori1.turnover);
		factori1.showDetails();
		factori1.storeProduct();
	}
}