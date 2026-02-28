class Conditioner
{
	String brand;
	String variant;
	String hairType;
	String fragrance;
	String color;
	String mainIngredient;
	String manufacturer;
	String country;
	String suitableFor;
	String packagingType;
	int quantity;
	int manufacturingYear;
	int expiryYear;
	int phLevel;
	boolean isHerbal;
	double price;
	String bottleType;
	String usageType;
	String texture;
	boolean isAvailable;

	Conditioner(String brand,
	String variant,
	String hairType,
	String fragrance,
	String color,
	String mainIngredient,
	String manufacturer,
	String country,
	String suitableFor,
	String packagingType,
	int quantity,
	int manufacturingYear,
	int expiryYear,
	int phLevel,
	boolean isHerbal,
	double price,
	String bottleType,
	String usageType,
	String texture,
	boolean isAvailable)
	{
		this.brand = brand;
		this.variant = variant;
		this.hairType = hairType;
		this.fragrance = fragrance;
		this.color = color;
		this.mainIngredient = mainIngredient;
		this.manufacturer = manufacturer;
		this.country = country;
		this.suitableFor = suitableFor;
		this.packagingType = packagingType;
		this.quantity = quantity;
		this.manufacturingYear = manufacturingYear;
		this.expiryYear = expiryYear;
		this.phLevel = phLevel;
		this.isHerbal = isHerbal;
		this.price = price;
		this.bottleType = bottleType;
		this.usageType = usageType;
		this.texture = texture;
		this.isAvailable = isAvailable;
	}

	void show()
	{
		System.out.println("brand: " + this.brand);
		System.out.println("variant: " + this.variant);
		System.out.println("hair type: " + this.hairType);
		System.out.println("fragrance: " + this.fragrance);
		System.out.println("color: " + this.color);
		System.out.println("main ingredient: " + this.mainIngredient);
		System.out.println("manufacturer: " + this.manufacturer);
		System.out.println("country: " + this.country);
		System.out.println("suitable for: " + this.suitableFor);
		System.out.println("packaging type: " + this.packagingType);
		System.out.println("quantity (ml): " + this.quantity);
		System.out.println("manufacturing year: " + this.manufacturingYear);
		System.out.println("expiry year: " + this.expiryYear);
		System.out.println("ph level: " + this.phLevel);
		System.out.println("is herbal: " + this.isHerbal);
		System.out.println("price: " + this.price);
		System.out.println("bottle type: " + this.bottleType);
		System.out.println("usage type: " + this.usageType);
		System.out.println("texture: " + this.texture);
		System.out.println("is available: " + this.isAvailable);
	}
}