class Paper
{
	String type;
	String size;
	String colour;
	String brand;
	String texture;
	int gsm;
	int length;
	int width;
	boolean isRecyclable;
	double price;
	String manufacturer;
	String supplier;
	int manufacturedYear;
	String qualityGrade;
	boolean isWaterProof;
	boolean isEcoFriendly;
	String usageType;
	String packagingType;
	String shape;
	boolean isAvailable;
	
	Paper(String type,
	String size,
	String colour,
	String brand,
	String texture,
	int gsm,
	int length,
	int width,
	boolean isRecyclable,
	double price,
	String manufacturer,
	String supplier,
	int manufacturedYear,
	String qualityGrade,
	boolean isWaterProof,
	boolean isEcoFriendly,
	String usageType,
	String packagingType,
	String shape,
	boolean isAvailable)
	{
		this.type=type;
		this.size=size;
		this.colour=colour;
		this.brand=brand;
		this.texture=texture;
		this.gsm=gsm;
		this.length=length;
		this.width=width;
		this.isRecyclable=isRecyclable;
		this.price=price;
		this.manufacturer=manufacturer;
		this.supplier = supplier;
		this.manufacturedYear = manufacturedYear;
		this.qualityGrade = qualityGrade;
		this.isWaterProof = isWaterProof;
		this.isEcoFriendly = isEcoFriendly;
		this.usageType = usageType;
		this.packagingType = packagingType;
		this.shape = shape;
		this.isAvailable = isAvailable;
	}
	
	void show()
	{
		System.out.println("type: " + this.type);
		System.out.println("size: " + this.size);
		System.out.println("colour: " + this.colour);
		System.out.println("brand: " + this.brand);
		System.out.println("texture: " + this.texture);
		System.out.println("gsm: " + this.gsm);
		System.out.println("length: " + this.length);
		System.out.println("width: " + this.width);
		System.out.println("is recyclable: " + this.isRecyclable);
		System.out.println("price: " + this.price);
		System.out.println("manufacturer: " + this.manufacturer);
		System.out.println("supplier: " + this.supplier);
		System.out.println("manufactured year: " + this.manufacturedYear);
		System.out.println("quality grade: " + this.qualityGrade);
		System.out.println("is water proof: " + this.isWaterProof);
		System.out.println("is eco friendly: " + this.isEcoFriendly);
		System.out.println("usage type: " + this.usageType);
		System.out.println("packaging type: " + this.packagingType);
		System.out.println("shape: " + this.shape);
		System.out.println("is available: " + this.isAvailable);
	}
}