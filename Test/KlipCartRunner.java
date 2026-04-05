class KlipCartRunner
{
	KlipCart[] products=new KlipCart[4];
	StoreProducts storeProducts=new StoreProducts(products);
	
	void storeKey()
	{
		KlipCart product0=new KlipCart(100,"Milk","Amul","2 Aug","3 Aug",Type.DAIRY,25.00,500.00);
		storeProducts.getProduct(product0);
		
		KlipCart product1=new KlipCart(101,"Lemon","countryFresh","4 Aug","10 Aug",Type.GROCERY,10.00,10.00);
		storeProducts.getProduct(product1);
		
		KlipCart product2=new KlipCart(102,"speaker","JBL","12 jan","12 dec",Type.ELECTRONICS,25000.0,5000.0);
		storeProducts.getProduct(product2);
	}
	
	
	void displayKey()
	{
		storeProducts.displayProducts();
	}
	
	void getProductByProductIdKey(int id)
	{
		storeProducts.getProductByProductId(id);
	}
	
	void getProductPriceByProductNameKey(String name)
	{
		storeProducts.getProductPriceByProductName(name);
	}
	
	void getProductNameByCompanyNameKey(String cname)
	{
		storeProducts.getProductNameByCompanyName(cname);
	}
	
	 void getCompanyByproductNameKey(String pname)
    {
        storeProducts.getCompanyByproductName(pname);
    }

	
    void getMnfAndExpDateByproductNameKey(String pname)
    {
        storeProducts.getMnfAndExpDateByproductName(pname);
    }

   
    void getProductNameByTypeKey(Type type)
    {
        storeProducts.getProductNameByType(type);
    }

    
    void deleteProductKey(String pname)
    {
        storeProducts.deleteProduct(pname);
    }

    
    void UpdateMnfDateAndExpDateByProductNameKey(String pname, String mnf, String exp)
    {
        storeProducts.UpdateMnfDateAndExpDateByProductName(pname, mnf, exp);
    }

    
    void UpdateProductPriceByProductNameKey(String pname, double price)
    {
        storeProducts.UpdateProductPriceByProductName(pname, price);
    }
}