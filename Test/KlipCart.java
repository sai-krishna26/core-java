class KlipCart
{
	int productId;
	String productName;
	String company;
	String manufactureDate;
	String expDate;
	Type type;
	double price;
	double weightInGrams;
	
	KlipCart(int productId,String productName,String company,String manufactureDate,String expDate,Type type,double price,double weightInGrams)
	{
		this.productId=productId;
		this.productName=productName;
		this.company=company;
		this.manufactureDate=manufactureDate;
		this.expDate=expDate;
		this.type=type;
		this.price=price;
		this.weightInGrams=weightInGrams;
	}
	
	void showProducts()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("executing showProducts in KlipCart");
		System.out.println("productId:"+this.productId);
		System.out.println("productName:"+this.productName);
		System.out.println("company:"+this.company);
		System.out.println("manufactureDate:"+this.manufactureDate);
		System.out.println("expDate:"+this.expDate);
		System.out.println("type:"+this.type);
		System.out.println("price:"+this.price);
		System.out.println("weightInGrams:"+this.weightInGrams);
	}
}