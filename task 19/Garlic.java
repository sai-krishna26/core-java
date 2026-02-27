class Garlic
{
	String type;
	String originCountry;
	String colour;
	String size;
	String grade;
	int quantity;
	int clovesCount;
	int shelfLifeDays;
	boolean isOrganic;
	double price;
	String farmerName;
	String supplierName;
	int harvestedYear;
	String packagingType;
	boolean isExportQuality;
	boolean isPeeled;
	String storageType;
	String brandName;
	String shape;
	boolean isAvailable;

	Garlic(String type,
	String originCountry,
	String colour,
	String size,
	String grade,
	int quantity,
	int clovesCount,
	int shelfLifeDays,
	boolean isOrganic,
	double price,
	String farmerName,
	String supplierName,
	int harvestedYear,
	String packagingType,
	boolean isExportQuality,
	boolean isPeeled,
	String storageType,
	String brandName,
	String shape,
	boolean isAvailable)
	{
		this.type = type;
		this.originCountry = originCountry;
		this.colour = colour;
		this.size = size;
		this.grade = grade;
		this.quantity = quantity;
		this.clovesCount = clovesCount;
		this.shelfLifeDays = shelfLifeDays;
		this.isOrganic = isOrganic;
		this.price = price;
		this.farmerName = farmerName;
		this.supplierName = supplierName;
		this.harvestedYear = harvestedYear;
		this.packagingType = packagingType;
		this.isExportQuality = isExportQuality;
		this.isPeeled = isPeeled;
		this.storageType = storageType;
		this.brandName = brandName;
		this.shape = shape;
		this.isAvailable = isAvailable;
	}

	void show()
	{
		System.out.println("type: " + this.type);
		System.out.println("origin country: " + this.originCountry);
		System.out.println("colour: " + this.colour);
		System.out.println("size: " + this.size);
		System.out.println("grade: " + this.grade);
		System.out.println("quantity: " + this.quantity);
		System.out.println("cloves count: " + this.clovesCount);
		System.out.println("shelf life days: " + this.shelfLifeDays);
		System.out.println("is organic: " + this.isOrganic);
		System.out.println("price: " + this.price);
		System.out.println("farmer name: " + this.farmerName);
		System.out.println("supplier name: " + this.supplierName);
		System.out.println("harvested year: " + this.harvestedYear);
		System.out.println("packaging type: " + this.packagingType);
		System.out.println("is export quality: " + this.isExportQuality);
		System.out.println("is peeled: " + this.isPeeled);
		System.out.println("storage type: " + this.storageType);
		System.out.println("brand name: " + this.brandName);
		System.out.println("shape: " + this.shape);
		System.out.println("is available: " + this.isAvailable);
	}
}