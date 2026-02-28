class Organizer
{
	String brand;
	String type;
	String material;
	String color;
	String shape;
	String usage;
	String suitableFor;
	String manufacturer;
	String country;
	String compartmentType;
	int numberOfCompartments;
	int manufacturingYear;
	int warrantyYears;
	int weight;
	boolean isPortable;
	double price;
	String sizeCategory;
	String lockingSystem;
	String surfaceFinish;
	boolean isAvailable;

	Organizer(String brand,
	String type,
	String material,
	String color,
	String shape,
	String usage,
	String suitableFor,
	String manufacturer,
	String country,
	String compartmentType,
	int numberOfCompartments,
	int manufacturingYear,
	int warrantyYears,
	int weight,
	boolean isPortable,
	double price,
	String sizeCategory,
	String lockingSystem,
	String surfaceFinish,
	boolean isAvailable)
	{
		this.brand = brand;
		this.type = type;
		this.material = material;
		this.color = color;
		this.shape = shape;
		this.usage = usage;
		this.suitableFor = suitableFor;
		this.manufacturer = manufacturer;
		this.country = country;
		this.compartmentType = compartmentType;
		this.numberOfCompartments = numberOfCompartments;
		this.manufacturingYear = manufacturingYear;
		this.warrantyYears = warrantyYears;
		this.weight = weight;
		this.isPortable = isPortable;
		this.price = price;
		this.sizeCategory = sizeCategory;
		this.lockingSystem = lockingSystem;
		this.surfaceFinish = surfaceFinish;
		this.isAvailable = isAvailable;
	}

	void show()
	{
		System.out.println("brand: " + this.brand);
		System.out.println("type: " + this.type);
		System.out.println("material: " + this.material);
		System.out.println("color: " + this.color);
		System.out.println("shape: " + this.shape);
		System.out.println("usage: " + this.usage);
		System.out.println("suitable for: " + this.suitableFor);
		System.out.println("manufacturer: " + this.manufacturer);
		System.out.println("country: " + this.country);
		System.out.println("compartment type: " + this.compartmentType);
		System.out.println("number of compartments: " + this.numberOfCompartments);
		System.out.println("manufacturing year: " + this.manufacturingYear);
		System.out.println("warranty years: " + this.warrantyYears);
		System.out.println("weight (grams): " + this.weight);
		System.out.println("is portable: " + this.isPortable);
		System.out.println("price: " + this.price);
		System.out.println("size category: " + this.sizeCategory);
		System.out.println("locking system: " + this.lockingSystem);
		System.out.println("surface finish: " + this.surfaceFinish);
		System.out.println("is available: " + this.isAvailable);
	}
}