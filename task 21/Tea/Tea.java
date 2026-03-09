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
		System.out.println("quantity: "+this.quantity);
		System.out.println("price: "+this.price);
		System.out.println("hot: "+this.hot);
		
		if(this.leaf!=null)
		{
			this.leaf.getLeaf();
		}
		if(this.milk!=null)
		{
			this.milk.getMilk();
		}
		if(this.sugar!=null)
		{
			this.sugar.getSugar();
		}
		if(this.cup!=null)
		{
			this.cup.getCup();
		}
		if(this.kettle!=null)
		{
			this.kettle.getKettle();
		}
		if(this.shop!=null)
		{
			this.shop.getShop();
		}
	}
}
