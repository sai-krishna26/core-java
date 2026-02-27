class Map
{
	String type;
	String region;
	String scale;
	String language;
	String publisher;
	int length;
	int width;
	int publishedYear;
	boolean isLaminated;
	double price;
	String cartographerName;
	String printingType;
	int editionNumber;
	String material;
	boolean isWaterProof;
	boolean isFoldable;
	String theme;
	String projectionType;
	String shape;
	boolean isAvailable;

	Map(String type,
	String region,
	String scale,
	String language,
	String publisher,
	int length,
	int width,
	int publishedYear,
	boolean isLaminated,
	double price,
	String cartographerName,
	String printingType,
	int editionNumber,
	String material,
	boolean isWaterProof,
	boolean isFoldable,
	String theme,
	String projectionType,
	String shape,
	boolean isAvailable)
	{
		this.type = type;
		this.region = region;
		this.scale = scale;
		this.language = language;
		this.publisher = publisher;
		this.length = length;
		this.width = width;
		this.publishedYear = publishedYear;
		this.isLaminated = isLaminated;
		this.price = price;
		this.cartographerName = cartographerName;
		this.printingType = printingType;
		this.editionNumber = editionNumber;
		this.material = material;
		this.isWaterProof = isWaterProof;
		this.isFoldable = isFoldable;
		this.theme = theme;
		this.projectionType = projectionType;
		this.shape = shape;
		this.isAvailable = isAvailable;
	}

	void show()
	{
		System.out.println("type: " + this.type);
		System.out.println("region: " + this.region);
		System.out.println("scale: " + this.scale);
		System.out.println("language: " + this.language);
		System.out.println("publisher: " + this.publisher);
		System.out.println("length: " + this.length);
		System.out.println("width: " + this.width);
		System.out.println("published year: " + this.publishedYear);
		System.out.println("is laminated: " + this.isLaminated);
		System.out.println("price: " + this.price);
		System.out.println("cartographer name: " + this.cartographerName);
		System.out.println("printing type: " + this.printingType);
		System.out.println("edition number: " + this.editionNumber);
		System.out.println("material: " + this.material);
		System.out.println("is water proof: " + this.isWaterProof);
		System.out.println("is foldable: " + this.isFoldable);
		System.out.println("theme: " + this.theme);
		System.out.println("projection type: " + this.projectionType);
		System.out.println("shape: " + this.shape);
		System.out.println("is available: " + this.isAvailable);
	}
}