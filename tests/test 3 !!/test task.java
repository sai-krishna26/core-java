class Product
{
	int productId;
	String productName;
	float price;
	int quantityAvailable;
	String category;
	float discountPercentage;
	float discountPrice;
	float bulkDiscount;
	
	Product(int productId,String productName,float price,int quantityAvailable,String category,float discountPercentage)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantityAvailable=quantityAvailable;
		this.category=category;
		this.discountPercentage=discountPercentage;
	}
	
	void getDetails()
	{
		System.out.println("product Id: "+this.productId);
		if(this.productName!=null)
		{
			System.out.println("product name: "+this.productName);
		}
		else
		{
			System.out.println("name should not be null");
		}
		if(this.price!=0.0)
		{
			System.out.println("price: "+this.price);
		}
		else
		{
			System.out.println("price should not be a 0");
		}
		System.out.println("quantity available: "+this.quantityAvailable);
		if(this.category!=null)
		{
			System.out.println("category: "+this.category);
		}
		else
		{
			System.out.println("category should not be null");
		}
		System.out.println("discount percentage: "+this.discountPercentage);
		calculateDiscountedPrice();
		
	}
	
	void discountPricee()
	{
		float percentagePrice=this.discountPercentage*this.price/100;
		discountPrice=this.price-percentagePrice;
		System.out.println(discountPrice);
	}
	
	void  calculateDiscountedPrice()
	{
		System.out.println("discount price: ");
		discountPricee();
	}
	
	int addToCart(int quantity)
	{
		if(quantity<=this.quantityAvailable)
		{
			this.quantityAvailable=this.quantityAvailable-quantity;			
		}
		return this.quantityAvailable;
	}
	
	void addToCart(int quantity,boolean isBulkPurchase)
	{
		if(quantity>20 && isBulkPurchase)
		{
			System.out.println("bulk limit exceeded");
		}
		else if(quantity>=10 && isBulkPurchase)
		{
			bulkDiscount=this.price-discountPrice-5;
			System.out.println("Bulk discount applied: "+bulkDiscount);
		}
		else if(quantity<=this.quantityAvailable)
		{
			this.quantityAvailable=this.quantityAvailable-quantity;
			System.out.println("available quantity :"+this.quantityAvailable);
		}
	}
}
class ShoppingCart
{
	int cartId;
	String customerName;
	String[] items;
	double totalAmount;
	
	ShoppingCart(int cartId,String customerName,String[] items,double totalAmount)
	{
		this.cartId=cartId;
		this.customerName=customerName;
		this.items=items;
		this.totalAmount=totalAmount;
	}
	
	void addProductToCart(Product product,int quantity)
	{
		Product.addToCart(11,true);
		Product.addToCart(21,true);
	}
	
	void generateBill()
	{
		System.out.println("cart Id: "+cartId);
		System.out.println("customer name "+customerName);
		
	}
}

class ProductRunner
{
	public static void main(String... val)
	{
		Product product=new Product(001,"trimmer",800.0f,54,"electronics",10.0f);
		product.getDetails();
		String[] items={"mobile","headset"};
		ShoppingCart shoppingCart=new ShoppingCart(001,"raman",items,120);
		shoppingCart.addProductToCart();
		shoppingCart.generateBill();
	}
}