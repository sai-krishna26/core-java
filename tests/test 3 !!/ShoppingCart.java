class ShoppingCart
{
	int cartId;
	String customerName;
	Product[] items;
	double totalAmount;
	
	ShoppingCart(int cartId,String customerName,Product[] items,double totalAmount)
	{
		this.cartId=cartId;
		this.customerName=customerName;
		this.items=items;
		this.totalAmount=totalAmount;
	}
	
	void addProductToCart(Product product,int quantity)
	{
		product.addToCart(quantity,true);
	}
	
	void generateBill()
	{
		System.out.println("cart Id: "+cartId);
		System.out.println("customer name "+customerName);
		System.out.println("total amount: "+this.totalAmount);
		if(this.items!=null)
		{
			System.out.println("the items of cart are: ");
			for(Product p:items)
			{
				if(p!=null)
				{
					p.getDetails();
				}
			}
		}
	}
}