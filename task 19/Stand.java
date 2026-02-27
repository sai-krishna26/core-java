class Stand
{
	String type;
	String material;
	String colour;
	String brand;
	String usageType;
	int height;
	int width;
	int weightCapacity;
	boolean isFoldable;
	double price;
	String manufacturerName;
	String supplierName;
	int manufacturedYear;
	String qualityGrade;
	boolean isAdjustable;
	boolean isPortable;
	String shape;
	String designStyle;
	String warrantyPeriod;
	boolean isAvailable;

	Stand(String type,
	String material,
	String colour,
	String brand,
	String usageType,
	int height,
	int width,
	int weightCapacity,
	boolean isFoldable,
	double price,
	String manufacturerName,
	String supplierName,
	int manufacturedYear,
	String qualityGrade,
	boolean isAdjustable,
	boolean isPortable,
	String shape,
	String designStyle,
	String warrantyPeriod,
	boolean isAvailable)
	{
		this.type = type;
		this.material = material;
		this.colour = colour;
		this.brand = brand;
		this.usageType = usageType;
		this.height = height;
		this.width = width;
		this.weightCapacity = weightCapacity;
		this.isFoldable = isFoldable;
		this.price = price;
		this.manufacturerName = manufacturerName;
		this.supplierName = supplierName;
		this.manufacturedYear = manufacturedYear;
		this.qualityGrade = qualityGrade;
		this.isAdjustable = isAdjustable;
		this.isPortable = isPortable;
		this.shape = shape;
		this.designStyle = designStyle;
		this.warrantyPeriod = warrantyPeriod;
		this.isAvailable = isAvailable;
	}

	void show()
	{
		System.out.println("type: " + this.type);
		System.out.println("material: " + this.material);
		System.out.println("colour: " + this.colour);
		System.out.println("brand: " + this.brand);
		System.out.println("usage type: " + this.usageType);
		System.out.println("height: " + this.height);
		System.out.println("width: " + this.width);
		System.out.println("weight capacity: " + this.weightCapacity);
		System.out.println("is foldable: " + this.isFoldable);
		System.out.println("price: " + this.price);
		System.out.println("manufacturer name: " + this.manufacturerName);
		System.out.println("supplier name: " + this.supplierName);
		System.out.println("manufactured year: " + this.manufacturedYear);
		System.out.println("quality grade: " + this.qualityGrade);
		System.out.println("is adjustable: " + this.isAdjustable);
		System.out.println("is portable: " + this.isPortable);
		System.out.println("shape: " + this.shape);
		System.out.println("design style: " + this.designStyle);
		System.out.println("warranty period: " + this.warrantyPeriod);
		System.out.println("is available: " + this.isAvailable);
	}
}