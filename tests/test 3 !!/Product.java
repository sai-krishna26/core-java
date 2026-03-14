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
		System.out.println("--------------------");
	}
	
	int addToCart(int quantity)
	{
		if(quantity<=this.quantityAvailable)
		{
			this.quantityAvailable=this.quantityAvailable - quantity;	
			System.out.println("Added to cart. Remaining quantity: "+this.quantityAvailable);
			return this.quantityAvailable;
		}
		else 
		{
			System.out.println("Not enough stock");
			return -1;
		}
	}
	
	int  addToCart(int quantity,boolean isBulkPurchase)
	{
		if(quantity>20 && isBulkPurchase)
		{
			return -2;
		}
		else if(quantity>=10 && isBulkPurchase)
		{
			bulkDiscount=5*this.discountPrice/100;
			System.out.println("Bulk discount applied: "+(discountPrice - bulkDiscount));
			return 1;
		}
		else if(quantity<=this.quantityAvailable)
		{
			this.quantityAvailable=this.quantityAvailable-quantity;
			System.out.println("available quantity :"+this.quantityAvailable);
			return 0;
		}
		return -1;
	}
}