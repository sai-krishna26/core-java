class InverntoryManagement
{
	int productId;
	String productName;
	int currentStock;
	double dailySalesRate;
	double unitPrice;
	String leadTimeDays;
	boolean isSeasonal;
	static int totalInventoryValue;
	static int totalProductsTracked;
	int workingDays=7;
	
	InverntoryManagement(int productId,String productName,
	int currentStock,
	double dailySalesRate,
	double unitPrice,
	String leadTimeDays,
	boolean isSeasonal)
	{
		this.productId=productId;
		this.productName=productName;
		this.currentStock=currentStock;
		this.dailySalesRate=dailySalesRate;
		this.unitPrice=unitPrice;
		this.leadTimeDays=leadTimeDays;
		this.isSeasonal=isSeasonal;
		this.totalInventoryValue+=currentStock*unitPrice;	
	}
	
	
	
	
	static double getAverageInventoryValue()
	{
		return totalInventoryValue/totalProductsTracked;
	}

	int calculateReorderPoint()
	{
		int baseReoderPoint=dailySalesRate*leadTimeDays*1.5;
		return baseReoderPoint;
	}
	
	while(workingDays>7)
	{
		if(currentStock>0)
		{
			
		}
		return unitPrice*unitSold;
	}
	
	void restock(int unitsReceived)
	{
		this.currentStock=unitsReceived;
		this.totalInventoryValue=unitsReceived*unitPrice;
		System.out.println("restocked:"+unitsReceived+"units of: "+productName);
	}
}