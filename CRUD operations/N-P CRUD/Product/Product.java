class Product
{
	String name;
	String inventor;
	String mfgDate;
	double cost;
	Type types;
	String seller;
	WarrantyYears years;
	boolean warrantyExpired;
	int uniqueId;
	String originCountry;
	
	Product(String name,String inventor,String mfgDate,double cost,Type types,String seller,WarrantyYears years,boolean warrantyExpired,int uniqueId,String originCountry)
	{
		this.name=name;
		this.inventor=inventor;
		this.mfgDate=mfgDate;
		this.cost=cost;
		this.types=types;
		this.seller=seller;
		this.years=years;
		this.warrantyExpired=warrantyExpired;
		this.uniqueId=uniqueId;
		this.originCountry=originCountry;
	}
	
	void showProduct()
	{
		System.out.println("----------------------------------------");
		System.out.println("executing showProduct in Product");
		System.out.println("name: "+this.name);
		System.out.println("inventor: "+this.inventor);
		System.out.println("mfgDate: "+this.mfgDate);
		System.out.println("cost: "+this.cost);
		System.out.println("types: "+this.types);
		System.out.println("seller: "+this.seller);
		System.out.println("warranty years: "+this.years);
		System.out.println("warrantyExpired: "+this.warrantyExpired);
		System.out.println("uniqueId: "+this.uniqueId);
		System.out.println("originCountry: "+this.originCountry);
	}
}