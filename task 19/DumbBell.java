class DumbBell
{
	String brand;
	String material;
	String color;
	String type;
	String gripType;
	String coating;
	String shape;
	String usage;
	String manufacturer;
	String country;
	int weight;
	int length;
	int diameter;
	int manufacturingYear;
	boolean isAdjustable;
	double price;
	String suitableFor;
	String warranty;
	String packageIncludes;
	boolean isAvailable;

	DumbBell(String brand,
	String material,
	String color,
	String type,
	String gripType,
	String coating,
	String shape,
	String usage,
	String manufacturer,
	String country,
	int weight,
	int length,
	int diameter,
	int manufacturingYear,
	boolean isAdjustable,
	double price,
	String suitableFor,
	String warranty,
	String packageIncludes,
	boolean isAvailable)
	{
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.type = type;
		this.gripType = gripType;
		this.coating = coating;
		this.shape = shape;
		this.usage = usage;
		this.manufacturer = manufacturer;
		this.country = country;
		this.weight = weight;
		this.length = length;
		this.diameter = diameter;
		this.manufacturingYear = manufacturingYear;
		this.isAdjustable = isAdjustable;
		this.price = price;
		this.suitableFor = suitableFor;
		this.warranty = warranty;
		this.packageIncludes = packageIncludes;
		this.isAvailable = isAvailable;
	}

	void show()
	{
		System.out.println("brand: " + this.brand);
		System.out.println("material: " + this.material);
		System.out.println("color: " + this.color);
		System.out.println("type: " + this.type);
		System.out.println("grip type: " + this.gripType);
		System.out.println("coating: " + this.coating);
		System.out.println("shape: " + this.shape);
		System.out.println("usage: " + this.usage);
		System.out.println("manufacturer: " + this.manufacturer);
		System.out.println("country: " + this.country);
		System.out.println("weight (kg): " + this.weight);
		System.out.println("length (cm): " + this.length);
		System.out.println("diameter (cm): " + this.diameter);
		System.out.println("manufacturing year: " + this.manufacturingYear);
		System.out.println("is adjustable: " + this.isAdjustable);
		System.out.println("price: " + this.price);
		System.out.println("suitable for: " + this.suitableFor);
		System.out.println("warranty: " + this.warranty);
		System.out.println("package includes: " + this.packageIncludes);
		System.out.println("is available: " + this.isAvailable);
	}
}