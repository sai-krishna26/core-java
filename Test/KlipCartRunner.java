class KlipCartRunner
{
	public static void main(String... values)
	{
		KlipCart[] products=new KlipCart[4];
		StoreProducts storeProducts=new StoreProducts(products);
		
		KlipCart product0=new KlipCart(001,"Milk","Amul","2 Aug","3 Aug",Type.DAIRY,25.00,500.00);
		storeProducts.getProduct(product0);
		
		KlipCart product1=new KlipCart(002,"Lemon","countryFresh","4 Aug","10 Aug",Type.GROCERY,10.00,10.00);
		storeProducts.getProduct(product1);
		
		storeProducts.displayProducts();
		
		storeProducts.getProductByProductId(1);
		
		storeProducts.getProductPriceByProductName("Lemon");
		
		storeProducts.getProductNameByCompanyName("Amul");
		
		storeProducts.getCompanyByproductName("Lemon");
		
		storeProducts.getMnfAndExpDateByproductName("Milk");
		
		storeProducts.getProductNameByType(Type.GROCERY);
		
		storeProducts.deleteProduct("Lemon");
		
		storeProducts.getMnfDateAndExpDateByProductName("Milk");
		
		storeProducts.UpdateMnfDateAndExpDateByProductName("Milk","4 April 2026","5 April 2026");
		
		storeProducts.UpdateProductPriceByProductName("Milk",30.09);
	}
}