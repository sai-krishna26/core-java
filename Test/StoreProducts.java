class StoreProducts
{
	KlipCart[] products;
	int currIndex=0;
	
	StoreProducts(KlipCart[] products)
	{
		this.products=products;
	}
	
	void getProduct(KlipCart product)
	{
		System.out.println("----------------------------------------");
		System.out.println("executing getProduct to store product in StoreProducts");
		int size=this.products.length;
		if(product!=null && this.products!=null)
		{
			if(this.currIndex<size)
			{
				this.products[currIndex]=product;
				System.out.println("product "+products[currIndex].productName+" is stored in index:"+currIndex);
				this.currIndex++;
			}
			else
			{
				System.out.println("array is full!!");
			}
		}
		else
		{
			System.out.println("product and products should not be null!!");
		}
	}
	
	void displayProducts()
	{
		System.out.println("----------------------------------------");
		System.out.println("executing displayProducts in StoreProducts");

		if(this.products != null)
		{
			for(KlipCart klip : this.products)
			{
				if(klip != null)
				{
					klip.showProducts();
				}
			}
		}
		else
		{
			System.out.println("products array should not be null");
		}
	}
	
	void getProductByProductId(int id)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing getProductByProductId in StoreProducts");
		if(this.products!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(id==klip.productId)
					{
						found=true;
						System.out.println("product id: "+id+" found! at product "+klip.productName);
						klip.showProducts();
						break;
					}
				}
			}
			if(!found)					
			{
				System.out.println("product id not found!");
			}
		}
		else
		{
			System.out.println("products array should not be null!!");
		}
	}
	
	void getProductPriceByProductName(String name)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing getProductPriceByProductName in StoreProducts");
		if(this.products!=null && name!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(name.equals(klip.productName))
					{
						found=true;
						System.out.println("product name: "+name+" found! at productId: "+klip.productId);
						System.out.println("product price:"+klip.price);
						break;
					}
				}
			}	
			if(!found)					
			{
				System.out.println("product name not found!");
			}
		}
		else
		{
			System.out.println("products array and name should not be null!!");
		}
	}
	
	void getProductNameByCompanyName(String cname)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing getProductNameByCompanyName in StoreProducts");
		if(this.products!=null && cname!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(cname.equals(klip.company))
					{
						found=true;
						System.out.println("product name: "+klip.productName+" found! at company "+klip.company);
						break;
					}
				}
			}
			if(!found)		
			{
				System.out.println("company name not found!");
			}
		}
		else
		{
			System.out.println("products array and company name should not be null!!");
		}
	}
	
	void getCompanyByproductName(String pname)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing in getCompanyByproductName StoreProducts ");
		if(this.products!=null && pname!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(pname.equals(klip.productName))
					{
						found=true;
						System.out.println("Company: "+klip.company+" found! at product name: "+klip.productName);
						break;
					}
				}
			}	
			if(!found)					
			{
				System.out.println("product name not found!");
			}
		}
		else
		{
			System.out.println("products array and product name should not be null!!");
		}
	}
	
	void getMnfAndExpDateByproductName(String pname)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing getMnfAndExpDateByproductName in StoreProducts");
		if(this.products!=null && pname!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(pname.equals(klip.productName))
					{
						found=true;
						System.out.println("Manufacturing date:"+klip.manufactureDate);
						System.out.println("exp date:"+klip.expDate+" of product:"+klip.productName);
						break;
					}
				}
			}
			if(!found)				
			{
				System.out.println("product name not found!");
			}
		}
		else
		{
			System.out.println("products array and productName name should not be null!!");
		}
	}
	
	void getProductNameByType(Type typee)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing getProductNameByType in StoreProducts");
		if(this.products!=null && typee!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(typee==klip.type)
					{
						found=true;
						System.out.println("product:"+klip.productName+" of Type:"+klip.type);
						break;
					}
				}
			}
			if(!found)					
			{
				System.out.println("Type not found!");
			}
		}
		else
		{
			System.out.println("products array and typee should not be null!!");
		}
	}
	
	void deleteProduct(String productName)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing deleteProduct to delete in StoreProducts");
		if(this.products!=null && productName!=null)
		{
			boolean found=false;
			for(int i=0;i<products.length;i++)
			{
				if(products[i]!=null)
				{
					if(productName.equals(products[i].productName))
					{
						found=true;
						products[i]=null;
						System.out.println("product name "+productName+" is deleted");
						displayProducts();
						break;
					}
				}
			}	
			if(!found)					
			{
				System.out.println("productName not found!");
			}
		}
		else
		{
			System.out.println("products array and productName should not be null!!");
		}
	}
	
	void UpdateMnfDateAndExpDateByProductName(String productName,String newMnfDate, String newExpDate)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing UpdateMnfDateAndExpDateByProductName in StoreProducts");
		if(this.products!=null && productName!=null && newMnfDate!=null && newExpDate!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(productName.equals(klip.productName))
					{
						found=true;
						klip.manufactureDate=newMnfDate;
						klip.expDate=newExpDate;
						System.out.println("product:"+klip.productName+" has a new manufacture Date:"+newMnfDate+" and new exp date:"+newExpDate);
						displayProducts();
						break;
					}
				}
			}
			if(!found)					
			{
				System.out.println("productName,newMnfDate,newExpDate not found!");
			}
		}
		else
		{
			System.out.println("products array and productName and new manufacture dates should not be null!!");
		}
	}
	
	
	void UpdateProductPriceByProductName(String productName,double newPrice)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing UpdateProductPriceByProductName in StoreProducts");
		if(this.products!=null && productName!=null)
		{
			boolean found=false;
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(productName.equals(klip.productName))
					{
						found=true;
						klip.price=newPrice;
						System.out.println("product:"+klip.productName+" has a new price:"+newPrice);
						displayProducts();
						break;
					}
				}
			}
			if(!found)					
			{
				System.out.println("productName not found!");
			}
		}
		else
		{
			System.out.println("products array should not be null!! and newPrice should be greater than 0(Zero)");
		}
	}
}