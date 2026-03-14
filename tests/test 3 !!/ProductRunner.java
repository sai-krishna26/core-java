class ProductRunner
{
	public static void main(String... val)
	{
		Product product=new Product(001,"trimmer",800.0f,54,"electronics",10.0f);
		Product product1=new Product(002,"shirt",600.57f,21,
		"cloths",5.05f);
		Product product2=new Product(003,"arial",1000.00f,100,
		"groceries",15.0f);
		Product product3=new Product(004,"believe",899.99f,230,
		"book",20.05f);
		
		product.getDetails();
		product1.getDetails();
		product2.getDetails();
		product3.getDetails();
		
		Product[] items={product,product1};
		ShoppingCart shoppingCart=new ShoppingCart(001,"raman",items,120);
		shoppingCart.addProductToCart(product,5);
		shoppingCart.generateBill();
	}
}