class ProductStore
{
	Product[] products;
	int currentIndex=0;
	
	
	ProductStore(Product[] products)
	{
		this.products=products;
	}
	
	void save(Product product)
	{
		System.out.println("----------------------------------------");
		System.out.println("executing the saveProduct in ProductStore");
		int arraySize=this.products.length;
		if(this.products!=null && product!=null)
		{
			if(currentIndex<arraySize)
			{
				this.products[this.currentIndex]=product;
				product.showProduct();
				System.out.println("item store at index: "+currentIndex);
				this.currentIndex++;
			}
			else
			{
				System.out.println("sorry,array is full !");
			}
		}
		else
		{
			System.out.println("the products array and product detailsa should not be null !");
		}
	}
	
	void save(Product[] products)
	{
		System.out.println("----------------------------------------");
		System.out.println("executing saveMultipleProducts in ProductStore");
		int arraySize=this.products.length;
		if(this.products!=null && products!=null)
		{
			if(currentIndex<arraySize)
			{
				int count=0;
				for(Product prdct:products)
				{
					if(prdct!=null)
					{
						if(count<10)
						{
							this.products[this.currentIndex]=prdct;
							System.out.println("the product "+count+"stored !");
							count++;
						}
						else
						{
							System.out.println("sorry!,max limit reached");
						}
					}
					else
					{
						System.out.println("product should not be null");
					}
				}
			}
			else
			{
				System.out.println("Array is full!!");
			}
		}
		else
		{
			System.out.println("the products array and product should not be null!!");
		}
	}
	
	void searchByUniqeId(int unqId)
	{
		System.out.println("----------------------------------------");
		System.out.println("executing searchByUniqeId in ProductStore");
		if(this.products!=null)
		{
			boolean found=false;
			for(Product prdct:products)
			{
				if(prdct!=null)
				{
					if(unqId==prdct.uniqueId)
					{
						System.out.println("unqId: "+unqId+" found at "+prdct.name);
						found=true;
						break;
					}
				}
			}
			if(!found)
			{
				System.out.println(unqId+" not found!!");
			}
		}
		else
		{
			System.out.println("products array should not be null");
		}
	}
	
	void searchByUniqeIdAndName(int unqId,String name)
	{
		System.out.println("----------------------------------------");
		System.out.println("executing searchByUniqeIdAndName in ProductStore");
		if(this.products!=null && name!=null)
		{
			boolean found=false;
			for(Product prdct:this.products)
			{
				if(prdct!=null)
				{
					if(unqId==prdct.uniqueId && name.equalsIgnoreCase(prdct.name))
					{
						System.out.println("product found!!");
						found=true;
						break;
					}
				}
			}
			if(!found)
			{
				System.out.println(unqId+" and "+name+" not found!!");
			}
		}
		else
		{
			System.out.println("products array should not be null");
		}
	}
	
	void searchByUniqeIdAndNameAndOriginCountry(int unqId,String name,String originCountry)
	{
		System.out.println("----------------------------------------");
		System.out.println("executing searchByUniqeIdAndNameAndOriginCountry in ProductStore");
		if(this.products!=null && name!=null && originCountry!=null)
		{
			boolean found=false;
			for(Product prdct:this.products)
			{
				if(prdct!=null)
				{
					if(unqId==prdct.uniqueId && name.equalsIgnoreCase(prdct.name) && originCountry.equalsIgnoreCase(prdct.originCountry))
					{
						System.out.println("product found!!");
						found=true;
						break;
					}
				}
			}
			if(!found)
			{
				System.out.println(unqId+" and "+name+" and "+originCountry+" not found!!");
			}
		}
		else
		{
			System.out.println("products array should not be null");
		}
	}
	
	void getAllOriginCountry()
	{
		System.out.println("----------------------------------------");
		System.out.println("executing getAllOriginCountry in ProductStore");
		if(this.products!=null)
		{
			for(Product prdct:this.products)
			{
				if(prdct!=null)
				{
					System.out.println(prdct.originCountry.toLowerCase());
				}
			}
		}
		else
		{
			System.out.println("products array should not be null");
		}
	}
}