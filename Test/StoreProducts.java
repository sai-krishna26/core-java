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
		System.out.println("executing getProduct to store product");
		int size=this.products.length;
		if(product!=null && this.products!=null)
		{
			if(this.currIndex<size)
			{
				this.products[currIndex]=product;
				System.out.println("product is stored in index:"+currIndex);
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
		System.out.println("executing displayProducts");

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
		System.out.println("executing getProductByProductId");
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
					if(!found)					{
						System.out.println("product id not found!");
					}
				}
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
		System.out.println("executing getProductPriceByProductName");
		if(this.products!=null && name!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(name.equals(klip.productName))
					{
						System.out.println("product name: "+name+" found! at index"+klip.productId);
						System.out.println("product price:"+klip.price);
						break;
					}
				}
				else					
				{
					System.out.println("product name not found!");
				}
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
		System.out.println("executing getProductNameByCompanyName");
		if(this.products!=null && cname!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(cname.equals(klip.company))
					{
						System.out.println("product name: "+klip.productName+" found! at company "+klip.company);
						break;
					}
				}
				else					
				{
					System.out.println("company name not found!");
				}
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
		System.out.println("executing getProductNameByCompanyName");
		if(this.products!=null && pname!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(pname.equals(klip.productName))
					{
						System.out.println("product name: "+klip.company+" found! at company "+klip.productName);
						break;
					}
				}
				else					
				{
					System.out.println("company name not found!");
				}
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
		System.out.println("executing getMnfAndExpDateByproductName");
		if(this.products!=null && pname!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(pname.equals(klip.productName))
					{
						System.out.println("Manufacturing date:"+klip.manufactureDate);
						System.out.println("exp date:"+klip.expDate+" of product:"+klip.productName);
						break;
					}
				}
				else					
				{
					System.out.println("product name not found!");
				}
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
		System.out.println("executing getMnfAndExpDateByproductName");
		if(this.products!=null && typee!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(typee==klip.type)
					{
						System.out.println("product:"+klip.productName+" of Type:"+klip.type);
						break;
					}
				}
				else					
				{
					System.out.println("Type not found!");
				}
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
		System.out.println("executing deleteProduct");
		if(this.products!=null && productName!=null)
		{
			for(int i=1;i<products.length;i++)
			{
				if(products[i]!=null)
				{
					if(productName==products[i].productName)
					{
						products[i]=null;
						System.out.println("product name "+productName+" is deleted");
						displayProducts();
						break;
					}
				}
				else					
				{
					System.out.println("productName not found!");
				}
			}	
		}
		else
		{
			System.out.println("products array and productName should not be null!!");
		}
	}
	
	void getMnfDateAndExpDateByProductName(String productName)
	{
		int size=this.products.length;
		System.out.println("----------------------------------------");
		System.out.println("executing getMnfAndExpDateByproductName");
		if(this.products!=null && productName!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(productName==klip.productName)
					{
						System.out.println("product:"+klip.productName+" has a manufacture Date:"+klip.manufactureDate+" and exp date:"+klip.expDate);
						break;
					}
				}
				else					
				{
					System.out.println("productName not found!");
				}
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
		System.out.println("executing UpdateMnfDateAndExpDateByProductName");
		if(this.products!=null && productName!=null && newMnfDate!=null && newExpDate!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(productName==klip.productName)
					{
						klip.manufactureDate=newMnfDate;
						klip.expDate=newExpDate;
						System.out.println("product:"+klip.productName+" has a new manufacture Date:"+newMnfDate+" and new exp date:"+newExpDate);
						displayProducts();
						break;
					}
				}
				else					
				{
					System.out.println("productName not found!");
				}
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
		System.out.println("executing UpdateProductPriceByProductName");
		if(this.products!=null && productName!=null)
		{
			for(KlipCart klip:products)
			{
				if(klip!=null)
				{
					if(productName==klip.productName)
					{
						klip.price=newPrice;
						System.out.println("product:"+klip.productName+" has a new price:"+newPrice);
						displayProducts();
						break;
					}
				}
				else					
				{
					System.out.println("productName not found!");
				}
			}	
		}
		else
		{
			System.out.println("products array should not be null!! and newPrice should be greater than 0(Zero)");
		}
	}
}