class Tea
{
	String brand;
	String flavor;
	int quantity;
	int price;
	boolean hot;
	
	Leaf leaf;
	Milk milk;
	Sugar sugar;
	Cup cup;
	Kettle kettle;
	Shop shop;
	
	Tea(String brand,String flavor,int quantity,int price,boolean hot,
	Leaf leaf,Milk milk,Sugar sugar,Cup cup,Kettle kettle,Shop shop)
	{
		this.brand=brand;
		this.flavor=flavor;
		this.quantity=quantity;
		this.price=price;
		this.hot=hot;
		this.leaf=leaf;
		this.milk=milk;
		this.sugar=sugar;
		this.cup=cup;
		this.kettle=kettle;
		this.shop=shop;
		
		System.out.println("created a Tea using primitive and non primitive variables");
	}
	
	void getTea()
	{
		System.out.println("brand: "+this.brand);
		System.out.println("flavor: "+this.flavor);
		System.out.println("cup object: "+this.cup);
	}
}
