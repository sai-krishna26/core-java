class Pepper
{
	String type;
	String colour;
	String originCountry;
	int spiceLevel;
	double weight;
	double price;
	boolean isOrganic;
	String brandName;
	int packSize;
	String expiryDate;
	String flavor;
	boolean isGround;
	boolean isWhole;
	String packagingType;
	String supplierName;
	String manufacturerName;
	int manufacturingYear;
	String qualityGrade;
	boolean isAvailable;
	String storageInstruction;
	
	Pepper(String type,
	String colour,
	String originCountry,
	int spiceLevel,
	double weight,
	double price,
	boolean isOrganic,
	String brandName,
	int packSize,
	String expiryDate,
	String flavor,
	boolean isGround,
	boolean isWhole,
	String packagingType,
	String supplierName,
	String manufacturerName,
	int manufacturingYear,
	String qualityGrade,
	boolean isAvailable,
	String storageInstruction)
	{
		this.type = type;
		this.colour = colour;
		this.originCountry = originCountry;
		this.spiceLevel = spiceLevel;
		this.weight = weight;
		this.price = price;
		this.isOrganic = isOrganic;
		this.brandName = brandName;
		this.packSize = packSize;
		this.expiryDate = expiryDate;
		this.flavor = flavor;
		this.isGround = isGround;
		this.isWhole = isWhole;
		this.packagingType = packagingType;
		this.supplierName = supplierName;
		this.manufacturerName = manufacturerName;
		this.manufacturingYear = manufacturingYear;
		this.qualityGrade = qualityGrade;
		this.isAvailable = isAvailable;
		this.storageInstruction = storageInstruction;
	}
	
	void show()
	{
		System.out.println("type: " + this.type);
		System.out.println("colour: " + this.colour);
		System.out.println("origin country: " + this.originCountry);
		System.out.println("spice level: " + this.spiceLevel);
		System.out.println("weight: " + this.weight);
		System.out.println("price: " + this.price);
		System.out.println("is organic: " + this.isOrganic);
		System.out.println("brand name: " + this.brandName);
		System.out.println("pack size: " + this.packSize);
		System.out.println("expiry date: " + this.expiryDate);
		System.out.println("flavor: " + this.flavor);
		System.out.println("is ground: " + this.isGround);
		System.out.println("is whole: " + this.isWhole);
		System.out.println("packaging type: " + this.packagingType);
		System.out.println("supplier name: " + this.supplierName);
		System.out.println("manufacturer name: " + this.manufacturerName);
		System.out.println("manufacturing year: " + this.manufacturingYear);
		System.out.println("quality grade: " + this.qualityGrade);
		System.out.println("is available: " + this.isAvailable);
		System.out.println("storage instruction: " + this.storageInstruction);
	}
}