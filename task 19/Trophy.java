class Trophy
{
	String trophyName;
	String material;
	String color;
	String shape;
	String eventName;
	String winnerName;
	String category;
	String sponsor;
	String manufacturer;
	String country;
	int height;
	int weight;
	int year;
	int editionNumber;
	boolean isGoldPlated;
	double price;
	String designedBy;
	String engravingText;
	String occasion;
	boolean isLimitedEdition;

	Trophy(String trophyName,
	String material,
	String color,
	String shape,
	String eventName,
	String winnerName,
	String category,
	String sponsor,
	String manufacturer,
	String country,
	int height,
	int weight,
	int year,
	int editionNumber,
	boolean isGoldPlated,
	double price,
	String designedBy,
	String engravingText,
	String occasion,
	boolean isLimitedEdition)
	{
		this.trophyName = trophyName;
		this.material = material;
		this.color = color;
		this.shape = shape;
		this.eventName = eventName;
		this.winnerName = winnerName;
		this.category = category;
		this.sponsor = sponsor;
		this.manufacturer = manufacturer;
		this.country = country;
		this.height = height;
		this.weight = weight;
		this.year = year;
		this.editionNumber = editionNumber;
		this.isGoldPlated = isGoldPlated;
		this.price = price;
		this.designedBy = designedBy;
		this.engravingText = engravingText;
		this.occasion = occasion;
		this.isLimitedEdition = isLimitedEdition;
	}

	void show()
	{
		System.out.println("trophy name: " + this.trophyName);
		System.out.println("material: " + this.material);
		System.out.println("color: " + this.color);
		System.out.println("shape: " + this.shape);
		System.out.println("event name: " + this.eventName);
		System.out.println("winner name: " + this.winnerName);
		System.out.println("category: " + this.category);
		System.out.println("sponsor: " + this.sponsor);
		System.out.println("manufacturer: " + this.manufacturer);
		System.out.println("country: " + this.country);
		System.out.println("height: " + this.height);
		System.out.println("weight: " + this.weight);
		System.out.println("year: " + this.year);
		System.out.println("edition number: " + this.editionNumber);
		System.out.println("is gold plated: " + this.isGoldPlated);
		System.out.println("price: " + this.price);
		System.out.println("designed by: " + this.designedBy);
		System.out.println("engraving text: " + this.engravingText);
		System.out.println("occasion: " + this.occasion);
		System.out.println("is limited edition: " + this.isLimitedEdition);
	}
}